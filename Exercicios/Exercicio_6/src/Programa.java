import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float distancia = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância percorrida:"));
        float tempo = Float.parseFloat(JOptionPane.showInputDialog("Informe o tempo gasto:"));
        float gasolina = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de gasolina consumida:"));

        System.out.println("Velocidade média:" + (distancia/tempo) + "\n" + "Consumo de combustível:" + gasolina);
    }
}