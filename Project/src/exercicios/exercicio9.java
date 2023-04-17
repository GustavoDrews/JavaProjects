package exercicios;
import java.util.Scanner;

/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Escreva qual é o número inteiro que deseja saber se é PAR ou ÍMPAR: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Este número é PAR");
        }
        else {
            System.out.println("Este número é ÍMPAR");
        }

        sc.close();
    }
}
