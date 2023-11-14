package org.example.domain;

import org.example.domain.enums.Equipamentos;

import java.time.LocalDate;

public class ConsultaEquipamento extends Consulta{
    public ConsultaEquipamento(LocalDate dataConsulta, Integer idConsulta, Medico medico, Paciente paciente, Equipamentos equipamentos) {
        super(dataConsulta, idConsulta, medico, paciente, equipamentos);
    }
@Override
    public void imprimirDetalhes() {
        System.out.println("---DETALHES DA CONSULTA PARA DEFINIR O EQUIPAMENTO:---");
        System.out.println("Nome do Paciente: " + super.getPaciente().getCadastro().getNome());
        System.out.println("Equipamento Requerido da Consulta: " + super.getEquipamentos());
        System.out.println("");
        System.out.println("Nome do Médico: " + super.getMedico().getNome());
        System.out.println("Especialização do Médico: " + super.getMedico().getEspecializacao());
        System.out.println("");
        System.out.println("Data da Consulta: " + super.getDataConsulta());
    }

    @Override
    public void definirMedico() {
        super.definirMedico();
    }
}
