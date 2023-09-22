public class Exer02 {
    public static void main(String[] args) {
        int[] vetor1 = {2, 4, 6, 8, 10, 1, 3, 6, 9, 11};
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i < vetor1.length; i++){

            if(vetor1[i] > maior) {
                maior = vetor1[i];
            }

            if(vetor1[i] < menor) {
                menor = vetor1[i];
            }
        }
        System.out.println("Maior: " + maior +". Menor: " + menor);
    }
}
