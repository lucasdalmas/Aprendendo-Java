// Aprendendo a utilizar o loop for

import java.util.Scanner;

public class LoopFor
{
    public static void main(String[] args)
    {
//        Calculadora de médias
//        Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o numero de provas ");
        int numeroDeProvas = scan.nextInt();
        double nota = 0;
        double somaNotas = 0;
        System.out.println("Insira as notas:");
        for (int i = 0; i < numeroDeProvas; i++) {
            nota = scan.nextDouble();
            if (nota < 0 || nota > 10)
            {
                System.out.println("Nota inválida!");
                i = i - 1;
            } else
            {
                somaNotas += nota;
            }

        }
        double media = somaNotas / numeroDeProvas;
        System.out.println(String.format("Sua média é %.2f.",media));
    }
}
