import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        float salario_antigo, percentual, aumento;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o salário antigo: ");
        salario_antigo = teclado.nextFloat();
        System.out.println("Digite o percentual: ");
        percentual = teclado.nextFloat();
        aumento = (percentual / 100) * salario_antigo;
        System.out.println("Seu salário novo é: " + (salario_antigo + aumento));


    }
}
