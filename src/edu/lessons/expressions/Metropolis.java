package edu.lessons.expressions;


/**
 * A <em>Metropolis</em> is a city, that is either a capital city with
 * more than 100 000 citizens, or a city with more than 200 000 citizens 
 * paying more than 720 000 000 tax per year.
 * 
 * @author pape
 */
public class Metropolis {

    /**
     * Prints out whether the city given by three variables is a metropolis or not.
     */
    public static void main(String[] args) {
        boolean isCapitalCity = true;
        int numberOfCitizens = 150000;
        double taxPerCititzen = 430.0;
        
        if ( isCapitalCity && numberOfCitizens >= 100000
                || numberOfCitizens >= 200000 
                     && taxPerCititzen * 12 * numberOfCitizens > 720000000) {
            System.out.println("City is a metroplis");
        } else  {
            System.out.println("City is not a metropolis");            
        }
    }

}
