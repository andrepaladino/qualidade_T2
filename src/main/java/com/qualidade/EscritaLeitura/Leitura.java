package com.qualidade.EscritaLeitura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura {

	private ArrayList<Arquivo> linhas;
	private double somatorio;

	public Leitura() {
		this.linhas = new ArrayList<Arquivo>();
		this.somatorio = 0;
	}

	public Double getSomatorio(String nomeArquivo) throws FileNotFoundException {
		BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
		String linha;
		try {
			while ((linha = leitor.readLine()) != null) {
				String[] numeros = linha.split(":");
				Arquivo Arquivo = new Arquivo(Double.valueOf(numeros[0]), Double.valueOf(numeros[1]),
						Double.valueOf(numeros[2]));

				linhas.add(Arquivo);
			}

			for (Arquivo Arquivo : linhas) {

				somatorio = somatorio + Arquivo.getPotencia3();
			}

			leitor.close();

			return somatorio;
		} catch (IOException exception) {
			return new Double("0");
		}
	}

}
