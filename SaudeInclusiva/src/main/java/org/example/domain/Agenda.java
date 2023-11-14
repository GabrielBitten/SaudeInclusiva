package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Paciente> pacientesAgendados;

    public Agenda() {
        pacientesAgendados = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientesAgendados.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        pacientesAgendados.remove(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacientesAgendados;
    }

    public void imprimirListaPacientes(List<Paciente> pacientes){
        System.out.println("---LISTA DA AGENDA DOS PACIENTES COM CONSULTA CADASTRADA:---");
        for (Paciente pacienteLista : pacientes) {
            System.out.println("Nome: " + pacienteLista.getCadastro().getNome() + ", Id Paciente: " + pacienteLista.getIdPaciente());
        }
    }
}