package logica_programacao.exercicio02;

import java.util.Scanner;

public class VerificaParOuImpar {
    public static void main(String[] args) {
        int numero = receberEntradaUsuario();
        verificarParOuImpar(numero);
    }

    public static int receberEntradaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = entrada.nextInt();
        entrada.close();
        return numero;
    }

    public static void verificarParOuImpar(int numero){
        if(numero%2==0){
            System.out.println("O número é par!");
        }else {
            System.out.println("O número é impar!");
        }
    }
}
