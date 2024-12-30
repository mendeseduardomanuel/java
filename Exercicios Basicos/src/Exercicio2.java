import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int n1 = scanner.nextInt();
        System.out.println("Insira o segundo numero");
        int n2 = scanner.nextInt();
        System.out.println("Insira o terceiro numero");
        int n3 = scanner.nextInt();

        int maior = Math.max(n1, Math.max(n2,n3));
        int menor = Math.min(n1, Math.min(n2, n3));
        System.out.println("O maior numero é: "+ maior);
        System.out.println("O menor numero é: "+ menor);
    }
}
