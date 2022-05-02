package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Punto1 {
    private int number;
    public Punto1() {
        // TODO Auto-generated constructor stub
    }

    // Getter y Setter
    public int getNumero() {
        return number;
    }

    public void setNumero(int number) {
        this.number = number;
    }

    public int resFact(int number) {

        // Factorial de forma recursiva

        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = i*fact;
        }
        return fact;
    }
}