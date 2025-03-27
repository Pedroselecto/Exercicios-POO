import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do aluno:"));
        int qnt_alunos = 0;
        float menor_nota = nota;
        float maior_nota = nota;
        float nota_total = 0;
        if (nota != -1) {
            while (nota != -1) {
                qnt_alunos++;
                if (nota < menor_nota) {
                    menor_nota = nota;
                }
                if (nota > maior_nota) {
                    maior_nota = nota;
                }
                nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do aluno:"));
                nota_total = nota_total + nota;
            }
            float media = nota_total/qnt_alunos;
            JOptionPane.showMessageDialog(null, "A média da turma é:" + media);
            JOptionPane.showMessageDialog(null, "A maior nota da turma é:" + maior_nota);
            JOptionPane.showMessageDialog(null, "A menor nota da turma é:" + menor_nota);
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor inválido.");
        }
    }
}
