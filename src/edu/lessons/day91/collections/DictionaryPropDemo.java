package edu.lessons.day91.collections;
import java.util.Properties;
import java.util.Set;
import java.util.Iterator;
class DictionaryPropDemo {
  public static void main(String args[])
  {
    Properties capitals = new Properties();
    Set<Object> states;
    String str;
    capitals.put("Illinois", "Springfield");
    capitals.put("Florida", "Tallahassee");
    capitals.put("Missouri", "Jefferson City");
    capitals.put("Washington", "Olympia");
    capitals.put("California", "Sacramento");
    capitals.put("Indiana", "Indianapolis");
    states = capitals.keySet(); // get set-view of keys
    Iterator<Object> itr = states.iterator();
    while(itr.hasNext())
    {
      str = (String) itr.next();
      System.out.println("The capital of " +
             str + " is " +capitals.getProperty(str)+ ".");
    }
 // look for state not in list -- specify default
    str = capitals.getProperty("Florida", "Not Found");
    //str = capitals.getProperty("Florida");
    System.out.println("The capital of Florida is "+ str);
  }
}
