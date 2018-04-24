package br.ufg.inf.es.integracao.topico1;

import java.io.*;

/**
 * Este arquivo implementa o segundo exercício da atividade supervisionada 01.
 *
 */
public class SatifazMarcacaoJpeg02 {

    /**
     * Este método é o método principal que obtém de satisfazMarcacaoJpeg a resposta.
     * @param args Primeiro argumento é nome do arquivo.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        boolean satisfazMarcacaoJpeg = satisfazMarcacaoJpeg(args[0]);

        System.out.println(satisfazMarcacaoJpeg);
    }
    
    /**
     * Este método compara os 2 primeiros bytes de um arquivo e confere se eles correspondem
     * ao número FF e D8 em hexadecimal, e também confere os dois últimos, se eles 
     * também correspondem a FF e D9.
     * 
     * @param arquivo é o arquivo a ser analisado.
     * @return Se o arquivo satisfazer as marcações JPEG o resultado será true. Se não, falso.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static boolean satisfazMarcacaoJpeg(String arquivo) throws FileNotFoundException, IOException {
        
        File file = new File(arquivo);
        long tamanho = file.length();
        
        FileInputStream fis = new FileInputStream(arquivo);
        DataInputStream dis = new DataInputStream(fis);
        
        
        
        byte ff1 = dis.readByte();
        byte d8 = dis.readByte();

        dis.skip(tamanho - 4); 
        
        /**aqui o leitor readByte pula até o penúltimo byte para obter os dois últimos 
         *bytes a serem analisados 
         */
        

        byte ff2 = dis.readByte();
        byte d9 = dis.readByte();
        
        dis.close();
        
        final boolean primeiroIgual = ff1 == (byte) 0xFF;
        final boolean segundoIgual = d8 == (byte) 0xD8;
        final boolean terceiroIgual = ff2 == (byte) 0xFF;
        final boolean quartoIgual = d9 == (byte) 0xD9;
        
        return primeiroIgual && segundoIgual
                && terceiroIgual && quartoIgual;
    }
}