/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracao.topico4;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

import java.lang.reflect.Type;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class Mds {

    public static void main(String[] args) throws UnknownHostException {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("test");

        List dbs = mongoClient.getDatabaseNames();
        System.out.println(dbs);

        DBCollection coll = db.getCollection("tester");
        Set colls = db.getCollectionNames();

        System.out.println(colls);

        DBObject doc = coll.findOne();
        System.out.println(doc);  
        
        
        
        Individuo individuo = new Individuo();
        individuo.setTeste("nothingtosee");
        
        
        Gson gson = new Gson();
        String result = gson.toJson(individuo);
        System.out.println(result);

        
    }

    
}
