package model;

public class Pessoa {
    String nome;
    String telefone;

    // metodo construtor padrão (vazio e sem parâmetros)
    // Um metodo construtor é responsável por instanciar objetos,
    // realizando atribuição de valores aos atributos e alocação de memória.
    public Pessoa() {

    }


    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }


    public void mudarTelefone(String telefone) {
        this.telefone = telefone;
    }
}
