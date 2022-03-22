package edu.lessons.day33.searching;

/**
 * Implements Newton's method to find a zero of a given polynomial.
 * 
 * @author pape
 */
public class NewtonsMethod {

	private Polynomial polynomial;

	/**
	 * the first derivation of the <code>polynomial</code>
	 */
	private Polynomial firstDerivation;
	
	/**
	 * Creates a new NewtonsMethod to find a zero for
	 * the given polynomial.
	 */
	public NewtonsMethod(Polynomial polynomial) {
		this.polynomial = polynomial;
		this.firstDerivation = polynomial.getFirstDerivation();
	}
	
	
	/**
	 * Searches and returns an approximation of a zero with Newton's method.
	 * <code>epsilon</code> specifies the accuracy of the approximation.
	 * This method may not terminate for every x and polynomial.
	 */
	public double getZero(double x, final double epsilon) {
		double nextX = x;
		
		do {
			x = nextX;
			nextX = x - polynomial.f(x) / firstDerivation.f(x);
		} while ( Math.abs(polynomial.f(nextX)) > epsilon);
		
		return nextX;
	}
}
	
