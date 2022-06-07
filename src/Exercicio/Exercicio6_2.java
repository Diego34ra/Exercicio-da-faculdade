package Exercicio;

import java.util.Scanner;

public class Exercicio6_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v[] = new int[10];
        String resp2;
        String opcoes[] = {"Quantidade de numeros pares e impares.", "Quantidade de numeros primos.",
                "Quantidade de numeros positivos e negativos.",
                "Quantidade de numeros multiplos de um determinado numero.",
                "O maior e menor valor presente no vetor." ,
                "verificar se existem numeros duplicados."};

        System.out.println("Vetor Gerado:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (-11 + Math.random() * 22);
            System.out.print(v[i] + " ");
        }
        do {
            System.out.println("\n--------------------------");
            System.out.println("Tabela de opcoes");
            System.out.println("--------------------------");
            for (int i = 0; i < opcoes.length; i++) {
                System.out.printf("%d - %s\n", i + 1, opcoes[i]);
            }
            System.out.println("--------------------------");
            System.out.println("Sua opcao: ");
            int resp = ler.nextInt();

            switch (resp) {
                case 1:
                    System.out.printf("A quantidade de numeros pares e %d e de impares e %d", Metodo.par(v), v.length - Metodo.par(v));
                    break;
                case 2:
                    System.out.printf("No total tem %d numeros primos no vetor.", Metodo.primo(v));
                    break;
                case 3:
                    System.out.printf("Sao %d numeros positivos e %d negativos.", Metodo.positivo(v), Metodo.negativo(v));
                    break;
                case 4:
                    System.out.println("Qual número deseja verificar? ");
                    int y = ler.nextInt();
                    System.out.printf("Existem %d numeros multiplos de %d dentro do vetor.", Metodo.multiplo(y, v), y);
                    break;
                case 5:
                    System.out.printf("O maior numero e %d e o menor e %d", Metodo.maior(v), Metodo.menor(v));
                    break;
                case 6:
                    Metodo.duplicado(v);
                    break;
            }
            System.out.println("\nDeseja continuar [S/N]?");
            resp2 = ler.next().toUpperCase();
            resp2 = String.valueOf(resp2.charAt(0));
        }while(!resp2.equals("N"));
        System.out.println("Finalizando o sistema!");
    }
}
