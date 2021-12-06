/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introducao.junit5;

import java.util.Objects;

/**
 *
 * @author flavio
 */
public class MathUtil {
    //                        0,   -30
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        //propriedade6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
         //propriedade1       
        if(b > 0 && a % b ==0){
            return b;
        }
        //propriedade3
        if(b == 0){
            return Math.abs(a);
        }
       
       return mdc(a-b, b);
    }
    
    public static int mdc(int ...valores ){
        Objects.requireNonNull(valores,
                "O parametro valores não pode ser nulo para calcular o MDC");
        if(valores.length ==0){
            throw new IllegalArgumentException(
            "è preciso indicar ao menos um valor para calcular o MDC");
        }
       int a = valores[0];
       for (int b : valores){
         a = mdc(a, b);  
       }
       return a;
    }    
}

