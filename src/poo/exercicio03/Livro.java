package poo.exercicio03;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String autor, String titulo, int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.length()>3){
            this.titulo = titulo;
        }else {
            System.out.println("O titulo deve ter no minimo 4 caracteres");;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor.length()>=3){
            this.autor = autor;
        }else {
            System.out.println("O autor deve ter no minimo 3 caracteres");
        }
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao>=0){
            this.anoPublicacao = anoPublicacao;
        }else  {
            System.out.println("O ano de publicação deve ser positivo");
        }

    }
}
