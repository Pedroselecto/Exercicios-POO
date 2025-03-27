import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe a distância percorrida:"));
        if(n%2 == 0) {
            System.out.println("É par.");
        }
        else {
            System.out.println("É ímpar.");
        }
    }
}