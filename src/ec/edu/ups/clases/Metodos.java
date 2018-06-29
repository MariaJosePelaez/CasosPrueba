/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author USER
 */
public class Metodos {
    
  private int dia;
  private String texto;
  char[] charArray;

    public Metodos() {
        
    }
  
public String validarLetras(String dia){
    texto = "";
    char letra;
    int asciiValue=0;
    
    for(int n =0;n<dia.length();n++){
     
     letra = dia.charAt(n); 
     char characterValue = letra;
     asciiValue = (int) characterValue; 
     
        if(asciiValue>=65 && asciiValue<=90 || asciiValue>=97 && asciiValue<=122){
            texto="El dia ingresado contiene letras";
            System.out.println(texto);
            return texto;
            
        }else{
            texto="El dia ingresado no contiene letras";
            System.out.println(texto);
            return texto;
            
        }
  }
    return texto;
}

public String validarVacios(String dia){
    texto="";
    if(dia.equals(" ")){
        texto="El valor ingresado es nulo";
        return texto;
    }
    texto="El valor ingresado no es nulo";
    return texto;
}

public String validarNegativos(String dia){
    texto="";
    if(Integer.parseInt(dia)<0){
        texto="el valor ingresado es menor a 0";
        return texto;
    }
    texto="el valor ingreado debe ser mayor a 0";
    return texto;
    
}

public String validarFlotante(String dia){
    texto="";
    
    if(dia.contains(",")){
        texto="El dia ingresado tiene valor flotante";
        return texto;
    }
    texto = "El dia ingresado no tiene valor flotante";
    return texto;
}
public String validarDecimal(String dia){
    texto="";
    
    if(dia.contains(".")){
        texto="El dia ingresado es un decimal";
        return texto;
    }
    texto = "El dia ingresado no es decimal";
    return texto;
}
public String validarCero(String dia){
    texto="";
    
    if(Integer.parseInt(dia)==0){
        texto="el valor es cero";
        return texto;
    }
    texto="el valor debe ser diferente de 0";
    return texto;
    
}
public String validarRecargo0(String dia){
    texto="";
    if(Integer.parseInt(dia)>=1 && Integer.parseInt(dia)<=10){
        texto = "El dia ingresado tiene un recargo del 0%";
        return texto;
    }
    texto = "El dia ingresado No tiene un recargo del 0%";
    return texto;
}
public String validarRecargo2(String dia){
    texto="";
    if(Integer.parseInt(dia)>=11 && Integer.parseInt(dia)<=20){
        texto = "El dia ingresado tiene un recargo del 2%";
        return texto;
    }
    texto="el valor no tiene un recargo del 2%";
    return texto;
}
public String validarRecargo4(String dia){
    texto="";
    if(Integer.parseInt(dia)>=21 && Integer.parseInt(dia)<=31){
        texto="El dia ingresado tiene un recargo del 4%";
        return texto;
    }
    texto="el valor ingresado no tiene un recargo del 4%";
    return texto;
}
public String validarDia(String dia){
    texto="";
    if(Integer.parseInt(dia)>31){
        texto = "El dia ingresado sale del rango del mes";
        return texto;
    }
    texto = "El valor ingresado esta dentro del rango de dias";
    return texto;
}
}
