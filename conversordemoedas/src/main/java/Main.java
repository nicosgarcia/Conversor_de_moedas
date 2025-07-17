import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[][] opcoes = {
      {"USD", "BRL"}, // 1
      {"BRL", "USD"}, // 2
      {"EUR", "BRL"}, // 3
      {"BRL", "EUR"}, // 4
      {"ARS", "BRL"}, // 5
      {"BRL", "ARS"} // 6
    };

    System.out.println("=== Conversor de Moedas ===");
    System.out.println("1 - Dólar para Real");
    System.out.println("2 - Real para Dólar");
    System.out.println("3 - Euro para Real");
    System.out.println("4 - Real para Euro");
    System.out.println("5 - Peso Argentino para Real");
    System.out.println("6 - Real para Peso Argentino");

    System.out.print("Escolha uma opção (1 a 6): ");

    int opcao = scanner.nextInt();

    if (opcao < 1 || opcao > 6) {
      System.out.println("Opção Invalida!");
        return;
    }

    System.out.print("Digite o valor a ser convertido: ");
    double valor = scanner.nextDouble();

    String de = opcoes[opcao - 1][0];
    String para = opcoes[opcao - 1][1];

    try {
      double taxa = Conversor.buscarTaxa(de, para);
      double convertido = valor * taxa;

      System.out.printf("%.2f %s = %.2f %s%n", valor, de, convertido, para);
    } catch (Exception e) {
      System.out.println("Erro ao buscar taxa de conversão: " + e.getMessage());
    }

    scanner.close();
  }
}