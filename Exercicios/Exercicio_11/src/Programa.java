import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        String operacao = JOptionPane.showInputDialog("Informe a operação:");
        int numA = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
        switch (operacao) {
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                break;
            case "+":
                JOptionPane.showMessageDialog(null, numA + operacao + numB + "=" + (numA + numB));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, numA + operacao + numB + "=" + (numA - numB));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, numA + operacao + numB + "=" + (numA * numB));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, numA + operacao + numB + "=" + (numA / numB));
                break;
        }

    }
}
