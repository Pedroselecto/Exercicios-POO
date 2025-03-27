import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

    float num = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor de n:"));
    float inferior = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do limite inferior:"));
    float superior = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do limite superior:"));
    if (num < inferior) {
        JOptionPane.showMessageDialog(null, "n está antes do intervalo");
    } else if (num > superior) {
        JOptionPane.showMessageDialog(null, "n está depois do intervalo.");
    } else {
        JOptionPane.showMessageDialog(null, "n está dentro do intervalo");
    }
    }
}
