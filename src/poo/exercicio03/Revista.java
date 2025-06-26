package poo.exercicio03;

public class Revista extends Livro{
    private int edicao;

    public Revista(String autor, String titulo, int anoPublicacao, int edicao) {
        super(autor, titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Edição: " + edicao);
    }
}
