package aulas;

import java.util.Scanner;

public class aula3Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double delta;
        double a;
        double b;
        double c;

        System.out.println("SEJA BEM VINDO AO RESOLVEDOR DE BHASKARA!");
        System.out.println("Por favor, descreva o valor que o a da fórmula vai possuir: ");
        a = sc.nextDouble();
        System.out.println("Por favor, descreva o valor que o b da fórmula vai possuir: ");
        b = sc.nextDouble();
        System.out.println("Por favor, descreva o valor que o c da fórmula vai possuir: ");
        c = sc.nextDouble();

        double x1;
        double x2;

        delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("ESSE É O RESULTADO DA BHASKARA!");
        System.out.println("O valor do seu x1 é = " + x1);
        System.out.println("O valor do seu x2 é = " + x2);
    }
}
