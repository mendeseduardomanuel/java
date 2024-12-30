import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Salario Ate 70.000,00(incluindo), recebera aumento de 20%");
        System.out.println("2.Salario Ate 70.000,00 e 90.000,00(incluindo), recebera aumento de 15%");
        System.out.println("3.Salario Ate 90.000,00 e 120.000,00(incluindo), recebera aumento de 10%");
        System.out.println("4.Salario Ate 120.000,00 em diante, receberão de 5% apos o aumento ser realiazdo");

        System.out.println("Insira o salario de um colaborador: ");
        double SColaborador = scanner.nextDouble();

        double SFinal = 0;

        if (SColaborador <= 70000) {
            SFinal = SColaborador * 1.20;
        } else if (SColaborador >= 70000 && SColaborador <= 90000 ) {
             SFinal = SColaborador * 1.15;
        } else if (SColaborador >90000 && SColaborador <= 120000) {
            SFinal = SColaborador * 0.10;
        } else if (SColaborador > 120000 ) {
            SFinal = SColaborador * 0.05;
        }
        System.out.println("O salario Antes do reajuste é "+ SColaborador);
        System.out.println("A percentagem é "+ (SColaborador <= 70000 ? " 20%" : SColaborador > 70000 && SColaborador
                <= 90000 ? "15%" : SColaborador > 90000 && SColaborador <= 120000 ? "10%" : "5%"));
        System.out.println("O salario Com Reajuste é "+ SFinal);
        System.out.println(" O novo salrio é " + SFinal + SColaborador);
    } 
}