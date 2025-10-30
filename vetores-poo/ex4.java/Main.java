// 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]). 

public class Main {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        double[] vetorB = new double[15];

        for(int i = 0; i < vetorA.length; i ++){
            vetorB[i] = Math.sqrt (vetorA[i]);
            System.out.println(vetorB[i]);
        }

    }
}   