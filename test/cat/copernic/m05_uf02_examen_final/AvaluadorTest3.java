/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m05_uf02_examen_final;

import java.security.InvalidParameterException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.ExternalResource;
import org.junit.rules.Timeout;

/**
 *
 * @author LJChao-PC
 */
public class AvaluadorTest3 {
    
    private Estudiant instance;
    private Avaluador Avaluador;
    
    @Rule
    public final ExpectedException thrown = ExpectedException.none();
    
    @Rule
    public Timeout globalTimeout = Timeout.millis(10);
    
    @Rule
    public final ExternalResource externalResourse = new ExternalResource(){
        @Override
        protected void before() throws Throwable {
            System.out.println("en before de external resource");
        };
        
        @Override
        protected void after(){
            System.out.println("en after de external resource");
        };
    };
    
    public AvaluadorTest3() {
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
        instance = null;
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
        thrown.expect(Exception.class);
        thrown.expectCause(Is.isA(InvalidParameterException.class));
        thrown.expectMessage(CoreMatchers.startsWith("Estudiant no pot ser null"));
        assertEquals(5.0,Avaluador.mitjana(instance),0.1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectCause(Is.isA(InvalidParameterException.class));
        thrown.expectMessage(CoreMatchers.startsWith("Estudiant no pot ser null"));
        assertEquals(5.0,Avaluador.mitjana(instance),0.1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        
    }
    
}
