import java.util.Random;

public class Exer05 {
    public static void main(String[] args) {
        Random randon = new Random();
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matriz3 = new int[2][2];


        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++){

                matriz1[i][j] = randon.nextInt(0, 10);
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++){

                matriz2[i][j] = randon.nextInt(0, 10);
            }
        }
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++){

                matriz2[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
    }
}
