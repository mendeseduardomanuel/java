import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor por hora: ");
        double VHora = scanner.nextDouble();
        System.out.println("Insira o numero de aulas lecionadas por mês: ");
        int NAulas = scanner.nextInt();
        System.out.println("Insira a percentagem do desconto do INSS (em %): ");
        double DInss = scanner.nextDouble();
        double SBruto = VHora * NAulas;
        double desconto = SBruto * (DInss / 100);
        double SLiquido = SBruto - desconto;

        System.out.println("O salario Bruto do professor é :"+ SLiquido);

    }
}
