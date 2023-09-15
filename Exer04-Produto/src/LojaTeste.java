import java.util.Scanner;

public class LojaTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Produto prod = new Produto();

        System.out.println("Qual o nome do produto? ");
        prod.setNome(scan.nextLine());

        System.out.println("Qual a descrição do produto? ");
        prod.setDescricao(scan.nextLine());

        System.out.println("Qual a quantidade desse produto? ");
        prod.setQtdEmEstoque(scan.nextInt());

        System.out.println("Qual o valor do produto? ");
        prod.setPrecoUnitario(scan.nextDouble());
        scan.nextLine(); //forma de limpar o buffer com  nextLine() (após cada chamada para nextInt(), nextDouble()) e nao com sout que eu tinha falado

        System.out.println("limpou o buffer? ");
        prod.setTestaLimpaBuffer(scan.nextLine());

        prod.imprimir();
    }
}
