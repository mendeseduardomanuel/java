import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Insira a idade: ");
         int idade = scanner.nextInt();

         if (idade <= 12){
             System.out.println("Criaça");
         } else if (idade >= 13 && idade <= 17) {

             System.out.println("Adoslocente");
         } else if (idade >= 18 && idade <= 64) {
             System.out.println("Adulto");

         } else if (idade >= 65) {
             System.out.println("Idoso");
         }else {
             System.out.println("Idade Invalida");
         }
    }
}
