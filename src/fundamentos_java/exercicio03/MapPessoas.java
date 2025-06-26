package fundamentos_java.exercicio03;

import java.util.*;
import java.util.stream.Collectors;

public class MapPessoas {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome;
        boolean continuar = true;
        while (continuar){
            System.out.println("Digite o nome: ");
            nome =  entrada.nextLine();
            System.out.println("Digite a idade: ");
            idade = entrada.nextInt();
            entrada.nextLine();
            mapa.put(nome,idade);
            System.out.println("Deseja continuar? (S/N)");
            String saida = entrada.next();
            if(saida.equalsIgnoreCase("N")){
                continuar = false;
            }
            entrada.nextLine();
        }
        entrada.close();

        Set<String> nomesAcimaDeTrintaAnos = mapa.entrySet()
                .stream()
                .filter(chave -> chave.getValue() > 30)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(nomesAcimaDeTrintaAnos);
    }

}
