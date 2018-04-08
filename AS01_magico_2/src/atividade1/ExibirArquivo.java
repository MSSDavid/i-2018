package atividade1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alunoinf_2
 */
public class ExibirArquivo {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String linha = br.readLine();
                System.out.println(linha);
            }
        }

    }
}
