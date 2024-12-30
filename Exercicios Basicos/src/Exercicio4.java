public class Exercicio4 {
    public static void main(String[] args) {
        int soma = 0;
        int j = 0;
        for (int i = 13; i < 73; i+=1) {
            soma +=i;
            j++;
        }
        System.out.println("A media aritimetica é : " + soma / j);
    }
}
