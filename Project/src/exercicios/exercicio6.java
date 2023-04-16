package exercicios;
import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoP1, numP1, codigoP2, numP2;
        double valorP1, valorP2, valorTotal;

        System.out.println("Escreva o código da primeira peça que deseja somar: ");
        codigoP1 = sc.nextInt();
        System.out.println("Numere a quantidade de peças: ");
        numP1 = sc.nextInt();
        System.out.println("Qual é o valor da primeira peça? ");
        valorP1 = sc.nextDouble();
        System.out.println("Escreva o código da segunda peça que deseja somar: ");
        codigoP2 = sc.nextInt();
        System.out.println("Numere a quantidade de peças: ");
        numP2 = sc.nextInt();
        System.out.println("Qual é o valor da segunda peça? ");
        valorP2 = sc.nextDouble();

        valorTotal = numP1 * valorP1 + numP2 * valorP2;

        System.out.printf("Esse é o valor total que precisará pagar: R$ %.2f%n", valorTotal);

        sc.close();

    }
}
