package br.ufg.inf.es.integracao.topico1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static junit.framework.Assert.assertFalse;
import org.junit.Test;

/**
 *
 * @author Alunoinf_2
 */
public class SatifazMarcacaoJpegTest {
    
    private final String ARQUIVO_INEXISTENTE = "arquivo-nao-existe";
    
    @Test
    public void arquivoJpegOk() throws Exception {
        assertFalse(SatifazMarcacaoJpeg02.satisfazMarcacaoJpeg(ARQUIVO_INEXISTENTE));
    }
}
