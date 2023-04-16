package aulas;

import java.sql.SQLOutput;
import java.util.Scanner;
public class aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        /*Usado pois quando é utilizado um comando diferente do nextLine() e da uma quebra de linha, ENTER no caso, essa quebra de linha fica "pendente na entrada padrão.
        Por conta disso é necessário fazer um nextLine() para absorver aquela quebra de linha pendente. */
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}