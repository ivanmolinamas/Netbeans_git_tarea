/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package test.netbeansgit_tarea;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author IVAN
 */
public class NetBeansGit_tarea {

    public static void main(String[] args) {
//        String cad = "!Bien" + "venido¡";
//        String cad1 = "!Bien".concat("venido");
//        System.out.println(cad);
//        System.out.println(cad1);
//
//        char t = cad.charAt(5);
//
//        System.out.println(t);

//        String c = "1234.5678";
//
//        double n;
//        try {
//
//            n = Double.valueOf(c).doubleValue();
//
//        } catch (NumberFormatException e) {
//            /* Código a ejecutar si no se puede convertir */
//            System.out.println("No se puede convertir = " + e);
////        }
//        float precio = 3.3f;
//
//        System.out.println("El precio es: " + precio + "€");
//
//        // ahora con un format para que se vea 3.30€
//        String salida = String.format("El precio es: %.2f €", precio);
//
//        System.out.println(salida);
//
//        String cad1 = "Hola";
//        String cad2 = "hola";

        Pattern p = Pattern.compile("[01]+");

        Matcher m = p.matcher("00001010");

        if (m.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }

    }
}
