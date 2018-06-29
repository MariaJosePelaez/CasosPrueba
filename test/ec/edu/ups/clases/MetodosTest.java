/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validarLetras method, of class Metodos.
     */
    @Test
    public void testValidarLetras() {
        System.out.println("validarLetras");
        String dia = "abc";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado contiene letras";
        String result = instance.validarLetras(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }    
    }

    /**
     * Test of validarVacios method, of class Metodos.
     */
    @Test
    public void testValidarVacios() {
        System.out.println("validarVacios");
        String dia = " ";
        Metodos instance = new Metodos();
        String expResult = "El valor ingresado es nulo";
        String result = instance.validarVacios(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarNegativos method, of class Metodos.
     */
    @Test
    public void testValidarNegativos() {
        System.out.println("validarNegativos");
        String dia = "-4";
        Metodos instance = new Metodos();
        String expResult = "el valor ingresado es menor a 0";
        String result = instance.validarNegativos(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarPuntoFlotante method, of class Metodos.
     */
    @Test
    public void testValidarFlotante() {
        System.out.println("validarFlotante");
        String dia = "3,5";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado tiene valor flotante";
        String result = instance.validarFlotante(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarDecimal method, of class Metodos.
     */
    @Test
    public void testValidarDecimal() {
        System.out.println("validarDecimal");
        String dia = "3.5";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado es un decimal";
        String result = instance.validarDecimal(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarCero method, of class Metodos.
     */
    @Test
    public void testValidarCero() {
        System.out.println("validarCero");
        String dia = "0";
        Metodos instance = new Metodos();
        String expResult = "el valor es cero";
        String result = instance.validarCero(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarRecargo0 method, of class Metodos.
     */
    @Test
    public void testValidarRecargo0() {
        System.out.println("validarRecargo0");
        String dia = "1";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado tiene un recargo del 0%";
        String result = instance.validarRecargo0(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarRecargo2 method, of class Metodos.
     */
    @Test
    public void testValidarRecargo2() {
        System.out.println("validarRecargo2");
        String dia = "11";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado tiene un recargo del 2%";
        String result = instance.validarRecargo2(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
          if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarRecargo4 method, of class Metodos.
     */
    @Test
    public void testValidarRecargo4() {
        System.out.println("validarRecargo4");
        String dia = "21";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado tiene un recargo del 4%";
        String result = instance.validarRecargo4(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
          if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }

    /**
     * Test of validarDia method, of class Metodos.
     */
    @Test
    public void testValidarDia() {
        System.out.println("validarDia");
        String dia = "32";
        Metodos instance = new Metodos();
        String expResult = "El dia ingresado sale del rango del mes";
        String result = instance.validarDia(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
          if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }  
    }
    
}
