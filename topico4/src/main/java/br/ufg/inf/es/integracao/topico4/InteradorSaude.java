/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracao.topico4;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.FileNotFoundException;
import java.net.UnknownHostException;


/**
 *
 * @author david
 */
public class InteradorSaude {
    
    public static void main(String[] args) throws FileNotFoundException, UnknownHostException {

    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
    
       
    
}
    
    
    
    
}