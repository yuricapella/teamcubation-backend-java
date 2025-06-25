package fundamentos_java.exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListIntStream {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
            System.out.println("Digite os valores da lista: ");
            lista.add(entrada.nextInt());
            System.out.println("Se não quiser mais digitar valores, digite x");
            String saida = entrada.next();
            if(saida.equals("x")){
                continuar = false;
            }
        }
        lista.stream()
                .filter(valor -> valor % 2 !=0)
                .map(valor -> valor * 2)
                .sorted()
                .forEach(System.out::println);
    }
}
