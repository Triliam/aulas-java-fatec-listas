public class Exer01 {
    public static void main(String[] args) {

        int[] vetor1 = {2, 4, 6, 8, 10, 1, 3, 6, 9, 11};
        int soma = 0;

        for(int i = 0; i < vetor1.length; i++){

            soma = soma + vetor1[i];
        }
        System.out.println(soma);
    }

}
