import java.util.Scanner;
public class TesteWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, resultado, contador;
        System.out.println("Digite um valor");
        numero = teclado.nextInt();
        contador = 1;
        while (contador <= 10){
            if (contador == 5){
                continue;
            }
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador = contador + 1;
        }
        teclado.close();
    }
}