package br.com.converter;

import java.util.HashMap;
import java.util.Map;

public class Converter {
	
	private static Map<Character, Integer> table = new HashMap<Character, Integer>() {{
		put('I', 1);
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};

	public int convert(String romanNumber) {
		int result = 0;
		
		int lastAtRight = 0;
		for (int i = romanNumber.length() - 1; i > -1; i--) {
			Character character = romanNumber.charAt(i);
			
			int multiplicator = 1;
			int actual = table.get(character);
			if (actual < lastAtRight) multiplicator = -1;
			
			result += actual * multiplicator;
			
			lastAtRight = actual;
		}
		return result;
	}

}
