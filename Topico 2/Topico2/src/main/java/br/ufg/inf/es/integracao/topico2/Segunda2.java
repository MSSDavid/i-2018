package br.ufg.inf.es.integracao.topico2;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * Esta classe implementa a segunda parte segunda atividade do tópico 2. 
 * Aqui um arquivo com informações de uma objeto virará um objeto novamente.
 * 
 */

public class Segunda2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String saida = "txt.txt";
        ClasseTeste classeteste = gravadorObjeto(saida);
         
        System.out.println(classeteste.variavel1);
        System.out.println(classeteste.varivael2);
        System.out.println(classeteste.variavel3);
        
    }

    private static ClasseTeste gravadorObjeto(String arquivo) throws IOException, ClassNotFoundException {
        ObjectInputStream objstream = new ObjectInputStream(new FileInputStream(arquivo));
        ClasseTeste object = (ClasseTeste)objstream.readObject();
        objstream.close();
        return object;
    }
}
    
    
