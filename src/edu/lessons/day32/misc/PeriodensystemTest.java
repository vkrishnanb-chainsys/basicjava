package edu.lessons.day32.misc;

import edu.lessons.day34.compare.ChemicalElement;
public class PeriodensystemTest {

    private PeriodicTable periodicTable = PeriodicTable.getPeriodicTable();
    
    public void testGetPeriodicTable() {
//        assertTrue( PeriodicTable.getPeriodicTable() != null);
    }
    
    /**
     * 79,Gold (Aurum),Au,11,6
     */
    public void testGetChemischesElement() {
        ChemicalElement ChemicalElement = periodicTable.getChemicalElement(6, 11);
        
//        assertEquals("Au", ChemicalElement.getSymbol());
//        assertEquals(79, ChemicalElement.getAtomicNumber());
    }
    
    /**
     * 1,Hydrogen,H,1,1
     */
    public void testGetChemicalElement1() {
        ChemicalElement ChemicalElement = periodicTable.getChemicalElement(1, 1);
        
//        assertEquals("H", ChemicalElement.getSymbol());
//        assertEquals(1, ChemicalElement.getAtomicNumber());
    }

    /**
     * 118,Ununoctium,Uuo,18,7
     */
    public void testGetChemicalElement2() {
        ChemicalElement ChemicalElement = periodicTable.getChemicalElement(7, 18);
        
//        assertEquals("Uuo", ChemicalElement.getSymbol());
//        assertEquals(118, ChemicalElement.getAtomicNumber());
    }
}
