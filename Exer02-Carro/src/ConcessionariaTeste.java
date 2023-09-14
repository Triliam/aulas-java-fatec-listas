public class ConcessionariaTeste {
    public static void main(String[] args) {

        //definindo valores atraves do metodo construtor
       Carro gol = new Carro("Gol", "2000", 30.000);

       gol.imprimir();

       //alterando valor com o metodo setValor
       gol.setPreco(40.00);

       gol.imprimir();
    }
}