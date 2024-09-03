import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //operadores()
        var calculo = 1 + 2 - (3 * 2) / 5.0;
        System.out.println(calculo);
        calculo --; // aumentar ou diminuir mais um --, ++
        System.out.println(calculo);


        //condicionais()
        var scanner = new Scanner(System.in);
        System.out.println("Digite a idade:");
        var idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >=18 && idade <= 200)
        System.out.println("A pessoa é maior de idade");
        else if (idade > 200)
        System.out.println("Apessoa é um vampiro");
        else
        System.out.println("A pessoa é menor de idade");



    }

    public static void variaveis() {

        System.out.println("Sistema Iniciando...");

        var scan = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
        var numero1 = scan.nextBigDecimal();
        scan.nextLine();/* para poder pular linha para quando usar o nextInt */
        System.out.println("Digite o numero 2");
        var numero2 = scan.nextBigDecimal();
        scan.nextLine();

        System.out.println(numero1.add(numero2));

        String nome = "Fiap";
        System.out.println(nome);

        int numero = 10; /* só para números inteiros*/
        System.out.println(numero + 10);

        double valor = 10.5; /* para números com vírgula*/
        System.out.println(numero + 10.5);

        long valorGrande = 10000000000000000L; /* número grande mas sempre tem que colocar um L no final*/
        short valorPequeno = 10;

        char letra = 'A'; /*uma UNICA letra */
        boolean verdadeiro = true; /*condição: verdadeiro or false*/

        var numeroTexto = "10";
        var numeroConvertido = Integer.parseInt(numeroTexto); //conversõ explicita de texto para numero

        //declaração de variaveis
        int idade;
        //inicialização de variaveis , vocÊ estar dando o valor da variavel
        idade = 10;
        idade = 20;
        idade = 30;
        //declaração e inicialização
        var idade2 = 10;



        System.out.println("Sistema Finalizando..");

    }
}