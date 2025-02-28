package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {
    private Scanner escaner;

    public RecuperacionSeguimiento1() {
        escaner = new Scanner(System.in);
    }

    public void run() {   
        // Punto 1: Cantidad de números iguales
        System.out.println("------------Punto 1------------");
        System.out.println("--Cantidad de números iguales--");
        System.out.println("> Inserte 3 números: ");
        int N1 = escaner.nextInt();
        int N2 = escaner.nextInt();
        int N3 = escaner.nextInt();
        System.out.println("> La cantidad de números repetidos es: " + Cantidad(N1, N2, N3));
        System.out.println("");

        // Punto 2: Saludo y despedida
        System.out.println("------------Punto 2------------");
        System.out.println("-----Bienvenida y Despedida----");
        System.out.println(">> ¿Cuál es tu nombre? ");
        String name = escaner.next();
        System.out.println(">> Para saludar oprima 1 / Para despedir oprima 2");
        int condicion = escaner.nextInt();
        System.out.println(Saludar(name, condicion));
        System.out.println("");

        // Punto 3: Contar palabras con 4 o más letras
        System.out.println("------------Punto 3------------");
        System.out.println("--Palabras con 4 o más letras--");
        System.out.println(">> Introduzca 3 palabras: ");
        String P1 = escaner.next();
        String P2 = escaner.next();
        String P3 = escaner.next();
        System.out.println(">> Las palabras con 4 o más letras son: " + Contar(P1, P2, P3));
        System.out.println("");

        // Punto 4: Comparación de letras
        System.out.println("------------Punto 4------------");
        System.out.println("---Comparación de letras---");
        System.out.println(">> Introduzca 2 palabras: ");
        String P4 = escaner.next();
        String P5 = escaner.next();
        System.out.println(">> ¿Coinciden en la tercera letra?: " + comparar(P4, P5));
        System.out.println("");

        // Punto 5: Ecuación cuadrática
        System.out.println("------------Punto 5------------");
        System.out.println("-----Ecuación Cuadrática-----");
        System.out.println(">> Introduzca el valor de a: ");
        double a = escaner.nextDouble();
        System.out.println(">> Introduzca el valor de b: ");
        double b = escaner.nextDouble();
        System.out.println(">> Introduzca el valor de c: ");
        double c = escaner.nextDouble();
        funcionCuadratica(a, b, c);
        System.out.println("");
        
        escaner.close(); 
    }

    public static void main(String[] args) {
        RecuperacionSeguimiento1 mainApp = new RecuperacionSeguimiento1();
        mainApp.run();
    }

    public static int Cantidad(int N1, int N2, int N3) {
        if (N1 == N2 && N2 == N3) return 3;
        if (N1 == N2 || N1 == N3 || N2 == N3) return 2;
        return 0;
    }

    public static String Saludar(String name, int condicion) {
        if (condicion == 1) return "Hola " + name;
        if (condicion == 2) return "Chao " + name;
        return "Error: entrada inválida";
    }

    public static int Contar(String P1, String P2, String P3) {
        int Total = 0;
        if (P1.length() >= 4) Total++;
        if (P2.length() >= 4) Total++;
        if (P3.length() >= 4) Total++;
        return Total;
    }

    public static boolean comparar(String P4, String P5) { 
        if (P4.length() < 3 || P5.length() < 3) {
            System.out.println("ERROR: Una de las cadenas es demasiado corta");
            return false;
        }
        return P4.charAt(2) == P5.charAt(2);
    }

    public static void funcionCuadratica(double a, double b, double c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            System.out.println("No existen soluciones reales.");
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Existe una única solución real: " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones de la ecuación son: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
