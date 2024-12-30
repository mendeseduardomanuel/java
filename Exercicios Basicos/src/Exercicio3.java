import java.util.Scanner;
public class
Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira o "+ (i)+" numero: ");
            int n = scanner.nextInt();

            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("O maior numero é "+ maior);
    }
}
