/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracao.topico2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 *
 * @author david
 */


public class Serializado01 {
    
    public static void main(String[] args) throws IOException {
     String nome = new String();
     nome = "Davidzão";
     int matricula = 12;
     Aluno aluno = new Aluno(nome, matricula);
        System.out.println(TamanhoEmBytes(nome));
        System.out.println(TamanhoEmBytes(aluno));
     
     
    

    }
    
    private static int TamanhoEmBytes(Serializable s) throws IOException {
   ByteArrayOutputStream baos = new ByteArrayOutputStream();
   ObjectOutputStream oos = new ObjectOutputStream(baos);

   oos.writeObject(s);
   oos.close();

   return baos.toByteArray().length;
}

    
}
