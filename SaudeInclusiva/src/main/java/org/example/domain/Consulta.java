package org.example.domain;

import org.example.domain.enums.Equipamentos;

import java.time.LocalDate;

public class Consulta implements Consultador{

    private LocalDate dataConsulta;

    private Integer idConsulta;

    private Medico medico;

    private Paciente paciente;

    private Equipamentos equipamentos;

    public Consulta(LocalDate dataConsulta, Integer idConsulta, Medico medico, Paciente paciente, Equipamentos equipamentos) {
        this.dataConsulta = dataConsulta;
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.paciente = paciente;
        this.equipamentos = equipamentos;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Equipamentos getEquipamentos(){ return equipamentos; }


    @Override
    public void imprimirDetalhes() {
        System.out.println("---DETALHES DA CONSULTA:---");
        System.out.println("Nome do Paciente: " + paciente.getCadastro().getNome());
        System.out.println("");
        System.out.println("Nome do Médico: " + medico.getNome());
        System.out.println("Especialização do Médico: " + medico.getEspecializacao());
        System.out.println("");
        System.out.println("Data da Consulta: " + dataConsulta);
    }

    @Override
    public void definirMedico() {
        switch (equipamentos){
            case MULETA, ANDADOR, PROTESE, ORTESE, CADEIRA_DE_RODAS : medico.setEspecializacao(Medico.Especializacao.ORTOPEDISTA);
            break;
            case APARELHO_AUDITIVO : medico.setEspecializacao(Medico.Especializacao.OTORRINOLARINGOLOGISTA);
            break;
            case CADEIRA_HIGIENICA : medico.setEspecializacao(Medico.Especializacao.UROLOGISTA);
            break;
            case NENHUM : medico.setEspecializacao(Medico.Especializacao.GERAL);
            break;
        }
    }
}
