package br.ufg.inf.es.integracao.topico2;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;


public class Segunda11 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String saida = "C:\\Users\\Alunoinf_2\\Documents\\Nova pasta\\txt.txt";
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
    
    
