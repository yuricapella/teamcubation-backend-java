package logica_programacao.exercicio04;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero = receberEntradaUsuario();
        System.out.println(gerarTabuada(numero));
    }

    public static String gerarTabuada(int numero){
        String tabuada = "";
        int resultadoTabuada = 0;
        System.out.println("A tabuada do número "+numero+" é:");
        for (int i = 1; i <= 10; i++){
            resultadoTabuada += (numero * i);
            tabuada += numero + " x " + i + " = "  + resultadoTabuada + "\n";
            resultadoTabuada = 0;
        }
        return tabuada;
    }

    public static int receberEntradaUsuario(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número para saber a tabuada de 1 a 10: ");
        return entrada.nextInt();
    }
}
