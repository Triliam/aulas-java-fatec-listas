public class Carro {

    private String modelo;
    private String ano;
    private double preco;

    //metodo construtor
    public Carro(String modelo, String ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("modelo = " + modelo);
        System.out.println("ano = " + ano);
        System.out.println("preco = " + preco);
    }
}
