package edu.lessons.day32.misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import edu.lessons.day34.compare.ChemicalElement;

/**
 * The periodic system for chemical elements.
 * It is a singleton. Use  {@link #getPeriodicTable()} to get the single instance
 * of this class. The data of the chemical elements is taken from a text file.
 * 
 * @author pape
 */
public class PeriodicTable {

    private ChemicalElement [] [] chemicalElements = new ChemicalElement[8][19];

    /**
     * The name of the text file with all chemical elements given as comma seperated values.
     * Ths file ({@value}) must be located in the root directory the Java project.
     */
    private static final String PERIODIC_SYSTEM_FILE_NAME = "periodensystem.csv";
    
    private static PeriodicTable periodicTable = new PeriodicTable();
    
    /**
     * Retruns the single instance of the periodic table.
     */
    public static PeriodicTable getPeriodicTable() {
        return periodicTable;
    }
    
    /**
     * Creates a new periodic table with date from the text file.
     * If an IOException occurs the then the table is <code>null</code>.
     */
    private PeriodicTable()  {
        try {
            loadChemicalElements();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadChemicalElements() throws IOException {
        BufferedReader bufferedReader = null;
        try {
           bufferedReader = new BufferedReader(new FileReader(PERIODIC_SYSTEM_FILE_NAME));
           
           // Example of one text line: 79,Gold (Aurum),Au,11,6
           while ( bufferedReader.ready()) {
               String element = bufferedReader.readLine();
               String [] elementValues = element.split(",");
               chemicalElements[Integer.valueOf(elementValues[4])][Integer.valueOf(elementValues[3])] 
                   = new ChemicalElement(elementValues[2], Integer.valueOf(elementValues[0]));
           }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        
    }
    
    /**
     * Returns the chemical element for the given period (1 to 7)
     * and group (1 to 18). If no such element exists, then null is returend.
     */
    public ChemicalElement getChemicalElement(int period, int group) {
        return chemicalElements[period][group];
    }

}
