package poo.exercicios01_a_04;

public class Main {
    public static void main(String[] args) {
        Item livro = new Livro("Yuri","Orientação a objetos 1",2025);
        Item livro2 = new Livro("Capella","Orientação a objetos 2",2025);
        Item livro3 = new Livro("Dos Santos","Orientação a objetos 3",2025);
        Item revista = new Revista("Yuri","Orientação a objetos 4",2025,1);
        Biblioteca biblioteca = new Biblioteca();

        exercicio01(livro,livro2,livro3, biblioteca);
        exercicio02(livro, biblioteca);
        exercicio03(revista,biblioteca);
        exercicio04(livro,revista,biblioteca);
    }

    public static void exercicio01(Item livro, Item livro2, Item livro3,  Biblioteca biblioteca) {
        System.out.println("=================");
        System.out.println("Exercicio 1");

        biblioteca.adicionarItem(livro);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(livro3);
        biblioteca.listarItems();
    }

    public static void exercicio02(Item livro,  Biblioteca biblioteca) {
        System.out.println("=================");
        System.out.println("Exercicio 2");

        livro.setTitulo("abc");
        livro.setAnoPublicacao(-1);
        livro.setAutor("ab");

        livro.setTitulo("abcd");
        Item livro2 = biblioteca.buscarItemPorTitulo("abcd");
        livro2.exibirDetalhes();
    }

    public static void exercicio03(Item revista,  Biblioteca biblioteca) {
        System.out.println("=================");
        System.out.println("Exercicio 3");

        biblioteca.adicionarItem(revista);
        biblioteca.listarItems();
    }

    public static void exercicio04(Item livro, Item revista,  Biblioteca biblioteca) {
        System.out.println("=================");
        System.out.println("Exercicio 4");

        System.out.println(livro.getTipo());
        System.out.println(revista.getTipo());
    }
}
