package fr.cgi.nantes.formation;

/**
 * TestEquals
 *
 */
public class TestEquals{

  public static void main( String[] args ){
        
    MonObjet obj1 = new MonObjet("age", 25);
    MonObjet obj2 = new MonObjet("age", 25);

    System.out.println("obj1 == obj2: " + (obj1 == obj2));
    System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));

    obj2 = obj1;
    System.out.println("obj1 == obj2: " + (obj1 == obj2));
    System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
  }
}
