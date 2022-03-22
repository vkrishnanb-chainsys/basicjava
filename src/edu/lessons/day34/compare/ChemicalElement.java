package edu.lessons.day34.compare;

/**
 * A chemical element with symbolic name, atomic number, and its
 * electronegativity.
 * 
 * @author pape
 */
public class ChemicalElement implements Comparable {

    private String symbol = "";
    
    private int atomicNumber = 1;
    
    /**
     * this value measures the affinity to bind an electron
     */
    private double electronegativity;
    
    public static final ChemicalElement HYDROGEN = new ChemicalElement("H", 1, 2.20);

    public static final ChemicalElement OXYGEN = new ChemicalElement("O", 8, 3.44);

    public static final ChemicalElement POTASSIUM = new ChemicalElement("K", 19, 0.82);
    
    public static final ChemicalElement ZINC = new ChemicalElement("Zn", 30, 1.65);
    
    public static final ChemicalElement GALLIUM = new ChemicalElement("Ga", 31, 1.81);
    
    private static boolean [] alkaliMetal = new boolean[119];
    
    static {
        alkaliMetal[3] = true;
        alkaliMetal[11] = true;
        alkaliMetal[19] = true;
        alkaliMetal[37] = true;
        alkaliMetal[55] = true;
        alkaliMetal[85] = true;
    }
    
    /**
     * Creates a new chemical eleent with given symbolic name,
     * atomic number (number of protons), and electronegativity.
    */
    public ChemicalElement(String symbol, int atomicNumber,
            double electronegativity)  {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.electronegativity = electronegativity;
    }
    
    /**
     * Creates a new chemical element with given symbolic name,
     * atomic number, and electronegativity 0.
     */
    public ChemicalElement(String symbol, int electronegativity) {
        this(symbol, electronegativity, 0);
    }
    
    /**
     * Returns true if and only if this chemical element is a metal.
     */
    public boolean isMetal() {
        boolean metal = false;
        
        switch (atomicNumber) {
        case 13:
        case 31:
        case 49:
        case 50:
        case 81:
        case 82:
        case 83:
        case 113:
        case 114:
        case 115:
        case 116: metal = true;
        }
        return metal;
    }
    /**
     * Returns true if and only if this chemical element is
     * an alkali metal.
     */
    public boolean isAlkaliMetal() {
    	// This is the fastes implementation variant.
    	// The maintainability is a little worse than the other
    	// two implementations, because the initialization of the data
    	// is seperated from this method.
        return alkaliMetal[atomicNumber];
    }

    /**
     * Retruns true if and only if this chemical metal is 
     * a transition metal. 
     */
    public boolean isTransitionMetal() {
        return 21 <= atomicNumber && atomicNumber <= 30
            || 39 <= atomicNumber && atomicNumber <= 48
            || 72 <= atomicNumber && atomicNumber <= 80;
    }
    
    /**
     * Returns the symbolic name of this chemical element (
     * one or two first letter of its latin name).
     */
    public String getSymbol() {
        return symbol;
    }
    
    /**
     * Returns the atomic number (number of protons) of this
     * chemical element.
     */
    public int getAtomicNumber() {
        return atomicNumber;
    }
    
    public double getElectronegativity() {
        return electronegativity;
    }
    
    public String toString() {
        return getSymbol();
    }
    /**
     * Compares two chemical elements with respect to their
     * electronegativity
     */
    public int compareTo(Object o) {
        ChemicalElement element = (ChemicalElement) o;
        
        // Note: NEVER compare floating points with the identity == operatore
        if ( Math.abs(electronegativity - element.electronegativity) <= 0.000000000001) {
            return 0;
        } else if ( electronegativity < element.electronegativity) {
            return -1;
        } else {
            return 1;
        }
    }

    
 
}
