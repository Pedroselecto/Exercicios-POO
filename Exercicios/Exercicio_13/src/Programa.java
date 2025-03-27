import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        int alunos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de alunos:"));
        float nota_total = 0;
        int alunos_restantes = alunos;
        while (alunos_restantes > 0){
            alunos_restantes--;
            float nota = Float.parseFloat(JOptionPane.showInputDialog("Infome a nota do aluno:"));
            nota_total = nota_total + nota;
        }
        float media = nota_total/alunos;
        JOptionPane.showMessageDialog(null, "A média da turma é:" + media);
    }
}
