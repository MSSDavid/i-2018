/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracao.topico2;

import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author david
 */

public class Testing {

       public static void main(String[] args) throws IOException {
           
           boolean[] logicos = { true, false, false, true };
           String s = "";
           System.out.println(TamanhoEmBytes(s));
       
       }
       
       
       
        private static int TamanhoEmBytes(Serializable s) throws IOException {
       
            
            
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(s);
        oos.close();

        return baos.toByteArray().length;
}

       
       }



