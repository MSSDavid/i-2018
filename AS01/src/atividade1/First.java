package atividade1;

/**
 *
 * @author david
 */
import java.io.*;

public class First {

	public static void main (String[] args) throws IOException{
	    FileInputStream entrada = new FileInputStream(args[0]);
	    InputStreamReader entradaFormatada = new InputStreamReader(entrada);
	    int c = entradaFormatada.read();

            System.out.println(String.format("%X", c));            
            
	}
        
        

}
