import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        double n = scanner.nextDouble();

        double Reajuste = n * 1.05;

        System.out.println("O valor com reajuste de 5% é :"+ Reajuste);
    }
}
