/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m05_uf02_examen_final;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LJChao-PC
 */
public class AvaluadorTest1 {
    
    private Estudiant instance;
    private Avaluador Avaluador;
    
    public AvaluadorTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        instance = new Estudiant("Longjie",5.0,5.0,5.0);
        Avaluador = new Avaluador();
        
    }
    
    @After
    public void tearDown() {
        instance = null;
        Avaluador = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(5.0,Avaluador.mitjana(instance),0.1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(5.0,Avaluador.mitjana(instance),0.1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        
    }
    
}
