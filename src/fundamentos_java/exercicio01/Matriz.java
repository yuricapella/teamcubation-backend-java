package fundamentos_java.exercicio01;
import java.util.Scanner;


public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado = 0;
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite os valores da matriz, linha " + (i + 1) + ", coluna " + (j + 1) + ":");
                int valor = entrada.nextInt();
                resultado += valor;
                matriz[i][j] = valor;
            }
        }
        System.out.println("Matriz resultado: " + resultado);
    }
}
