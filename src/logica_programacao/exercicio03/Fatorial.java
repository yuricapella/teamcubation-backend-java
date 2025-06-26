package logica_programacao.exercicio03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero = receberEntradaUsuario();
        System.out.printf("Fatorial de %d: %d%n",numero,calcularFatorial(numero));
    }
    public static int calcularFatorial(int numero) {
        if (numero == 0){
            return 1;
        }
        for (int i = numero - 1; i > 0; i--) {
            numero *= i;
        }
        return numero;
    }
    public static int receberEntradaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = entrada.nextInt();
        entrada.close();
        return numero;
    }
}
