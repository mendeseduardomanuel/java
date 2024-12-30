import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero");
        int n = scanner.nextInt();

        for (int i = n; i <= 200 ; i++) {
            System.out.println(i);
        }
    }
}
