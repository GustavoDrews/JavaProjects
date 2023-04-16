package exercicios;

import org.w3c.dom.ls.LSOutput;

import java.nio.Buffer;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
         /* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Entrada: Saída:
10       SOMA = 40
30
*/
        Scanner sc = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Digite o primeiro valor da soma: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor da soma: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("A soma dos dois números digitados é de: " + soma);

        sc.close();
    }
}
