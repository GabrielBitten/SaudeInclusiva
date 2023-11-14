import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.example.domain.Cadastro;
import org.example.domain.Consulta;
import org.example.domain.Medico;
import org.example.domain.Paciente;
import org.example.domain.enums.Equipamentos;
import org.junit.Before;
import org.junit.Test;

public class ConsultaTest {

    private Consulta consulta;

    @Before
    public void setUp() {
        // Configuração inicial antes de cada teste
        LocalDate dataConsulta = LocalDate.of(2023, 1, 1);
        Integer idConsulta = 1;
        Medico medico = new Medico("Dr. Smith", 40, 101, Medico.Especializacao.GERAL);
        Cadastro cadastroPaciente = new Cadastro("John Doe", 30, LocalDate.of(1990, 1, 1), "john@example.com", "password");
        Paciente paciente = new Paciente(1, cadastroPaciente);
        Equipamentos equipamentos = Equipamentos.CADEIRA_DE_RODAS;

        consulta = new Consulta(dataConsulta, idConsulta, medico, paciente, equipamentos);
    }

    @Test
    public void testGetDataConsulta() {
        assertEquals(LocalDate.of(2023, 1, 1), consulta.getDataConsulta());
    }

    @Test
    public void testGetIdConsulta() {
        assertEquals(Integer.valueOf(1), consulta.getIdConsulta());
    }

    @Test
    public void testGetMedico() {
        assertNotNull(consulta.getMedico());
        assertEquals("Dr. Smith", consulta.getMedico().getNome());
        assertEquals(40, consulta.getMedico().getIdade());
        assertEquals(Integer.valueOf(101), consulta.getMedico().getIdMedico());
        assertEquals(Medico.Especializacao.GERAL, consulta.getMedico().getEspecializacao());
    }

    @Test
    public void testSetMedico() {
        Medico novoMedico = new Medico("Dr. Johnson", 45, 102, Medico.Especializacao.ORTOPEDISTA);
        consulta.setMedico(novoMedico);
        assertEquals("Dr. Johnson", consulta.getMedico().getNome());
        assertEquals(45, consulta.getMedico().getIdade());
        assertEquals(Integer.valueOf(102), consulta.getMedico().getIdMedico());
        assertEquals(Medico.Especializacao.ORTOPEDISTA, consulta.getMedico().getEspecializacao());
    }

    @Test
    public void testGetPaciente() {
        assertNotNull(consulta.getPaciente());
        assertEquals("John Doe", consulta.getPaciente().getCadastro().getNome());
        assertEquals(30, consulta.getPaciente().getCadastro().getIdade());
    }

    @Test
    public void testGetEquipamentos() {
        assertEquals(Equipamentos.CADEIRA_DE_RODAS, consulta.getEquipamentos());
    }

    @Test
    public void testImprimirDetalhes() {
        // Configuração inicial
        System.out.println("Teste de impressão de detalhes:");
        System.out.println("----------------------------");
        // Executa o método a ser testado
        consulta.imprimirDetalhes();
    }

    @Test
    public void testDefinirMedico() {
        // Verifica se a especialização do médico foi definida corretamente para CADEIRA_DE_RODAS
        consulta.definirMedico();
        assertEquals(Medico.Especializacao.ORTOPEDISTA, consulta.getMedico().getEspecializacao());
    }
}
