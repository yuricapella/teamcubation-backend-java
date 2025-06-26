package logica_programacao.exercicio01;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double primeiroValor = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = entrada.nextDouble();
        System.out.println("Digite a operação matemática: ");
        char operacao = entrada.next().charAt(0);
        entrada.close();

        double resultado = switch (operacao) {
            case '+' -> primeiroValor + segundoValor;
            case '-' -> primeiroValor - segundoValor;
            case '*' -> primeiroValor * segundoValor;
            case '/' -> primeiroValor / segundoValor;
            default -> 0;
        };
        System.out.println(resultado);
    }
}
