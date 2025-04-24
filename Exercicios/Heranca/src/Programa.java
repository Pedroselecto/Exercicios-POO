import model.Aluno;
import model.Monitor;
import model.Pessoa;
import model.Professor;

public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "12345679";
        System.out.println("Telefone pessoa: " + pessoa1.telefone);
        pessoa1.mudarTelefone("0987102932");
        System.out.println("Telefone pessoa: " + pessoa1.telefone);

        System.out.println("----------------------------------");

        Pessoa pessoa2 = new Pessoa("Pedro", "999981199");
        System.out.println("Nome pessoa2: " + pessoa2.nome);
        pessoa1.mudarTelefone("0987102932");
        System.out.println("Telefone pessoa2: " + pessoa2.telefone);

        System.out.println("----------------------------------");

        Professor professor2 = new Professor("Rafael", "12345678", "Padrões de projeto de Software");
        System.out.println("Nome do professor:" + professor2.nome);
        System.out.println("Telefone do professor:" + professor2.telefone);
        System.out.println("Titulação do professor:" + professor2.titulacao);

        System.out.println("----------------------------------");

        Aluno aluno2 = new Aluno("Geraldo", "29380928390", "20232029392");
        System.out.println("Nome do aluno:" + aluno2.nome);
        System.out.println("Telefone do aluno:" + aluno2.telefone);
        System.out.println("Matricula do aluno:" + aluno2.matricula);

        System.out.println("----------------------------------");

        Monitor monitor1 = new Monitor();
        monitor1.nome = "Pedro";
        monitor1.telefone = "2199998247272";
        monitor1.percentual_bolsa = 0.25;
        System.out.println("Percentual de bolsa: " + monitor1.percentual_bolsa);
    }
}
