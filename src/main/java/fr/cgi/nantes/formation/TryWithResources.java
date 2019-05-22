package fr.cgi.nantes.formation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TestEquals
 *
 */
public class TryWithResources{

  public static void main( String[] args ){
    
    new TryWithResources();
  }

  public TryWithResources() {

    Properties props = new Properties();
    try(InputStream is = this.getClass().getResourceAsStream("fichier.properties")){

      props.load(is);

    }catch (IOException ex){

      ex.printStackTrace();
      
    }

  }
}
