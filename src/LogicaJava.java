// Aplicando o básico de lógica de programação na linguagem Java
import java.util.Scanner;

public class LogicaJava
{
    public static void main(String[] args) {
        //VARIÁVEIS:
        int numeroInteiro;
        double numeroDecimal;
        boolean status;
        String palavra;

//        OPERADORES ARITMÉTICOS
//        SOMA "+"
//        SUBTRAÇÃO "-"
//        MULTIPLICAÇÃO "+"
//        DIVISÃO "/"
//        RESTO DE DIVISÃO "%"
        System.out.println("10 + 5 = " + (10 + 5));
        System.out.println("10 - 5 = " + (10 - 5));
        System.out.println("10 * 5 = " + (10 * 5));
        System.out.println("11 / 5 = " + (11 / 5));
        System.out.println("11 % 5 = " + (11 % 5));

//        OPERADORES RELACIONAIS
//        "==" (igual a)
//        "!=" (diferente de)
//        ">" (maior que)
//        ">=" (maior ou igual a)
//        "<" (menor que)
//        "<=" (menor ou igual a)
//
//        OPERADORES LÓGICOS
//        "&&" (AND)
//        "||" (OR)
//        "!" (NOT)
//
//        OPERADORES DE INCREMENTO
//        Operador de pré-incremento "++variável" aumenta o valor da variável em 1 antes de usar a variável em uma expressão
//        ex.:
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

//        Operador de pós-incremento "variável++" aumenta o valor da variável em 1 depois de usar a variável em uma expressão
        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5

//        CONVENÇÕES EM JAVA:
//        Nome de Classes
//          escritos como PascalCase(Upper CamelCase). Ex.: MinhaClasse
//
//        Nome de Métodos
//          escritos como camelCase. Ex.: meuMetodo()
//
//        Nome de Consntantes
//          escritos totalmente em MAIÚSCULO. Ex.: MINHA_CONSTANTE
//
//        Nome de Variáveis
//          escritos como camelCase. Ex.: minhaVariavel
//
//        Linhas de código devem ter no máximo 80 caracteres de largura
//
//        Espaços em branco após operadores, palavras chave e elementos de controle de fluxo
//          Ex.: if (condição) {procedimento}
//
//        Use comentários para documentar seu código, explicando o que faz, como faz e por que ele faz isso.
//
//      ----------------------------------------------------------------------------------------------------------------
//           TIPOS PRIMITIVOS
        boolean variavelBoolean = true; //representa valores lógicos (true or false)
        byte variavelByte = 127; //valores numéricos representador por até 8bits (-128 até 127)
        char variavelChar = 'a'; //Representado pelas aspas simples ''. Armazena qualquer caracter Unicode
        short variavelShort = 32767; //valores numéricos representados por até 16bits (-32768 até 32767)
        int variavelInt =  2147483647; //valores numéricos representados por até 32 bits (-2147483648 até 2147483647)
        long variavelLong =  2147483647; //valores numéricos representados por até 64bits (-922337203685775808 até 9223372036854775807)
        // Pelo visto o Java só usa o armazenamento até 32 bits. o tipo long é utilizado por empresas com maquinas que utilizam numeros de 64 bits
        float variavelFloat = 5.0001f; //numeros decimais com até 7 digitos (precisao limitada)
        // Utilizado em dispositivos IoT com menor capacidade computacional
        double variavelDouble = 0.0000000000000001; //ocupa 64 bits e pode possuir até 15 casas decimais (mais preciso)

//        STRING
//        É UMA CLASSE QUE FUNCIONA COMO UMA LISTA DE CHARS
        String VariavelString = "Teste String"; // Uma string é representada pelas aspas duplas ""

//        COMPARANDO STRINGS
        String senha = "12345";
        if (senha.equals("12345"))
        {
            System.out.println("Acesso autorizado!");
        } else
        {
            System.out.println("Acesso negado!");
        }
//        TEXTBLOCK (3 aspas duplas)
        String mensagem = """
                Linha 1
                Linha2
                Linha3
                .
                .
                .
                Penúltima linha
                Última linha""";
        System.out.print(mensagem);

//        METODO FORMAT()
//        %s para Strings
//        %d para Inteiros
//        %f para valores de Ponto Flutuante
        String nome = "Lucas";
        int idade = 19;
        double salario = 2580.76;
        System.out.println(String.format("Meu nome é %s, tenho %d anos e ganho %.2f por mês como desenvolvedor", nome, idade, salario));
        String mensagem1 = """
                Olá me chamo %s!
                Tenho %d anos e ganho %.2f por mês.""".formatted(nome, idade, salario);
        System.out.println(mensagem1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o tipo de escala de temperatura que deseja converter (C ou F): ");
        String TipoTemperatura = scan.nextLine();
        if (TipoTemperatura.equalsIgnoreCase("C"))
        {
            System.out.println("Insira a temperatura:");
            double temperatura = scan.nextDouble();
            System.out.println(String.format("%.1f°C em graus Fahrenheit é igual a %f°F",temperatura, ((temperatura * 1.8) + 32)));
        } else if (TipoTemperatura.equalsIgnoreCase("F"))
        {
            System.out.println("Insira a temperatura:");
            double temperatura = scan.nextDouble();
            System.out.println(String.format("%.1f°F em graus Celsius é igual a %f.1°C",temperatura, ((temperatura - 32) / 1.8)));
        } else
        {
            System.out.println("tipo inválido");
        }


    }
}