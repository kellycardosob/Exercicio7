import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite o valor da lateral do quadrado: ");
        double lado = new Scanner(System.in).nextInt();
        double area;

        area = lado * lado;

        System.out.println("O dobro da area do quadrado é de: " + (area * 2) );
    }
}
