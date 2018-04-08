package atividade1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 *
 */
public class Quinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<String> linhas;

        BufferedReader leitor;
        leitor = new BufferedReader(new FileReader(args[0]));
        linhas = new ArrayList<>();
        byte[] umByteArray;
        String linha = "";
        FileWriter arquivo = new FileWriter(args[1]);
        int i = 0;
        int j = 0;
        String s = "UTF-8";
        byte[] b = s.getBytes("UTF-8");

        while ((linha = leitor.readLine()) != null) {
            for (i = 0; i < linha.length(); i++) {
                if (linha.length() > 0) {
                    umByteArray = linha.getBytes();
                    linhas.add(linha);

                    arquivo.write((byte) linha.length());
                    for (j = 0; j > b.length; i++) {
                        arquivo.write(b[j]);
                    }
                    arquivo.write("" + umByteArray[i]);

                }
            }

        }

        arquivo.close();

    }

}
