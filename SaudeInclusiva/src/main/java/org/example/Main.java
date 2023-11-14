package org.example;

import org.example.domain.*;
import org.example.domain.enums.Equipamentos;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //--------FAZER CADASTRO
        Cadastro cadastroVazio = new Cadastro();
        //cadastroVazio.cadastrarPaciente();

        Cadastro cadastro1 = new Cadastro("Roberto",50,LocalDate.of(1973, 3, 29),"billten@gmail.com", "123456");
        Cadastro cadastro2 = new Cadastro("Roger",40, LocalDate.of(1983, 3, 11),"sanidadegamer@gmail.com", "987456");

        //--------MARCAR CONSULTA

        Medico medico1 = new Medico("Antonio", 40, 1100, null);
        Medico medico2 = new Medico("Valmir", 45, 1220, null);
        Paciente paciente1 = new Paciente(22211, cadastro1);
        Paciente paciente2 = new Paciente(22300, cadastro2);
        Paciente paciente3 = new Paciente(22444, cadastroVazio);

        Consulta consulta = new Consulta(LocalDate.of(2023, 12, 1), 444400, medico1, paciente1, Equipamentos.NENHUM);

        //--------Lista dos pacientes cadastrados na consulta
        Agenda agenda = new Agenda();
        agenda.adicionarPaciente(paciente1);
        agenda.adicionarPaciente(paciente2);
        agenda.adicionarPaciente(paciente3);

        List<Paciente> pacientes = agenda.listarPacientes();
        //agenda.imprimirListaPacientes(pacientes);

        Integer consultaId = consulta.getIdConsulta();
        Integer medicoId = consulta.getMedico().getIdMedico();
        Integer pacienteId = consulta.getPaciente().getIdPaciente();

        System.out.println("");

        //consulta.definirMedico();
        //consulta.imprimirDetalhes();
        //paciente1.imprimirInformacoesPaciente();

        ConsultaEquipamento consultaEquipamento = new ConsultaEquipamento(LocalDate.of
                (2023, 12, 12), 555500, medico2, paciente1, Equipamentos.ANDADOR);

        consultaEquipamento.definirMedico();
        consultaEquipamento.imprimirDetalhes();
    }
}