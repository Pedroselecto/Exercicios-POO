import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog("Informe o número:"));
        JOptionPane.showMessageDialog(null, "O número arredondado é: " + (Math.round(num)));
    }
}
