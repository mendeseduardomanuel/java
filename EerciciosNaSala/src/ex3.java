import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double QSimples = 50.00;
        double QDuplo = 100.00;
        double QLuxo = 120.00;

        System.out.println("Bem Vindo NO Nosso Hotel");
        System.out.println("Escolhe o tipo de quarto: ");
        System.out.println("1. Quarto Simples 50.00 por noite ");
        System.out.println("2. Quarto Duplo 75.00 por noite ");
        System.out.println("3. Quarto de Luxo 120.00 por noite");
        int TQuarto = scanner.nextInt();

        System.out.println("Insira o numero de noites: ");
        int Nnoites = scanner.nextInt();

        double Cinicial = 0;


        switch (TQuarto){
            case  1:
                Cinicial = QSimples * Nnoites;
            case 2:
                Cinicial = QDuplo * Nnoites;
            case 3:
                Cinicial = QLuxo * Nnoites;
            default:
                System.out.println("Codigo do quarto errado");
        }

        double desconto = 0;

        if (Nnoites > 7) {

            desconto = 0.10 * Cinicial;
        }

        double TServico = 0.05 * Cinicial;

        double CTotal = Cinicial - desconto + TServico;

        System.out.println("O tipo de quarto é :"+ (TQuarto == 1 ? "Simples" : TQuarto == 2 ? "Duplo": "Luxo"));
        System.out.println("O desconto é de : "+ desconto);
        System.out.println("A taxa de serviço é :"+ TServico);
        System.out.println("Os custos Iniciais é "+ Cinicial);
        System.out.println("O custo total é "+ CTotal);
    }
}
