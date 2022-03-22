package edu.lessons.day32.misc;

/**
 * Implements getDezimalWert() with 
 * switch. 
 * 
 * @author pape
 */
public class HexadecimalDigitSwitch extends AbstractHexadecimalDigit {
	
	public int getDecimalValue() {
		switch (digit) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': return digit - '0';
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f': return digit - 'a' + 10;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F': return digit - 'A' + 10;
		default: return -1;
		}
	}

}
