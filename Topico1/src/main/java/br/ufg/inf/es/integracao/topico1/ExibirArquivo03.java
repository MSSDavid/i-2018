package br.ufg.inf.es.integracao.topico1;

/**
 * Este arquivo implementa o terceiro exercício da atividade supervisionada 01.
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * 
 */
public class ExibirArquivo03 {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
        }

    }
}
