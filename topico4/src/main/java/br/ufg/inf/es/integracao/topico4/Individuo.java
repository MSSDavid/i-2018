/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.es.integracao.topico4;

import java.util.List;

/**
 *
 * @author david
 */


public class Individuo {
    
    private List<Nome> nomes;

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }
    
    private String teste;
    
        public List<Nome> getNomes() {
        return nomes;
    }

    public void setNomes(List<Nome> nomes) {
        this.nomes = nomes;
    }
}
