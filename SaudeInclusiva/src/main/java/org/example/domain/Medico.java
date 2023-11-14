package org.example.domain;



public class Medico {

    private String nome;
    private int idade;
    private Integer idMedico;
    public enum Especializacao {
        GERAL, ORTOPEDISTA, UROLOGISTA, OTORRINOLARINGOLOGISTA;
    }

    private Especializacao especializacao;

    public Medico(String nome, int idade, Integer idMedico, Especializacao especializacao) {
        this.nome = nome;
        this.idade = idade;
        this.idMedico = idMedico;
        this.especializacao = especializacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }
}
