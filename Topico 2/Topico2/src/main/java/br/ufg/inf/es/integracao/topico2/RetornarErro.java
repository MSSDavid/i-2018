package br.ufg.inf.es.integracao.topico2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * Esta classe implementa a primeira atividade do tópico 2. Nela é esperado um erro 
 * "NotSerializableException" porque a ClasseTestes() não implementa "Serializable".
 * 
 */

public class RetornarErro {

    public static void main(String[] args) throws IOException {
        ClasseTestes classeTestes = new ClasseTestes();
        classeTestes.variavel1 = 1;
        gravadorObjeto(classeTestes);

    }

    public static class ClasseTestes {
        int variavel1;
    }

    private static void gravadorObjeto(Object s) throws IOException {
      
        try (ObjectOutputStream oos = new ObjectOutputStream(new ByteArrayOutputStream())) { 
            oos.writeObject(s);
            oos.close();
        }
    }
    
}
