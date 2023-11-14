import org.example.domain.Cadastro;
import org.example.domain.ConsultaEquipamento;
import org.example.domain.Medico;
import org.example.domain.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConsultaEquipamentoTest {

    private ConsultaEquipamento consultaEquipamento;

    @BeforeEach
    void setUp() {
        Medico medico = new Medico("Dr. Teste", 40, 1001, Medico.Especializacao.GERAL);
        Paciente paciente = new Paciente(1, new Cadastro("Paciente Teste", 30, LocalDate.now(), "paciente@teste.com", "senha"));

        consultaEquipamento = new ConsultaEquipamento(
                LocalDate.of(2023, 12, 1),
                123,
                medico,
                paciente,
                org.example.domain.enums.Equipamentos.CADEIRA_DE_RODAS
        );
    }

    @Test
    void testImprimirDetalhes() {
        assertNotNull(consultaEquipamento);

        // Redireciona a saída para um StringBuilder para verificar a impressão
        StringBuilder output = new StringBuilder();
        System.setOut(new java.io.PrintStream(System.out) {
            public void println(String s) {
                output.append(s).append("\n");
            }
        });

        consultaEquipamento.imprimirDetalhes();

        // Verifica se a saída contém as informações esperadas
        String expectedOutput = """
                ---DETALHES DA CONSULTA PARA DEFINIR O EQUIPAMENTO:---
                Nome do Paciente: Paciente Teste
                Equipamento Requerido da Consulta: CADEIRA_DE_RODAS

                Nome do Médico: Dr. Teste
                Especialização do Médico: GERAL

                Data da Consulta: 2023-12-01
                """;

        assertEquals(expectedOutput, output.toString());
    }

    @Test
    void testDefinirMedico() {
        assertNotNull(consultaEquipamento);
    }
}
