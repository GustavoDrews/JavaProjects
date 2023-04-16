package exercicios;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;

        System.out.println("Descreva o valor do lado A do triângulo: ");
        A = sc.nextDouble();
        System.out.println("Descreva o valor do lado B do triângulo: ");
        B = sc.nextDouble();
        System.out.println("Descreva o valor do lado C do triângulo: ");
        C = sc.nextDouble();

        TRIANGULO = A * C / 2;
        CIRCULO = 3.14159 * C * C;
        TRAPEZIO = (A+B)/2 * C;
        QUADRADO = B * B;
        RETANGULO = A * B;

        System.out.printf("Esta é a área do TRIANGULO: %.3f%n",TRIANGULO);
        System.out.printf("Esta é a área do CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("Está é a área do TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("Está é a área do QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("Está é a área do RETANGULO: %.3f%n", RETANGULO);

        sc.close();
    }
}
