package com.qualidade.EscritaLeitura;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Integracao {

	@Test
	public void test() throws NumberFormatException, FileNotFoundException {
		
    	Escrita arquivo = new Escrita();
    	arquivo.escreveArquivo("teste.txt");
    	
    	Leitura leitura = new Leitura();
    	
        assertEquals(new Double("3025.0"), leitura.getSomatorio("teste.txt"));
	}

}
