/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.principal;

import ec.edu.ups.clases.Metodos;

/**
 *
 * @author USER
 */
public class Principal {
    
    public static void main(String[] args) {
        
       Metodos metodos = new Metodos();
       
       metodos.validarLetras("abc");
       metodos.validarVacios(" ");
       metodos.validarNegativos("-4");
       metodos.validarFlotante("3,5");
       metodos.validarDecimal("3.5");
       metodos.validarCero("0");
       metodos.validarRecargo0("1");
       metodos.validarRecargo0("10");
       metodos.validarRecargo2("11");
       metodos.validarRecargo2("20");
       metodos.validarRecargo4("21");
       metodos.validarRecargo4("31");
       metodos.validarDia("32");
           
       
    }
}
