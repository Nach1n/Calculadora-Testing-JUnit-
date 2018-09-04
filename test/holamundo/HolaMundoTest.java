/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luisignacio
 */
public class HolaMundoTest {
    
    @Test
    public void testSuma(){
        int resultado = HolaMundo.suma(2,3);
        int esperado = 5; //2 + 3 = 5 pasa
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testSuma2(){
        int resultado = HolaMundo.suma(-10,-20);
        int esperado = -30; //-10 + -20 = -30 pasa
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testResta(){
        int resultado = HolaMundo.resta(3,2);
        int esperado = 1; //3 - 2 = 1 pasa
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testResta2(){
        int resultado = HolaMundo.resta(4,6);
        int esperado = -2; //4 - 6 = -2 pasa
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void multiplica(){
        int resultado = HolaMundo.multiplica(3,3);
        int esperado = 9; // 3 * 3 = 9 Pasa
        assertEquals(esperado,resultado);
    }
    @Test
    public void multiplica2(){
        int resultado = HolaMundo.multiplica(10,-10);
        int esperado = -100; // 10 * 10 = 100 Pasa
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testDivide(){
        float resultado = HolaMundo.divide(2,2);
        float esperado = 1; // 2 / 2 = 1 pasa
        assertEquals(esperado,resultado,0.0);
    }
    
    @Test
    public void testDivide2(){
        float resultado = HolaMundo.divide(1,2);
        float esperado = (float) 0.5; // 1 / 2 = 0.5 pasa
        assertEquals(esperado,resultado,0.5);
    }
    
    //Test Signos
    @Test
    public void testSignoPositivo() {
        HolaMundo sm = new HolaMundo();
        assertEquals("positivo", sm.signo(5));
    }
    
    @Test
    public void testSignoNegativo() {
        HolaMundo sm = new HolaMundo();
        assertEquals("negativo", sm.signo(-5));
    }
    
    //Pruebas unitarias que verifican que en las operaciones se encuentran errores
    /*
    @Test
    public void testDivideError(){
        float resultado = HolaMundo.divide(2,2);
        float esperado = 2; // Tiene que tirar Error
        assertEquals(esperado,resultado,0.0);
    }
    
    @Test
    public void multiplicaError(){
        int resultado = HolaMundo.multiplica(3,3);
        int esperado = 10; // Tiene que tirar error
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testRestaError(){
        int resultado = HolaMundo.resta(3,2);
        int esperado = 2; // Tiene que tirar error
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testSumaError(){
        int resultado = HolaMundo.suma(2,3);
        int esperado = 6; // Tiene que tirar Error
        assertEquals(esperado,resultado);
    }
    */
    
}
