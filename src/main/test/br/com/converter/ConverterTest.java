package br.com.converter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.converter.Converter;

public class ConverterTest {

	@Test
	public void should_understand_simbol_I() {
		Converter converter = new Converter();
		int number = converter.convert("I");
		assertEquals(1, number);
	}
	
	@Test
	public void should_understand_simbol_V() {
		Converter converter = new Converter();
		int number = converter.convert("V");
		assertEquals(5, number);
	}
	
	@Test
	public void should_understand_simbol_X() {
		Converter converter = new Converter();
		int number = converter.convert("X");
		assertEquals(10, number);
	}
	
	@Test
	public void should_understand_simbol_L() {
		Converter converter = new Converter();
		int number = converter.convert("L");
		assertEquals(50, number);
	}
	
	@Test
	public void should_understand_simbol_C() {
		Converter converter = new Converter();
		int number = converter.convert("C");
		assertEquals(100, number);
	}
	
	@Test
	public void should_understand_simbol_D() {
		Converter converter = new Converter();
		int number = converter.convert("D");
		assertEquals(500, number);
	}
	
	@Test
	public void should_understand_simbol_M() {
		Converter converter = new Converter();
		int number = converter.convert("M");
		assertEquals(1000, number);
	}
	
	@Test
	public void should_understand_simbol_II() {
		Converter converter = new Converter();
		int number = converter.convert("II");
		assertEquals(2, number);
	}
	
	@Test
	public void should_understand_simbol_XXII() {
		Converter converter = new Converter();
		int number = converter.convert("XXII");
		assertEquals(22, number);
	}
	
	@Test
	public void should_understand_simbol_IX() {
		Converter converter = new Converter();
		int number = converter.convert("IX");
		assertEquals(9, number);
	}
	
	@Test
	public void should_understand_simbol_XXIV() {
		Converter converter = new Converter();
		int number = converter.convert("XXIV");
		assertEquals(24, number);
	}
}
