package br.ufg.inf.es.integracao.topico2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * Esta classe implementa a primeira parte segunda atividade do tópico 2. 
 * Aqui uma classe será serializada e persistida num arquivo.
 * 
 */
public class Segunda1 {

    public static void main(String[] args) throws IOException {
        ClasseTeste classeTeste = new ClasseTeste();
        classeTeste.variavel1 = 1;
        classeTeste.varivael2 = "Teste";
        classeTeste.variavel3 = true;
        String saida = "txt.txt";
        gravadorObjeto(classeTeste, saida);

    }

    private static void gravadorObjeto(Object entrada, String saida) throws IOException {
         try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(saida))) {
                System.out.println(entrada);
                s.writeObject(entrada);  
                s.close();
         }   
        }
    }
    
