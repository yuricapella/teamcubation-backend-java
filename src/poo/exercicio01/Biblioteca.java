package poo.exercicio01;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for(int i = 0; i < livros.size(); i++){
            System.out.println("=================");
            System.out.println("=====LIVRO "+(i+1)+"=====");
            livros.get(i).exibirDetalhes();
        }
    }
}
