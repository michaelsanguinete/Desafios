import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor 'ESPAÇO' o número alvo: ");
        int tamanhoVetor = scanner.nextInt();
        int alvo = scanner.nextInt();

        int[] vetor = new int[tamanhoVetor];
        System.out.print("Digite os elementos do vetor separados por espaço: ");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        int contador = contaDiferencaAlvo(vetor, alvo);
        System.out.println("O vetor informado tem " + contador + " número(s) de pares entre os elementos do array em que a sua diferença seja igual ao valor alvo.");
    }

    public static int contaDiferencaAlvo(int[] vetor, int alvo) {
        Map<Integer, Integer> map = new HashMap<>();

        int contador = 0;

        for (int num : vetor) {
            if (map.containsKey(num - alvo)) {
                contador += map.get(num - alvo);
            }

            if (map.containsKey(num + alvo)) {
                contador += map.get(num + alvo);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return contador;
    }
}
