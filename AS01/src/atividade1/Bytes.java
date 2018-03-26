package atividade1;
import java.io.*;
import java.nio.file.Files;


public class Bytes {

	public static boolean main(String[] args) throws IOException{
          
           
            byte[] array = Files.readAllBytes(new File(args[0]).toPath());  
            return(("FF".equals(String.format("%X", array[0])) & 
                    "D8".equals(String.format("%X", array[1])) &
                    "FF".equals(String.format("%X", array[array.length-2])) &
                    "D9".equals(String.format("%X", array[array.length-1])) ));
        }
}          
            
            /*
               for (int c = 0; c < 2; c++) {
                if ("FF".equals(String.format("%X", array[c]))) {
                    System.out.println("do nothing");
                }
            }
            
            

            double a = (array.length);
            System.out.println(":::::::::" + (array.length-2));
            
            while ( a != array.length-2 ) {
                System.out.println("00000000000000000");
                System.out.println(a);
                
                a--;
              
            }
	    
	    while( c!=-1){
	    	System.out.print(c);
	    	c = entradaFormatada.getEncoding();
	    }
            */
