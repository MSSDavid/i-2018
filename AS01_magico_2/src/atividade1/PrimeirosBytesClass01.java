package atividade1;

import java.io.*;

/**
 * Este arquivo implementa o primeiro exercício da atividade supervisionada 01.
 * 
 */
public class PrimeirosBytesClass01 {

    /**
     *
     * @param args Este é o nome do arquivo .class a ser analisado. 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String arquivo = PrimeirosBytesClass01((args[0]));

        System.out.println(arquivo);
    }

    /**
     *
     * @param args Este é o nome do arquivo .class a ser analisado.
     * @return Aqui há uma String que deve ter como saída "CA FE BA BE"
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String PrimeirosBytesClass01(String args) throws FileNotFoundException, IOException {

        StringBuilder stringBuilder;
        try (FileInputStream stream = new FileInputStream(args)) {
            BufferedInputStream buffStream = new BufferedInputStream(stream);
            DataInputStream streamData = new DataInputStream(buffStream);
            stringBuilder = new StringBuilder();
            

            for (int i = 0; i < 4; i++) {

                byte classByte = streamData.readByte();

                stringBuilder.append(String.format("%X ", classByte));

            }

            stream.close();
        }
        return stringBuilder.toString();

    }

}
