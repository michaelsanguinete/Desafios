import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas frases deseja decifrar? ");
        int numeroFrases = scanner.nextInt();
        scanner.nextLine();

        List<String> frasesDecifradas = new ArrayList<>();

        for (int i = 1; i <= numeroFrases; i++) {
            System.out.print("Digite a " + i + "ª frase: ");
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            frasesDecifradas.add(linhaDecifrada);
        }

        for (String linhaDecifrada : frasesDecifradas) {
            System.out.println(linhaDecifrada);
        }
    }

    public static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        int meio = tamanho / 2;
        StringBuilder linhaDecifrada = new StringBuilder(tamanho);

        for (int i = meio - 1; i >= 0; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= meio; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }
        return linhaDecifrada.toString();
    }
}