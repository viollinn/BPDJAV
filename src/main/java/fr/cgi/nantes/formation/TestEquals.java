package fr.cgi.nantes.formation;

/**
 * TestEquals
 *
 */
public class TestEquals{

  public static void main( String[] args ){
        
    Integer i = Integer.valueOf(42);
    String valeur = "42";
    if (i.equals(valeur)) {
      
      System.out.println("Dans le traitement puisque identique");

    }else{

      System.out.println("Pas dans le traitement puisque différent");
    }

  }
}
