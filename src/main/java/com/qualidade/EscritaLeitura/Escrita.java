package com.qualidade.EscritaLeitura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
	
	public File arquivo;

    public Escrita() {
    }

    public File getArquivo() {
        return arquivo;
    }

    public void escreveArquivo(String nomeArquivo) {
    	
        try {
            arquivo = new File(nomeArquivo);
            FileWriter FileWriter;
            FileWriter = new FileWriter(arquivo.getAbsoluteFile());
            BufferedWriter BufferedWriter = new BufferedWriter(FileWriter);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                BufferedWriter.write(i + ":" + calculaPotencia(i, 2)+ ":" + calculaPotencia(i, 3) + "\n");
            }

            BufferedWriter.close();
            
        } catch (IOException exception) {
            System.out.println(exception);
        }
    }
    
    public double calculaPotencia(int n, int p) {
    	
    	return Math.pow(p, n);
    	
    }

}
