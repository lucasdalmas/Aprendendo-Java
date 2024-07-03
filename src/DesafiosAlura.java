// Desafios de fim de curso propostos pela Alura

import java.util.Scanner;

public class DesafiosAlura
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//      Desafio 1 - Verificação de um numero inserido é positivo, negativo ou igual a zero (Operadores relacionais maior > e menor < )
        double numero;
        System.out.println("""
                ---- DESAFIO 1 ----
                Teste se um número é positivo ou negativo
                Insira um número""");
        numero = scan.nextDouble();
        if (numero > 0)
        {
            System.out.println(String.format("%.2f é positivo",numero));
        } else if (numero < 0)
        {
            System.out.println("Este número é negativo");
        } else
        {
            System.out.println("Zero não é nem positivo nem negativo");
        }

//      Desafio 2 - Verificação de 2 números para saber qual é o maior (Operadores relacionais maior > e menor < )
        double a, b;
        System.out.println("""
                
                ---- DESAFIO 2 ----
                Teste qual número é maior que o outro
                Insira um número""");
        a = scan.nextDouble();
        System.out.println("Insira outro número");
        b = scan.nextDouble();
        if (a > b)
        {
            System.out.println(String.format("%.2f é maior que %.2f.", a, b));
        } else if (a < b)
        {
            System.out.println(String.format("%.2f é menor que %.2f.", a, b));
        } else
        {
            System.out.println(String.format("%.2f e %.2f são iguais", a, b));
        }

//      Desafio 3 - Cálculo de área de um polígono (Operadores Aritméticos Multiplicação e Divisão)
        int opcao;
        double area;
        System.out.println("""
                
                ---- DESAFIO 3 ----
                Calcule a área de uma figura
                Selecione a figura que deseja calcurar a área:
                1 - Círculo
                2 - Quadrado
                3 - Triângulo""");
        opcao = scan.nextInt();
        switch (opcao)
        {
            case 1:
                System.out.println("Insira o valor do raio do círculo");
                double raio = scan.nextDouble();
                area = raio * raio * 3.14;
                System.out.println(String.format("A área do círculo de raio %.2f é %.2f", raio, area));
                break;
            case 2:
                System.out.println("Insira o valor do lado do quadrado");
                double lado = scan.nextDouble();
                area = lado * lado;
                System.out.println(String.format("A área do quadrado de lado %.2f é %.2f", lado, area));
                break;
            case 3:
                System.out.println("Insira o valor da base");
                double base = scan.nextDouble();
                System.out.println("Insira o valor da altura");
                double altura = scan.nextDouble();
                area = (base * altura) / 2;
                System.out.println(String.format("A área do triângulo de base %.2f e altura %.2f é %.2f", base, altura, area));
                break;
            default:
                System.out.println("Opção inválida");
                break;


        }

//      Desafio 4 - Apresente a tabuáda de um numero qualquer inserido (Loop For e Método String.format() )
        int num;
        System.out.println("""
                
                ---- DESAFIO 4 ----
                Descubra a tabuada de um número qualquer
                Insira um número inteiro""");
        num = scan.nextInt();
        System.out.println(String.format("A tabuada de %d é:", num));
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%d x %d = %d", num, (i + 1), (i + 1) * num));
        }

//      Desafio 5 - Verifique se um número inteiro inserido é ímpar ou par (Operador relacional Igual == )
        int num2;
        System.out.println("""
                
                ---- DESAFIO 5 ----
                Saiba se um número é ímpar ou par
                Insira um número inteiro""");
        num2 = scan.nextInt();
        int testeResto = num2 % 2;
        if (testeResto == 1)
        {
            System.out.println(String.format("%d é ímpar", num2));
        } else
        {
            System.out.println(String.format("%d é par", num2));
        }

//      Desafio 6 - Cálculo Iterativo do Fatorial de um número
        int num3;
        int fatorial;
        System.out.println("""
                
                ---- DESAFIO 6 ----
                Saiba o valor do fatorial de um número (funciona até o 13) 
                Insira um número inteiro""");
        // O fatorial de 14 é grande demais para ser armazenado no tipo inteiro int
        num3 = scan.nextInt();
        fatorial = 1;
        for (int i = 1; i <= num3; i++) {
            fatorial *= i;
        }
        System.out.println(String.format("%d fatorial é igual a %d", num3, fatorial));
        scan.close();
    }
}
