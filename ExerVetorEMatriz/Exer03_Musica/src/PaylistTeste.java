import java.util.Scanner;

public class PaylistTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Musica playlist = new Musica();

        System.out.println("Qual o nome da musica? ");
        playlist.setNome(scan.nextLine());


        System.out.println("Qual o nome do artista? ");
        playlist.setArtista(scan.nextLine());


        System.out.println("Qual a duração? ");
        playlist.setDuracao(scan.nextLine());


        System.out.println("Qual o genero? ");
        playlist.setGenero(scan.nextLine());
       

        playlist.imprimir();
    }
}