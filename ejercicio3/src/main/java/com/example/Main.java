package com.example;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
       System.out.println("Ingresa la base del triángulo: ");
       double baseTriangulo = scanner.nextInt();
       System.out.println("Ingresa la altura del triángulo: ");
       double alturaTriangulo = scanner.nextDouble();
       double area = baseTriangulo * alturaTriangulo;
       System.out.println("El área del triángulo es: " + area);
    }

    private static void calcularCuadrado(Scanner scanner) {
       System.out.println("Ingresa el lado 1 del cuadrado: ");
       double lado1 = scanner.nextDouble();
       System.out.println("Ingrese el lado 2 del cuadrado: ");
       double lado2 = scanner.nextDouble();
       double area = lado1 * lado2;
       System.out.println("El área del cuadrado es: " + area);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = longitud * altura;
        System.out.println("El área del rectángulo es: " + area);
        
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI*radio*radio;
        System.out.println("El área del círculo es: " + area);
       
    }
    }
