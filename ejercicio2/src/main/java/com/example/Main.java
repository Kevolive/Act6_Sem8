package com.example;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        int aleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número que vas a adivinar entre " + min_numero + " y " + max_numero + " en " + max_intentos);
        int intentos = 0;

        while (intentos < max_intentos) {
System.out.println("Te quedan " + (max_intentos - intentos) + " Intentos para adivinar el número. Ingresa el número:");
int numero = scanner.nextInt();
if (numero == aleatorio) {
    System.out.println("¡Felicidades. Has adivinado el número.");
    return;
    
} else if (numero < aleatorio) {
    System.out.println("El número es mayor que " + numero + ". Por favor ingresa otro número.");
    
}else {
    System.out.println("El número es menor que " + numero + ". Por favor ingresa otro número. ");
}
      intentos++;      
        }
System.out.println("Lo siento. Se te acabaron los intentos. El número era: " + aleatorio);
        
    }
}