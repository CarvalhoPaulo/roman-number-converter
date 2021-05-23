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

	public int convert(String romanNumber) throws Exception {
		validate(romanNumber);
		return calculate(romanNumber);
	}

	private int calculate(String romanNumber) {
		int result = 0;
		
		int lastAtRight = 0;
		for (int i = romanNumber.length() - 1; i > -1; i--) {
			Character c = romanNumber.charAt(i);
			
			int multiplicator = 1;
			int actual = table.get(c);
			if (actual < lastAtRight) multiplicator = -1;
			
			result += actual * multiplicator;
			
			lastAtRight = actual;
		}
		return result;
	}

	private void validate(String romanNumber) throws Exception {
		int repetition = 1;
		Character lastChar = null;
		for (Character c : romanNumber.toCharArray()) {
			if (lastChar == c) {
				repetition++;
			}
			if (repetition > 3) {
				throw new Exception("Invalid roman number");
			}
			lastChar = c;
		}
	}

}
