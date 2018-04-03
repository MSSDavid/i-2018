/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import static junit.framework.Assert.assertFalse;
import org.junit.Test;

/**
 *
 * @author Alunoinf_2
 */
public class BytesTest {
    
    private final String ARQUIVO_INEXISTENTE = "arquivo-nao-existe";
    
    @Test
    public void arquivoJpegOk() throws Exception {
        assertFalse(Bytes.satisfazMarcacaoJpeg(ARQUIVO_INEXISTENTE));
    }
}
