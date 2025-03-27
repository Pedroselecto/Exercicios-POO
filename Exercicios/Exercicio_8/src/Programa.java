import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        float consumo = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de Kilowatts gastos:"));
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do Kilowatt:"));
        float custo = (consumo * valor);
        if (consumo < 150){
            JOptionPane.showMessageDialog(null, "O custo é:" + (custo - (custo * 0.1)));
        }
        else {
            JOptionPane.showMessageDialog(null, "O custo é:" + custo);
        }
    }
}