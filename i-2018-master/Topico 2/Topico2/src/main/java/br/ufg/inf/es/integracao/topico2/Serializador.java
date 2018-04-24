package br.ufg.inf.es.integracao.topico2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serializador {

    public static void main(String[] args) throws IOException {
        ClasseTeste classeTeste = new ClasseTeste();
        classeTeste.variavel1 = 1;
        gravadorObjeto(classeTeste);

    }

    public static class ClasseTeste {
        int variavel1;
    }

    private static void gravadorObjeto(Object s) throws IOException {
      
        try (ObjectOutputStream oos = new ObjectOutputStream(new ByteArrayOutputStream())) { 
            oos.writeObject(s);
            oos.close();
        }
    }
    
}
