import org.example.domain.Agenda;
import org.example.domain.Cadastro;
import org.example.domain.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaTest {
    private Agenda agenda;
    private Paciente paciente1;
    private Paciente paciente2;

    @BeforeEach
    void setUp() {
        agenda = new Agenda();
        paciente1 = new Paciente(1, new Cadastro("Teste1", 30, LocalDate.now(), "teste1@teste.com", "senha1"));
        paciente2 = new Paciente(2, new Cadastro("Teste2", 35, LocalDate.now(), "teste2@teste.com", "senha2"));
    }

    @Test
    void adicionarPaciente() {
        agenda.adicionarPaciente(paciente1);

        List<Paciente> pacientes = agenda.listarPacientes();

        assertTrue(pacientes.contains(paciente1));
        assertEquals(1, pacientes.size());
    }

    @Test
    void removerPaciente() {
        agenda.adicionarPaciente(paciente1);
        agenda.adicionarPaciente(paciente2);

        agenda.removerPaciente(paciente1);

        List<Paciente> pacientes = agenda.listarPacientes();

        assertFalse(pacientes.contains(paciente1));
        assertTrue(pacientes.contains(paciente2));
        assertEquals(1, pacientes.size());
    }

    @Test
    void testListarPacientes() {
        agenda.adicionarPaciente(paciente1);
        agenda.adicionarPaciente(paciente2);

        List<Paciente> pacientes = agenda.listarPacientes();

        assertTrue(pacientes.contains(paciente1));
        assertTrue(pacientes.contains(paciente2));
        assertEquals(2, pacientes.size());
    }
}
