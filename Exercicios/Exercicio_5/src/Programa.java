import javax.swing.*;

public class Programa {
    public static void main(String[] args) {

        float t = Float.parseFloat(JOptionPane.showInputDialog("Insira o tempo em segundos:"));
        float min = t / 60;
        float hora = min / 60;
        System.out.println("Segundos:" + t + "\n" + "Minutos: " + min + "\n" + "Horas:" + hora);
    }
}
