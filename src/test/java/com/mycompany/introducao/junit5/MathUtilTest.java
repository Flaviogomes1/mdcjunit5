/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.introducao.junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.mycompany.introducao.junit5.MathUtil.mdc;

/**
 *
 * @author flavio
 */
 class MathUtilTest {
    
    @Test
    void testSomeMethodParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
                
    }
    @Test
    void testSomeMethodImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a,  b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testSomeMethodParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int esperado = 0;
        final int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);   
    }
    @Test
    void testSomeMethodApositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testSomeMethodAnegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testSomeMethodMparP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        //mdc(a*m, b*m) == m * mdc(a, b)
        //mdc(18,    6) == 2 * mdc(9, 3)
        //       6      == 2 * 3
        final int  esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testSomeMethodP5(){
        //se mdc(a,b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        //                       7*3 5
        //                       21, 5
        final int esperado = mdc(a*b, c);
        //                       3,5
        final int obtido = mdc(b,c);
        System.out.println("esperado" + esperado + "obtido" + obtido);
        
        assertEquals(esperado, obtido);
        
        
    }
     @Test
    void testSomeMethodP5Resultado1(){
        //se mdc(a,b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado =1;
      
        //                       3,5
        final int obtido = mdc(b,c);
        System.out.println("esperado" + esperado + "obtido" + obtido);
       
        assertEquals(esperado, obtido);
       
    }   
    @Test
    void testSomeMethodP6(){
        final int a = 8;
        final int b = 2;
        //mdc int esperado = mdc(a,b)
        final int esperado = mdc(a,b);
        final int obtido = mdc(b,a);
        assertEquals(esperado, obtido);
    }   
    @Test
    void testSomeMethodP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a,b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testSomeMethodMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testSomeMethodNenhumParametro(){
       
        assertThrows(IllegalArgumentException.class, () -> mdc());
        
       
 }
 @Test
 void testSomeMethodNulo(){
        
        assertThrows(NullPointerException.class, () ->mdc(null));
        
       
 }   
 }