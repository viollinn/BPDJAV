package fr.cgi.nantes.formation;

/**
 * Hello world!
 *
 */
public class FizzBuzz 
{
    public static void main( String[] args )
    {
        
        boolean mod3 = false;
        boolean mod5 = false;

        for (int i = 1; i < 100; i++) {
            
            mod3 = ((i % 3) == 0);
            mod5 = ((i % 5) == 0);

            if (mod3 & mod5){
                
                System.out.println("FizzBuzz");

            }else if (mod3){

                System.out.println("Fizz");

            }else if (mod5){

                System.out.println("Buzz");

            }else{

                System.out.println(i);

            }

        }
    }
}
