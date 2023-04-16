package exercicios;
import java.util.Scanner;
 /* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */
public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Por favor, escreva o número inteiro que deseja saber se é negativo.");
        x = sc.nextInt();

        if (x < 0) {
            System.out.println("O número inteiro digitado é NEGATIVO");
        }
        else {
            System.out.println("O número inteiro digitado NÃO É NEGATIVO");
        }

        sc.close();
    }
}
