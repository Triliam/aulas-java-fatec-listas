//classe BibliotecaTeste
public class BibliotecaTeste {

    //metodo main (onde vai instanciar objetos e rodar o codigo
    public static void main(String[] args) {

        //criando instancia do objeto da classe Livro
        Livro livro = new Livro();

        //setando valores para os atributos do objeto livro

        //chama o objeto (livro), chama o metodo(setTitulo) e define o valor ("As brumas de avalon')
        livro.setTitulo("As Brumas de Avalon");
        livro.setAutor("Marion Zimmer Bradley");
        livro.setAnoPublicacao("1979");
        livro.setPreco(45.00);

        //metodo imprimir
        livro.imprimir();
    }
}