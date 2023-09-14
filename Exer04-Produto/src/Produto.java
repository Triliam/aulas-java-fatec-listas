public class Produto {

    private String nome;
    private String descricao;
    private int qtdEmEstoque;
    private double precoUnitario;

    private String testaLimpaBuffer;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getTestaLimpaBuffer() {
        return testaLimpaBuffer;
    }

    public void setTestaLimpaBuffer(String testaLimpaBuffer) {
        this.testaLimpaBuffer = testaLimpaBuffer;
    }

    public void imprimir() {
        System.out.println("nome = " + nome);
        System.out.println("descricao = " + descricao);
        System.out.println("qtdEmEstoque = " + qtdEmEstoque);
        System.out.println("precoUnitario = " + precoUnitario);
        System.out.println("testaLimpaBuffer = " + testaLimpaBuffer);
    }
}
