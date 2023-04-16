package exercicios;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */
import  java.util.Scanner;
import java.util.Locale;
public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double area;
        double raio;
        double y = 2;

        System.out.println("Escreva abaixo o valor do raio em que deseja encontratr a área deste círculo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio,y);

        System.out.printf("Este é o valor da área do seu círculo: %.4f%n", area);

        sc.close();
    }
}