// Determinar o valor a ser pago por um produto com base na forma de pagamento.
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do Produto: ");
        double valor = scanner.nextDouble();

        double Vfinal = 0;
        if (valor > 500) {
            Vfinal = valor * 0.80;
        } else if (valor >= 200 && valor <= 500) {
            Vfinal = valor * 0.90;
        } else if (valor < 200) {
            Vfinal = valor;
        }

        System.out.println("O valor a ser pago é: "+ Vfinal);
    }
}
