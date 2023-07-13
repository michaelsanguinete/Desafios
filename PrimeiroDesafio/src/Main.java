import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja digitar? ");
        int numerosDigitados = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 1; i <= numerosDigitados; i++){ // Defini o i como 1, para ficar legível no System.out.print
            System.out.print("Digite o " + i + "º número: ");
            int valor = scanner.nextInt();
            if (valor % 2 == 0) pares.add(valor);
            else impares.add(valor);
        }

        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        System.out.println("Números pares ordenados de forma crescente:");
        for (int par : pares) {
            System.out.println(par);
        }

        System.out.println("Números ímpares ordenados de forma descrecente");
        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}