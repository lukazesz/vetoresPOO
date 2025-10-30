// 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i. 

public class Main {

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetorB = new int[15];

        for(int i = 0; i < vetorA.length; i ++){
            vetorB[i] = vetorA[i] * i;
            System.out.println(vetorB[i]);
        }

    }
}