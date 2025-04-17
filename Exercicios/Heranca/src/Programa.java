public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "12345679";
        System.out.println("Telefone pessoa: " + pessoa1.telefone);
        pessoa1.mudarTelefone("0987102932");
        System.out.println("Telefone pessoa: " + pessoa1.telefone);

        System.out.println("----------------------------------");

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "126534";
        System.out.println("Telefone aluno: " + aluno1.telefone);
        aluno1.mudarTelefone("21555699871");
        System.out.println("Telefone aluno: " + aluno1.telefone);

        System.out.println("----------------------------------");

        Professor professor1 = new Professor();
        professor1.nome = "Thiago";
        professor1.telefone = "218030593";
        professor1.titulacao = "POO";
        System.out.println("Titulacao do professor: " + professor1.titulacao);
        professor1.mudarTitulacao("Coordenador Tech");
        System.out.println("Titulacao do professor: " + professor1.titulacao);

        System.out.println("----------------------------------");

        Monitor monitor1 = new Monitor();
        monitor1.nome = "Pedro";
        monitor1.telefone = "2199998247272";
        monitor1.percentual_bolsa = 0.25;
        System.out.println("Percentual de bolsa: " + monitor1.percentual_bolsa);
    }
}
