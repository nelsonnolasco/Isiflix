package base;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//        int a;
//        float b;
//        double c;
//
//        System.out.println("Digite um valor inteiro: ");
//        a = teclado.nextInt();
//        System.out.println("Você digitou o valor: " + a);
//
//        System.out.println("Digite um valor float: ");
//        b = teclado.nextFloat();
//        System.out.println("Você digitou o valor: " + b);
//
//        System.out.println("Digite um valor double: ");
//        c = teclado.nextDouble();
//        System.out.println("Você digitou o valor " + c);

        System.out.println("--------------------------------------------------------");

        String nome;
        int codigo;

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Seu nome é: " + nome);

        System.out.println("Digite seu codigo: ");
        codigo = teclado.nextInt();
        System.out.println("Seu codigo é: " + codigo);

        teclado.close();
    }
}
