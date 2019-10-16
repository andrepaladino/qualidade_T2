package com.qualidade.EscritaLeitura;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Leitura leitura = new Leitura();
		Escrita escrita = new Escrita();
		
		
		escrita.escreveArquivo("potencias.txt");

		try {
			System.out.println(leitura.getSomatorio("potencias.txt"));
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
