import java.util.Scanner;
public class ConsumoDeElectricidade {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a quantidade gasta por mês: ");
        Double QuantidadeGasta = scanner.nextDouble();

        System.out.println("Qual é a quantidade de dias consumidos: ");
        int QuantidadeDias = scanner.nextInt();

        System.out.println("O total a pagar é:"+ QuantidadeGasta * QuantidadeDias);

    }
}
