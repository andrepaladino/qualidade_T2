package com.qualidade.EscritaLeitura;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TesteLeitura
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TesteLeitura( String testName )
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
     * @throws FileNotFoundException 
     * 
     */
    @org.junit.Test(expected = FileNotFoundException.class)
    public void ValidaLeitura() throws FileNotFoundException 
    {
    	Leitura leitura = new Leitura();
    	
    	leitura.getSomatorio("batata.txt");
    	
    }
}
