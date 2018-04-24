package br.ufg.inf.es.integracao.topico1;

/**
 * Este arquivo implementa o 4º exercício da atividade supervisionada 01.
 *
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

    /**
     *
     * @param args Este é o nome do arquivo a ser exibido.
     * @throws IOException
     */
public class PersistirDadosEmArquivo04 {

    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        PrintWriter pw = new PrintWriter(args[0], "UTF-8");
        pw.write(args[1]);
        pw.close();
    }
}
