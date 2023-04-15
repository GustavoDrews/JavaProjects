package aulas;

import java.util.Locale;
import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double g;
        char h;
        x = sc.next();
        y = sc.nextInt();
        g = sc.nextDouble();
        h = sc.next().charAt(0);
        System.out.println("Você digitou o seguinte nome= " + x);
        System.out.println("Você digitou a seguinte idade= " + y);
        System.out.printf("Você digitou o seguinte valor com ponto flutuante: %.2f%n", g);
        System.out.println("A primeira letra que você digitou foi a seguinte= " + h);

        sc.close();
    }

}
