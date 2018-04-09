package br.ufg.inf.es.integracao.topico1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;

/**
 * Este arquivo implementa o 6º exercício da atividade supervisionada 01.
 *
 */

public class RecuperarArquivo06 {

    public static void main(String[] args) throws IOException {
        recuperarArquivo(args);
    }

    public static PrintWriter recuperarArquivo(String[] arquivo) throws IOException {

        File file = new File(arquivo[0]);

        FileInputStream fis = new FileInputStream(arquivo[0]);
        DataInputStream dis = new DataInputStream(fis);

        PrintWriter pw = new PrintWriter(arquivo[1], "UTF-8");

        byte[] result = new byte[4];

        int pomAsInt = 0;

        int ii = 0;
        do {
            result[0] = ((dis.readByte()));
            result[1] = ((dis.readByte()));
            result[2] = ((dis.readByte()));
            result[3] = ((dis.readByte()));

            pomAsInt = ByteBuffer.wrap(result).getInt();

            for (int i = 0; i != pomAsInt; i++) {
                pw.write((char) dis.readByte());
            }
            pw.write("\r\n");
            ii += pomAsInt + 4;

        } while (ii < file.length());

        pw.close();
        
        return pw;

    }

}
