/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Alunoinf_2
 */
public class Persisitir {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
    PrintWriter pw = new PrintWriter(args[0],"UTF-8");
    pw.write(args[1]);
    pw.close();
}
}
