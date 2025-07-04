package poo.exercicios01_a_04;

public abstract class Item implements ItemBiblioteca{
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Item(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
    }

    public abstract String getTipo();

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setTitulo(String titulo) {
        if(titulo.length()>3){
            this.titulo = titulo;
        }else {
            System.out.println("O titulo deve ter no minimo 4 caracteres");;
        }
    }

    public void setAutor(String autor) {
        if(autor.length()>=3){
            this.autor = autor;
        }else {
            System.out.println("O autor deve ter no minimo 3 caracteres");
        }
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao>=0){
            this.anoPublicacao = anoPublicacao;
        }else  {
            System.out.println("O ano de publicação deve ser positivo");
        }

    }
}
