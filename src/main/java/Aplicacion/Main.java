package Aplicacion;

import Model.Cuadrado;
import Model.TrianguloEquilatero;
import Model.Circulo;
import Model.Figura;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== CALCULADORA DE FIGURAS ===");
            System.out.println("1. Triángulo equilátero");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            Figura figura = null;

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa el lado del triángulo: ");
                    int ladoT = sc.nextInt();
                    figura = new TrianguloEquilatero(ladoT);
                }
                case 2 -> {
                    System.out.print("Ingresa el lado del cuadrado: ");
                    int ladoC = sc.nextInt();
                    figura = new Cuadrado(ladoC);
                }
                case 3 -> {
                    System.out.print("Ingresa el radio del círculo: ");
                    int radio = sc.nextInt();
                    figura = new Circulo(radio);
                }
                case 4 -> {
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    continue;
                }
                default -> {
                    System.out.println("Opción inválida, intenta de nuevo.");
                    continue;
                }
            }

            System.out.println("\n¿Qué deseas calcular?");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Elige una opción: ");
            int calculo = sc.nextInt();

            if (figura != null) {
                switch (calculo) {
                    case 1 -> System.out.println("Área: " + figura.calcularArea());
                    case 2 -> System.out.println("Perímetro: " + figura.calcularPerimetro());
                    default -> System.out.println("Opción no válida.");
                }
            }
        }

        sc.close();
    }
}
