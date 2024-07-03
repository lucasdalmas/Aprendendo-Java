// Exercício para implementar o loop While e a Classe Random da biblioteca java.util

import java.util.Random;
import java.util.Scanner;

public class LoopWhileAdivinhacao2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dificuldade;
        int numeroAleatorio;
        int numeroChute;
        int numeroTentativas = 0;
        System.out.println("""
                Escolha a dificuldade de 1 a 3
                1: numeros de 0 a 10,
                2: numeros de 0 a 50
                3: numeros de 0 a 100""");
        dificuldade = scanner.nextInt();
        switch (dificuldade)
        {
            case 1:
                numeroAleatorio = random.nextInt(11);
                System.out.println(String.format("Dificuldade selecionada: %d. Você possui 3 tentativas. Digite um número",dificuldade));
                numeroChute = scanner.nextInt();

                while (numeroTentativas < 3 && numeroChute != numeroAleatorio)
                {
                    if (numeroChute > numeroAleatorio)
                    {
                        System.out.println(String.format("""
                           Errou!
                           O número é menor que %d
                           Digite outro número""",numeroChute));
                    } else
                    {
                        System.out.println(String.format("""
                           Errou!
                           O número é maior que %d
                           Digite outro número""",numeroChute));
                    }
                    numeroChute = scanner.nextInt();
                    numeroTentativas++;
                }

                if (numeroChute == numeroAleatorio)
                {
                    System.out.println(String.format("Parabens! Você acertou com %d tentativas. O número era %d", numeroTentativas, numeroAleatorio));
                } else
                {
                    System.out.println(String.format("Que pena, você não acertou. O numero era %d",numeroAleatorio));
                }

                break;
            case 2:
                numeroAleatorio = random.nextInt(51);
                System.out.println(String.format("Dificuldade selecionada: %d. Você possui 5 tentativas. Digite um número",dificuldade));
                numeroChute = scanner.nextInt();
                while (numeroTentativas < 5 && numeroChute != numeroAleatorio)
                {
                    if (numeroChute > numeroAleatorio)
                    {
                        System.out.println(String.format("""
                           Errou!
                           O número é menor que %d
                           Digite outro número""",numeroChute));
                    } else
                    {
                        System.out.println(String.format("""
                           Errou!
                           O número é maior que %d
                           Digite outro número""",numeroChute));
                    }
                    numeroChute = scanner.nextInt();
                    numeroTentativas++;
                }

                if (numeroChute == numeroAleatorio)
                {
                    System.out.println(String.format("Parabens! Você acertou com %d tentativas. O número era %d", numeroTentativas, numeroAleatorio));
                } else
                {
                    System.out.println(String.format("Que pena, você não acertou. O numero era %d",numeroAleatorio));
                }
                break;
            case 3:
                numeroAleatorio = random.nextInt(101);
                System.out.println(String.format("Dificuldade selecionada: %d. Você possui 5 tentativas. Digite um número",dificuldade));
                numeroChute = scanner.nextInt();
                while (numeroTentativas < 5 && numeroChute != numeroAleatorio)
                {
                    if (numeroChute > numeroAleatorio)
                    {
                        System.out.println(String.format("""
                           Errou!
                           O número é menor que %d
                           Digite outro número""",numeroChute));
                    } else
                    {
                        System.out.println(String.format("""
                           Errou!
                           O número é maior que %d
                           Digite outro número""",numeroChute));
                    }
                    numeroChute = scanner.nextInt();
                    numeroTentativas++;
                }

                if (numeroChute == numeroAleatorio)
                {
                    System.out.println(String.format("Parabens! Você acertou com %d tentativas. O número era %d", numeroTentativas, numeroAleatorio));
                } else
                {
                    System.out.println(String.format("Que pena, você não acertou. O numero era %d",numeroAleatorio));
                }
                break;
            default:
                System.out.println("valor inválido.");
                break;
        }

    }
}
