// 12.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor. 

public class Main {
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int soma = 0;
        for(int i = 0; i < vetorA.length; i ++){
            soma = soma + vetorA[i];
        }
        System.out.println(soma);

    }
}