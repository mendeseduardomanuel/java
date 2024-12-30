import java.util.Scanner;
public class Media {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a quantidade de maximo: ");
        Double QuantidadeMaxima = scanner.nextDouble();

        System.out.println("Qual é a quantidade minima ");
        int QuantidadeMinima = scanner.nextInt();

        System.out.println("A media do stock é:"+ QuantidadeMaxima + QuantidadeMinima/2);

    }
}
