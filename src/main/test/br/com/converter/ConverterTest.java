package br.com.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ConverterTest {
	Converter converter = new Converter();

	@Test
	public void should_understand_simbol_I() throws Exception {
		assertEquals(1, converter.convert("I"));
	}
	
	@Test
	public void should_understand_simbol_V() throws Exception {
		assertEquals(5, converter.convert("V"));
	}
	
	@Test
	public void should_understand_simbol_X() throws Exception {
		assertEquals(10, converter.convert("X"));
	}
	
	@Test
	public void should_understand_simbol_L() throws Exception {
		assertEquals(50, converter.convert("L"));
	}
	
	@Test
	public void should_understand_simbol_C() throws Exception {
		assertEquals(100, converter.convert("C"));
	}
	
	@Test
	public void should_understand_simbol_D() throws Exception {
		assertEquals(500, converter.convert("D"));
	}
	
	@Test
	public void should_understand_simbol_M() throws Exception {
		assertEquals(1000, converter.convert("M"));
	}
	
	@Test
	public void should_understand_simbol_II() throws Exception {
		assertEquals(2, converter.convert("II"));
	}
	
	@Test
	public void should_understand_simbol_III() throws Exception {
		assertEquals(3, converter.convert("III"));
	}
	
	@Test
	public void should_understand_simbol_XXII() throws Exception {
		assertEquals(22, converter.convert("XXII"));
	}
	
	@Test
	public void should_understand_simbol_IX() throws Exception {
		assertEquals(9, converter.convert("IX"));
	}
	
	@Test
	public void should_understand_simbol_XXIV() throws Exception {
		assertEquals(24, converter.convert("XXIV"));
	}
	
	@Test
	public void should_throw_error_simbol_IIII() {
		assertThrows(Exception.class, () -> {
			converter.convert("IIII");
		});
	}
	
}
