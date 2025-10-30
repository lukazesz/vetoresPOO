//10.Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o resto da divisão do respectivo elemento de A por 2 (dois), ou seja: B[i] = A[i] % 2. 

public class Main {
     
     public static void main(String[] args) {
        int[] vetorA = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] vetorB = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for(int i = 0; i < vetorA.length; i ++){
            vetorB[i] = vetorA[i] % 2;
            System.out.println(vetorB[i]);
        }

    }


}