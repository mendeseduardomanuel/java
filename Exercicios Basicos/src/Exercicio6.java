import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double SMinimo = 70000;
        System.out.println("Insisa o valor do salrio: ");
        double SUsuario = scanner.nextDouble();

        double Qsalario = SUsuario/SMinimo;
        System.out.println("O usuario ganha "+Qsalario+" salarios minimos");
    }
}
