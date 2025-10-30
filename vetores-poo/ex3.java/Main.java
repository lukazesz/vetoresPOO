// 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I]. 

public class Main {
    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] vetorB = new int[15];

        for(int i = 0; i < vetorA.length; i ++){
            vetorB[i] = vetorA [i] * vetorA[i];
            System.out.println(vetorB[i]);
        }
        
    }
}
