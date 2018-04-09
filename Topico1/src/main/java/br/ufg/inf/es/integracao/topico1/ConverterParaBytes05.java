package br.ufg.inf.es.integracao.topico1;


import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * Este arquivo implementa o 5º exercício da atividade supervisionada 01.
 *
 */

public class ConverterParaBytes05 {

    /**
     * Este método é o método principal que obtém de satisfazMarcacaoJpeg a resposta.
     * @param args Primeiro argumento é nome do arquivo de entrada e o segundo é o de saída.
     * @throws IOException
     */    
    
    public static void main(String[] args) throws IOException {

        converterParaBytes(args);
    }
    
    
    /**
     * Este método converte um arquivo comum em uma trilha contínua de bytes.
     * 
     * @param args[0] é o arquivo a ser convertido.
     * @param args[1] é o arquivo convertido.
     * @throws FileNotFoundException
     * @throws IOException 
     */    

    public static void converterParaBytes(String[] args) throws IOException {

        Scanner arquivo = new Scanner(new FileReader(args[0]));

        FileOutputStream fis = new FileOutputStream(args[1]);

        try (DataOutputStream dis = new DataOutputStream(fis)) {

            ByteArrayOutputStream buffer = new ByteArrayOutputStream();

            while (arquivo.hasNextLine()) {

                byte[] linha = arquivo.nextLine().getBytes("UTF-8");
                byte[] tamanhoDaLinha = ByteBuffer.allocate(4).putInt(linha.length).array();

                buffer.write(tamanhoDaLinha);
                buffer.write(linha);

            }

            dis.write(buffer.toByteArray());
            dis.close();

        }

    }

}
