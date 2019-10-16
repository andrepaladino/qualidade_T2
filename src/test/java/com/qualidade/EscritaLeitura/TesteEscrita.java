package com.qualidade.EscritaLeitura;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TesteEscrita 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TesteEscrita( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TesteEscrita.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Escrita escrita = new Escrita();

        escrita.escreveArquivo("potencias.txt");

        assertTrue(escrita.getArquivo().exists());
        assertTrue(escrita.getArquivo().length() > 0);
    }
}