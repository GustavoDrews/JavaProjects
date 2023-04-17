package exercicios;
import java.util.Scanner;
 /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrInicial, hrFinal, duracao;

        System.out.println("Escreva a hora em que o jogo começou: ");
        hrInicial = sc.nextInt();
        System.out.println("Escreva a hora em que o jogo terminou: ");
        hrFinal = sc.nextInt();


    }
}
