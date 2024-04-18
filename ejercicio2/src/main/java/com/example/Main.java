package com.example;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero; // Genera un número aleatorio en el rango [min_numero, max_numero]
        Scanner scanner = new Scanner(System.in);

        System.out.println("Intenta adivinar el número entre " + min_numero + " y " + max_numero);

        int intentos = 0;
        while (intentos < max_intentos) {
            System.out.println("Te quedan " + (max_intentos - intentos) + " intento(s). Ingresa tu adivinanza:");
            int adivinanza = scanner.nextInt(); // Lee la adivinanza del usuario

            if (adivinanza == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número correctamente.");
                return;
            } else if (adivinanza < numeroAleatorio) {
                System.out.println("El número es mayor que " + adivinanza + ".");
            } else {
                System.out.println("El número es menor que " + adivinanza + ".");
            }

            intentos++;
        }

        System.out.println("Lo siento, has agotado todos tus intentos. El número era " + numeroAleatorio + ".");
    }
}