package model;

public class Professor extends Pessoa {

    String titulacao;
    public void mudarTitulacao(String titulacao) {
        this.titulacao = titulacao;
}

    public Professor(String nome, String telefone, String titulacao) {
        // A cláusula super() repassa os parâmetros exigidos pelo construtos da superclasse
        super(nome, telefone); // Os atributos do supertipo (generalizado)
        this.titulacao = titulacao; // Atributos próprios (especializados do subtipo)
    }
}
