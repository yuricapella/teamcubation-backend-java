package poo.exercicio01;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Yuri","Orientação a objeto 1",2025);
        Livro livro2 = new Livro("Capella","Orientação a objeto 2",2025);
        Livro livro3 = new Livro("Dos Santos","Orientação a objeto 3",2025);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.listarLivros();
    }
}
