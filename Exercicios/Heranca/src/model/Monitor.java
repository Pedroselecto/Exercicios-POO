package model;

public class Monitor extends Aluno {

    double percentual_bolsa;

    public Monitor() {

    }
    public Monitor(String nome, String telefone, String matricula, double bolsa) {
        super(nome, telefone, matricula);
        this.percentual_bolsa = bolsa;
    }
}
