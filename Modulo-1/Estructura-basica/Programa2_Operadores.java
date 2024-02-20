/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anon
 */
public class Programa2_Opeadores {
    public static void main(String[] args) {
        //Entero
        byte b = 127;
        short s = 32767;
        int i = 29123893;
        long l = 129845730237490l;
        float f = 123456.789101112f;
        double d = 20239.12345;
        
        //Logicos
        boolean bol = true;
        
        //Caracteres
        char c = '%'; //' ' <-- Para cadenas
        String cadena = "Ejemplo de cadena";
        
        System.out.println("Tipos de datos Enteros ");
        System.out.println("Soy un byte: " + b);
        System.out.println("Soy un short: " + s);
        System.out.println("Soy un int: " + i);
        System.out.println("Soy un long: " + l);
        System.out.println("Soy un float: " + f);
        System.out.println("Soy un double: " + d);
        
        System.out.println("Tipos de datos Logicos ");
        System.out.println("Soy un booleano: " + bol);
        
        System.out.println("Tipos de datos Caracteres ");
        System.out.println("Soy un caracter: " + c);
        System.out.println("Soy un string: " + cadena);
        
    }
}
