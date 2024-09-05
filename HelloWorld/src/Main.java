import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando programa...\n");

        System.out.println("\u001B[33m" +"""
                       "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eget ligula
                        eu lectus lobortis condimentum. Aliquam nonummy auctor massa.
                         Pellentesque habitant morbi tristique senectus et netus et malesuada 
                         fames ac turpis egestas. Nulla at risus. Quisque purus magna, auctor et,
                          sagittis ac, posuere eu, lectus. Nam mattis, felis ut adipiscing."
                       """+ "\u001B[0m");

        var scanner = new Scanner(System.in);
        System.out.println("Escreva seu texto abaixo:");
        var texto = scanner.nextLine();
        System.out.println(texto);

        System.out.println("Programa finalizado.");
    }
}