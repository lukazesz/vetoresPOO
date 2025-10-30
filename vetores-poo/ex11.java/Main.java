//11.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares. 

public class Main {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < vetorA.length; i ++){
            if (vetorA[i] % 2 == 0){
                int[] elementosPares = vetorA;
                System.out.println(elementosPares[i]);
            }
        }

    }
}