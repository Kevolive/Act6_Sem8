package com.example;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
          Random random = new Random();
          int aleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("Por favor ingresa un número para adivinarlo, entre " + min_numero + " y " + max_numero + "  en " + max_intentos + " intentos. ");
          int intentos = 0;
          while (intentos < max_intentos) {
            System.out.println("Te quedan " + (max_intentos - intentos) + " intentos, para adivinar el número. Ingresa el número.");
            int numero = scanner.nextInt();
            if (numero == aleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número.");
                return;                
            } else if (numero < aleatorio) {
                System.out.println("El número es mayor que " + numero + ". Por favor sigue intentando.");
                
            } else {
                System.out.println("El numero es menor que " + numero + ". Por favor sigue intentando.");
            }
            intentos++;
            
          } 
          System.out.println("Lo siento, ¡PERDISTE! Se te acabaron los intentos. Ya que el número era " + aleatorio);

        
    }
}