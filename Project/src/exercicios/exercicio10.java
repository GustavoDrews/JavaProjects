package exercicios;
import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */
public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        System.out.println("Escreva o primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Escreva o segundo valor: ");
        B = sc.nextInt();

        if ((A % B == 0)||(B % A == 0)) {
            System.out.println("Estes números digitados SÃO MULTIPLOS!");
        }
        else {
            System.out.println("Estes números digitados NÃO SÃO MULTIPLOS!");
        }
        sc.close();
    }
}
