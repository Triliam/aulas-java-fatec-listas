import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomico = new Random();
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matriz3 = new int[2][2];

        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = randomico.nextInt(10);
                matriz2[i][j] = randomico.nextInt(10);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        System.out.println("Matriz 1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%2d]", matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%2d]", matriz2[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 3");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("[%2d]", matriz3[i][j]);
            }
            System.out.println();
        }
    }
}
