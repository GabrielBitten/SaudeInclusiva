package org.example.domain;

import com.sun.source.tree.CaseTree;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {

    private Integer idPaciente;

    private Cadastro cadastro;


    public Paciente(Integer idPaciente, Cadastro cadastro) {
        this.idPaciente = idPaciente;
        this.cadastro = cadastro;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public Cadastro getCadastro(){
        return cadastro;
    }

    public void imprimirInformacoesPaciente(){
        System.out.println("---INFORMAÇÕES DO PACIENTE---");
        System.out.println("Nome do Paciente: " + cadastro.getNome());
        System.out.println("Idade do Paciente: " + cadastro.getIdade());
        System.out.println("Email do Paciente: " + cadastro.getEmail());
        System.out.println("Data de Nascimento: " + cadastro.getDataNascimento());
    }
}
