import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int numA = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
        if (numA < numB) {
            for (int i = numA; i <= numB; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        } else {
            for (int i = numB; i <= numA; i++) {
                System.out.println(i);
            }
        }
    }
}
