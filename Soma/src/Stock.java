import java.util.Scanner;
    public class Stock {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Quantidade Minima do Stock: ");
            int QMinimoP = scanner.nextInt();

            System.out.println("Quantidade Maxima do Stock: ");
            int QMaximoP = scanner.nextInt();

            System.out.println("O total do Stock é:" + QMinimoP + QMaximoP / 2);
        }

}
