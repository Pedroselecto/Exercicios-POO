import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        float raio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        raio = teclado.nextFloat();
        double pi = Math.PI;
        System.out.println("Perímetro: " + (2*pi*raio));
        System.out.println("Área: " + (pi * (raio*raio)));
    }
}
