package fr.cgi.nantes.formation;

/**
 * Hello world!
 *
 */
public class FizzBuzz 
{
    public static void main( String[] args )
    {
        int i = 0;
        do {
            
            i++;

            String out = ((((i % 3) == 0) && ((i % 5) == 0)) ? 
                "FizzBuzz" : ((i % 3) == 0) ? 
                    "Fizz" : ((i % 5) == 0) ? 
                    "Buzz" : String.valueOf(i));

            System.out.println(out);

        } while (i < 100);


    }
}
