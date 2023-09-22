//classe livro
public class Livro {

    //atributos da classe livro
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private double preco;

    //metodos get e set (encapsulamento)
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //metodo para imprimir os valores que serao setados para um objeto da classe Livro, usando comando  soutv

    public void imprimir() {
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("anoPublicacao = " + anoPublicacao);
        System.out.println("preco = " + preco);

    }
}