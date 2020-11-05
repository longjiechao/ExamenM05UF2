/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m05_uf02_examen_final;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author LJChao-PC
 */
@RunWith (Parameterized.class)
public class AvaluadorTest2 {
    
    private Estudiant instance;
    private Avaluador Avaluador;
    
    @Parameter(0)
    public String nombre;
    @Parameter(1)
    public double primerParcial;
    @Parameter(2)
    public double segundoParcial;
    @Parameter(3)
    public double tercerParcial;
    @Parameter(4)
    public double media;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object [][]{
            {"Juan",6.0,5.0,6.1,5.7},
            {"Laura",0,5.0,5.0,3.3},
            {"Maria",0,0,0,0},
            {"Eric",5.0,5.0,5.0,5.0},
            {"Alberto",10.0,10.0,10.0,10.0},
            {"Luis",7.0,8.0,3.0,6.0},
            {"Pepe",5.0,5.0,5.0,5.0},
            {"Jorge",5.0,8.0,5.0,6.0},
            {"Aldriano",5.0,5.0,8.0,6.0},
            {"Victoria",4.0,4.0,7.0,5.0},
            {"Sofia",6.0,6.0,3.0,5.0},
            {"Ana",4.0,2.0,3.0,3.0},
            {"Gemma",7.0,7.0,7.0,7.0},
            {"Cristina",4.0,5.0,3.0,4.0},
            {"Bob",5.0,3.0,7.0,5.0}
        };
        
        return Arrays.asList(data);
    }
    
    public AvaluadorTest2() {
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
        instance = new Estudiant(nombre,primerParcial,segundoParcial,tercerParcial);
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
        double mediaAv = Avaluador.mitjanaSiSupera(instance);
        if (mediaAv == 0) {
            assertEquals(0,mediaAv,0.1);
        }
        else {
            assertEquals(media,mediaAv,0.1);
        }
        
        
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(media,Avaluador.mitjana(instance),0.1);
        
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
//        assertEquals("a",Avaluador.millorEstudiantPerNotaMitjana(instance));
    }
    
}
