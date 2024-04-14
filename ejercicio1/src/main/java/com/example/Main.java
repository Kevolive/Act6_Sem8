package com.example;

public class Main {
    public static void main(String[] args) {
        String nombre = "Juan Zapata";
        int salarioBase = 45000000;
        int horasTrabajo = 192;
        int horasExtras = 10;
        double auxilioTransporte = 162000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }

    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        double salarioPorHora = salarioBase / horasTrabajo;
        double salarioExtra = salarioPorHora * 1.5 * horasExtras;  
        return salarioBase + salarioExtra;
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        double porcentajeDeducciones = 0.16;  // Example: 16% total for taxes and social contributions
        return salarioDevengado * porcentajeDeducciones;
    }
    }
