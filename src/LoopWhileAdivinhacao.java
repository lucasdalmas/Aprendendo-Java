// Exercício para implementar o loop While e a Classe Random da biblioteca java.util

import java.util.Random;
import java.util.Scanner;

public class LoopWhileAdivinhacao
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dificuldade;
        int numeroAleatorio;
        int numeroChute;
        System.out.println("""
                Escolha a dificuldade de 1 a 3
                1 = numeros de 0 a 10,
                2 = numeros de 0 a 50
                e 3 = numeros de 0 a 100""");
        dificuldade = scanner.nextInt();
        switch (dificuldade)
        {
            case 1:
                numeroAleatorio = random.nextInt(11);
                System.out.println(String.format("Dificuldade selecionada: %d. Digite um número",dificuldade));
                numeroChute = scanner.nextInt();
                while (numeroChute != numeroAleatorio)
                {
                    System.out.println("""
                           Errou!
                           Digite outro número""");
                    numeroChute = scanner.nextInt();
                }
                System.out.println(String.format("Parabens! Você acertou. O número era %d",numeroAleatorio));
                break;
            case 2:
                numeroAleatorio = random.nextInt(51);
                System.out.println(String.format("Dificuldade selecionada: %d. Digite um número",dificuldade));
                numeroChute = scanner.nextInt();
                while (numeroChute != numeroAleatorio)
                {
                    System.out.println("""
                           Errou!
                           Digite outro número""");
                    numeroChute = scanner.nextInt();
                }
                break;
            case 3:
                numeroAleatorio = random.nextInt(101);
                System.out.println(String.format("Dificuldade selecionada: %d. Digite um número",dificuldade));
                numeroChute = scanner.nextInt();
                while (numeroChute != numeroAleatorio)
                {
                    System.out.println("""
                           Errou!
                           Digite outro número""");
                    numeroChute = scanner.nextInt();
                }
                break;
            default:
                System.out.println("valor inválido.");
                break;
        }

    }
}
