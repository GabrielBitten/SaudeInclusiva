import org.example.domain.Cadastro;
import org.example.domain.Paciente;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    public void testImprimirInformacoesPaciente() {
        LocalDate dataNascimento = LocalDate.of(1993, 5, 15);
        Cadastro cadastro = new Cadastro("John Doe", 30, dataNascimento, "johndoe@example.com", "senha_segura");
        Paciente paciente = new Paciente(1, cadastro);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        paciente.imprimirInformacoesPaciente();

        System.setOut(System.out);

        String expectedOutput = """
                ---INFORMAÇÕES DO PACIENTE---
                Nome do Paciente: John Doe
                Idade do Paciente: 30
                Email do Paciente: johndoe@example.com
                Data de Nascimento: 1993-05-15
                """;

        String actualOutput = outputStream.toString().replaceAll("\r\n", "\n");

        System.out.println("Saída Real: " + actualOutput);
        System.out.println("Saída Esperada: " + expectedOutput);

        assertEquals(expectedOutput, actualOutput);
    }
}
