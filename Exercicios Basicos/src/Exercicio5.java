import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do produtos: ");
        double valor = scanner.nextDouble();

        System.out.println(" Escolha o modo de pagamento: ");
        System.out.println("1. Vista em dinheiro, recebe 15% de desconto");
        System.out.println("2. Vista no Cartão de Credito, recebe 10% de desconto");
        System.out.println("3. Parcela no Cartão duas Vezes, Preço normal do produto sem juros");
        System.out.println("4. Parcela no Cartão em três vezes ou mais, preço normal do produto mais com juros de 10%");
        int op = scanner.nextInt();

        double VFinal = 0;

        switch (op){
            case 1:
                VFinal = valor * 0.85;
                break;
            case 2:
                VFinal = valor * 0.90;
                break;
            case 3:
                VFinal = valor;
                break;
            case 4:
                VFinal = valor * 1.10;
        }

        System.out.println("O valor final a ser pago é :"+ VFinal);
    }
}
