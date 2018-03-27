package atividade1;

import java.io.*;

/**
 * Implementa exercício X.
 */
public class Bytes {

    /**
     * O que esse método faz?
     * @param args Primeiro argumento é nome do arquivo.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        boolean satisfazMarcacaoJpeg = satisfazMarcacaoJpeg(args[0]);

        System.out.println(satisfazMarcacaoJpeg);
    }
    
    /**
     * Documente o que esse método faz, inclusive FFD8 e FFD9
     * @param arquivo
     * @return
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
        
        // TODO skipped pode ser menor que tamanho
        long skipped = dis.skip(tamanho - 4);

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
