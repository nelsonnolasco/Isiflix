import java.util.Scanner;
public class BEE1174{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A[] = new double[100];

        // primeiro leitura
        for (int i=0; i<A.length; i++){
            A[i] = teclado.nextDouble();
        }

        for (int i=0; i< A.length; i++){
            if (A[i] <= 10.0){
                System.out.printf("A[%d] = %.1f\n",i, A[i]);
            }
        }

        teclado.close();

    }
}