import java.util.Random;

public class Exer04 {
    public static void main(String[] args) {

        Random randon = new Random();
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){

                matriz[i][j] = randon.nextInt(0, 10);
            }
        }

        // Calcular a soma da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Calcular a soma da diagonal secundária
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        // Exibir a matriz e as somas
        System.out.println("Matriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
