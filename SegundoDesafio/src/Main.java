import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("en", "US"));

        BigDecimal valor = scanner.nextBigDecimal();

        Locale.setDefault(Locale.US);

        BigDecimal nota100 = new BigDecimal("100");
        BigDecimal nota50 = new BigDecimal("50");
        BigDecimal nota20 = new BigDecimal("20");
        BigDecimal nota10 = new BigDecimal("10");
        BigDecimal nota5 = new BigDecimal("5");
        BigDecimal nota2 = new BigDecimal("2");

        BigDecimal moeda1 = new BigDecimal("1");
        BigDecimal moeda50 = new BigDecimal("0.50");
        BigDecimal moeda25 = new BigDecimal("0.25");
        BigDecimal moeda10 = new BigDecimal("0.10");
        BigDecimal moeda5 = new BigDecimal("0.05");
        BigDecimal moeda1Centavo = new BigDecimal("0.01");

        BigDecimal[] notas = { nota100, nota50, nota20, nota10, nota5, nota2 };
        BigDecimal[] moedas = { moeda1, moeda50, moeda25, moeda10, moeda5, moeda1Centavo };

        System.out.println("NOTAS:");
        for (BigDecimal nota : notas) {
            int quantidade = valor.divide(nota, 0, BigDecimal.ROUND_DOWN).intValue();
            System.out.println(quantidade + " nota(s) de R$" + nota);
            valor = valor.remainder(nota);
        }

        System.out.println("MOEDAS:");
        for (BigDecimal moeda : moedas) {
            int quantidade = valor.divide(moeda, 0, BigDecimal.ROUND_DOWN).intValue();
            System.out.println(quantidade + " moeda(s) de R$" + moeda);
            valor = valor.remainder(moeda);
        }
    }
}