package poo.exercicios01_a_04;

public class Livro extends Item{

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    public String getTipo(){
        String tipo = this.getClass().getSimpleName();
        return tipo;
    }
}
