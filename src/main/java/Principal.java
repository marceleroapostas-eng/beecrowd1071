
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int soma = 0;

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);

        for (int i = menor + 1; i < maior; i++) {

            if (i % 2 != 0) {
                soma += i;

            }
        }
        System.out.println(soma);

        leitor.close();
    }
}
