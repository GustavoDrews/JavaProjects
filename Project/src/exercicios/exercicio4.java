package exercicios;
import java.util.Scanner;
/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B,C,D,DIF;

        System.out.println("Escreva o primeiro valor que deseja saber a diferença: ");
        A = sc.nextInt();
        System.out.println("Escreva o segundo valor que deseja saber a diferença: ");
        B = sc.nextInt();
        System.out.println("Escreva o terceiro valor que deseja saber a diferença: ");
        C = sc.nextInt();
        System.out.println("Escreva o quarto valor que deseja saber a diferença: ");
        D = sc.nextInt();

        DIF = A * B - C * D;

        System.out.println("O valor de diferença entre os números digitados é: " + DIF);

        sc.close();
    }
}
