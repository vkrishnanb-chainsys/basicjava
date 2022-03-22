package edu.lessons.day32.misc;

public abstract class AbstractHexadecimalDigitTest {

	protected HexadecimalDigit hexadecimalDigit;
	
	public void testGetDecimalValue0() {
		hexadecimalDigit.setDigit('0');
//		assertEquals(0, hexadecimalDigit.getDecimalValue());
	}
	
	public void testGetDecimalValue5() {
		hexadecimalDigit.setDigit('5');
//		assertEquals(5, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValue9() {
		hexadecimalDigit.setDigit('9');
//		assertEquals(9, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValuea() {
		hexadecimalDigit.setDigit('a');
//		assertEquals(10, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValuec() {
		hexadecimalDigit.setDigit('c');
//		assertEquals(12, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValuef() {
		hexadecimalDigit.setDigit('f');
//		assertEquals(15, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValueA() {
		hexadecimalDigit.setDigit('A');
//		assertEquals(10, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValueD() {
		hexadecimalDigit.setDigit('D');
//		assertEquals(13, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValueF() {
		hexadecimalDigit.setDigit('F');
//		assertEquals(15, hexadecimalDigit.getDecimalValue());
	}
	
	public void testGetDecimalValueX() {
		hexadecimalDigit.setDigit('X');
//		assertEquals(-1, hexadecimalDigit.getDecimalValue());
	}

	public void testGetDecimalValuePlus() {
		hexadecimalDigit.setDigit('+');
//		assertEquals(-1, hexadecimalDigit.getDecimalValue());
	}

}
