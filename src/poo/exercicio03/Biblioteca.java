package poo.exercicio03;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for(int i = 0; i < livros.size(); i++){
            System.out.println("=================");
            System.out.printf("%s\n\n",livros.get(i).getClass().getSimpleName());
            livros.get(i).exibirDetalhes();
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                livroPorTitulo = livro;
            }
        }
        return livroPorTitulo;
    }
}
