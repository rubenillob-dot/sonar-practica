package com.practica;
public class Calculator {

    public int divide(int a, int b) {
        // Corrige el Bug 1 del PDF: Evita división por cero
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public String status(int val) {
        // Corrige el error 2 (Bug de NullPointerException)
        String s = "negative or zero";
        if (val > 0) {
            s = "positive";
        }
        return s.toUpperCase();
    }

    // Hemos borrado el método unused() y el System.out
    // Esto corrige los errores 3 y 4 de tu lista (Code Smells)
}
