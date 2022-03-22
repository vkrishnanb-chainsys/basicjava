package edu.lessons.day32.misc;

/**
 * Implements HexadecimalDigit with an array implementing
 * a mapping from the digits to their decimal values.
 * 
 * @author pape
 *
 */
public class HexadecimalDigitArray extends AbstractHexadecimalDigit {

	/**
	 * the mapping from the hexadecimal digits to their decimal values
	 */
	private static int [] decimalValues = new int[65536];
	
	static {
		for (int i = 0; i < decimalValues.length; i++) {
			decimalValues[i] = -1;
		}
		decimalValues['0'] = 0;
		decimalValues['1'] = 1;
		decimalValues['2'] = 2;
		decimalValues['3'] = 3;
		decimalValues['4'] = 4;
		decimalValues['5'] = 5;
		decimalValues['6'] = 6;
		decimalValues['7'] = 7;
		decimalValues['8'] = 8;
		decimalValues['9'] = 9;
		decimalValues['a'] = 10;
		decimalValues['b'] = 11;
		decimalValues['c'] = 12;
		decimalValues['d'] = 13;
		decimalValues['e'] = 14;
		decimalValues['f'] = 15;
		decimalValues['A'] = 10;
		decimalValues['B'] = 11;
		decimalValues['C'] = 12;
		decimalValues['D'] = 13;
		decimalValues['E'] = 14;
		decimalValues['F'] = 15;
	}
		
	public int getDecimalValue() {
		return decimalValues[digit];
	}

}
