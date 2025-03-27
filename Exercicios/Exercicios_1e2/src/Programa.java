import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float valor1, valor2;
        System.out.println("Informe o primeiro valor: ");
        valor1 = teclado.nextFloat();
        System.out.println("Informe o segundo valor: ");
        valor2 = teclado.nextFloat();

        System.out.println("Soma: " + (valor1 + valor2));
        System.out.println("Subtração: " + (valor1 - valor2));
        System.out.println("Multiplicação: " + (valor1 * valor2));
        System.out.println("Divisão: " + (valor1 / valor2));
    }
}
