// Utilizando métodos estáticos fora do método main para um código mais conciso
// Desafio - Conta bancária com métodos de consulta de dados, transferência e depósito.

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        //instanciando objetos
        Scanner scanner = new Scanner(System.in);

        //declaração das variaveis
        String nome = "Luciana Barreto";
        String conta = "Conta Corrente";
        double saldo = 2780.42;


        //exibição dos dados iniciais
        System.out.printf("""
                **********************************************
                Dados Iniciais do Cliente:
                
                Nome:             %s
                Tipo de conta:    %s
                Saldo inicial:    R$ %.2f
                **********************************************""", nome, conta, saldo);
        int opcao;
        do{
            exibirMenu();
            opcao = lerOpcao(scanner);
            //processos de exibição de saldo, deposito, tranferencia e finalização do programa
            processaOpcao(opcao, saldo, scanner);
        } while (opcao != 4);
        scanner.close();
    }

    public static void exibirMenu(){
        System.out.println("""
                \nOperações
                
                1 - Consultar dados
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:""");
    }

    //verifica se o valor inserido para opção é valido
    public static int lerOpcao(Scanner s){
        int op;
        while (true){
            // Bloco Try Catch garante que será inserido um valor inteiro
            try{
                op = s.nextInt();
                if (op >= 1 && op <= 4)
                {
                    return op;
                } else {
                    System.out.println("Por favor, insira uma opção válida (1 a 4)");
                }
            } catch (InputMismatchException e){
                mensagemErroInputMismatchException(s);
            }
        }
    }

    public static void processaOpcao(int op, double saldo, Scanner scanner){
        switch (op){
            case 1:
                consultarDados(saldo);
                break;
            case 2:
                depositarValor(scanner, saldo);
                break;
            case 3:
                transferirValor(scanner, saldo);
                break;
            case 4:
                System.out.println("Fechando o Programa");
                break;
            default:
                System.out.println("Por favor, escolha uma opção válida (1 a 4).");
                break;
        }
    }

    public static void consultarDados(double saldo){
        System.out.printf("O saldo atual é R$%.2f\n", saldo);
    }

    public static void depositarValor(Scanner scanner, double saldo){
        System.out.println("Digite a quantia que deseja depositar:");
        // Tratamento de erros caso sejam inseridos velores nao numericos
        try {
            double deposito = scanner.nextDouble();
            if (deposito > 0){
                saldo += deposito;
                System.out.printf("""
                                Saldo atualizado
                                Saldo atual: R$%.2f\n""", saldo);
            } else{
                System.out.println("O valor do depósito deve ser maior que zero");
            }
        } catch (InputMismatchException e) {
            mensagemErroInputMismatchException(scanner);
        }
    }

    public static void transferirValor(Scanner scanner, double saldo){
        System.out.println("Digite o valor que deseja Transferir:");
        //Tratamento de erros caso sejam inseridos velores nao numericos
        try {
            double transferencia = scanner.nextDouble();
            if (transferencia <= saldo){
                saldo -= transferencia;
                System.out.printf("""
                                Transferencia de R$%.2f realizada
                                Saldo atual: R$%.2f\n""", transferencia, saldo);
            } else {
                System.out.println("Não há saldo suficiente para realizar essa transferência");
            }
        } catch (InputMismatchException e) {
            mensagemErroInputMismatchException(scanner);
        }

    }

    //mensagem de erro quando é inserido um valor nao numerico no scanner
    public static void mensagemErroInputMismatchException(Scanner scanner){
        System.out.println("Por favor, insira um valor numérico válido.");
        //limpa o buffer
        scanner.next();
    }
}
