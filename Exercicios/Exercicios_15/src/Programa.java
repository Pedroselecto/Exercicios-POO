import javax.swing.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qnt_vogais = 0;
        int qnt_digitos = 0;
        int qnt_demais = 0;

        System.out.println("Digite os caracteres (digite '.' para finalizar):");
        char caractere =  teclado.nextLine().charAt(0);

        while (caractere != '.') {
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                qnt_vogais++;
            } else if (caractere == '0' || caractere == '1' || caractere == '2' || caractere == '3' || caractere == '4' || caractere == '5' || caractere == '6' || caractere == '7' || caractere == '8' || caractere == '9') {
                qnt_digitos++;
            } else {
                qnt_demais++;
            }
            System.out.println("Digite os caracteres (digite '.' para finalizar):");
            caractere =  teclado.nextLine().charAt(0);
        }
        System.out.println("Quantidade de vogais: " + qnt_vogais);
        System.out.println("Quantidade de dígitos: " + qnt_digitos);
        System.out.println("Quantidade de outros caracteres: " + qnt_demais);
    }
}


