import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double QSimples = 50.00;
        double QDuplo = 75.00;
        double QLuxo = 120.00;

        System.out.println("Bem Vindo No Nosso Hotel");
        System.out.println("Escolhe o tipo de quarto: ");
        System.out.println("1. Quarto simples 50.00Kz por dia");
        System.out.println("2. Quarto Duplo 75.00Kz por dia");
        System.out.println("3. Quarto de Luxo 120.00Kz por dia");
        int Tquarto = scanner.nextInt();

        System.out.println("Insira o numero de noites: ");
        int Nnoite = scanner.nextInt();

        double Cinicial = 0;

        switch (Tquarto){
            case 1:
                Cinicial = QSimples * Nnoite;
                break;
            case 2:
                Cinicial = QDuplo * Nnoite;
                break;
            case 3:
                Cinicial = QLuxo * Nnoite;
                break;
            default:
                System.out.println("Tipo de quarto Invalido");
                break;
        }

        double desconto = 0;

        if (Nnoite > 7) {

            desconto = 0.10 * Cinicial;
        }

        double TServico = 0.05 * Cinicial;

        double CTotal = Cinicial - desconto + TServico;

        System.out.println("Tipo de Quarto: " + (Tquarto == 1 ? "Simples" : Tquarto == 2 ? "Duplo" : "Luxo"));
        System.out.println("Numero de Noites: "+ Nnoite);
        System.out.println("Custo Inicial: "+ Cinicial);
        System.out.println("Desconto: "+ desconto);
        System.out.println("Taxa de Serviço: "+ TServico);
        System.out.println("Custo Total: "+ CTotal);
    }
}
