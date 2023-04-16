package exercicios;
import java.util.Scanner;
import java.util.Locale;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int NumFuncionario;
        double HrsTrabalhadas, ValorHora, Salario;

        System.out.println("Escreva qual é o número do funcionário: ");
        NumFuncionario = sc.nextInt();
        System.out.println("Escreva a quantidade de horas trabalhadas: ");
        HrsTrabalhadas = sc.nextDouble();
        System.out.println("Escreva qual é o valor por hora trabalhada: ");
        ValorHora = sc.nextDouble();

        Salario = HrsTrabalhadas * ValorHora;
        System.out.println("Esse é o número do funcionário: " + NumFuncionario);
        System.out.printf("Esse é o valor do seu salário: " + "U$ %.2f%n", Salario);
    }
}
