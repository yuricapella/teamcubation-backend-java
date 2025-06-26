package poo.exercicio02;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Yuri","Orientação a objeto 1",2025);
        Livro livro2 = new Livro("Capella","Orientação a objeto 2",2025);
        Livro livro3 = new Livro("Dos Santos","Orientação a objeto 3",2025);
        Biblioteca biblioteca = new Biblioteca();

        exercicio01(livro,livro2,livro3, biblioteca);
        exercicio02(livro, biblioteca);
    }

    public static void exercicio01(Livro livro, Livro livro2, Livro livro3,  Biblioteca biblioteca) {
        System.out.println("=================");
        System.out.println("Exercicio 1");

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.listarLivros();
    }

    public static void exercicio02(Livro livro,  Biblioteca biblioteca) {
        System.out.println("=================");
        System.out.println("Exercicio 2");

        livro.setTitulo("abc");
        livro.setAnoPublicacao(-1);
        livro.setAutor("ab");

        livro.setTitulo("abcd");
        Livro livro2 = biblioteca.buscarLivroPorTitulo("abcd");
        livro2.exibirDetalhes();
    }
}
