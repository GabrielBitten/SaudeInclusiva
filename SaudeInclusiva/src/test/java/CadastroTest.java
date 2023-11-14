import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.example.domain.Cadastro;
import org.junit.Before;
import org.junit.Test;

public class CadastroTest {

    private Cadastro cadastro;

    @Before
    public void setUp() {
        cadastro = new Cadastro();
    }

    @Test
    public void testConstrutorComParametros() {
        String nome = "John Doe";
        int idade = 25;
        LocalDate dataNascimento = LocalDate.of(1998, 5, 15);
        String email = "john.doe@example.com";
        String senha = "securepassword";

        Cadastro cadastro = new Cadastro(nome, idade, dataNascimento, email, senha);

        assertEquals(nome, cadastro.getNome());
        assertEquals(idade, cadastro.getIdade());
        assertEquals(dataNascimento, cadastro.getDataNascimento());
        assertEquals(email, cadastro.getEmail());
        assertEquals(senha, cadastro.getSenha());
    }

    @Test
    public void testCadastrarPaciente() {
        String nome = "John Doe";
        int idade = 25;
        LocalDate dataNascimento = LocalDate.of(1998, 5, 15);
        String email = "john.doe@example.com";
        String senha = "securepassword";


        System.setIn(new java.io.ByteArrayInputStream(
                (nome + System.lineSeparator() + idade + System.lineSeparator()
                        + dataNascimento + System.lineSeparator() + email + System.lineSeparator()
                        + senha + System.lineSeparator()).getBytes()));

        cadastro.cadastrarPaciente();

        assertEquals(nome, cadastro.getNome());
        assertEquals(idade, cadastro.getIdade());
        assertEquals(dataNascimento, cadastro.getDataNascimento());
        assertEquals(email, cadastro.getEmail());
        assertEquals(senha, cadastro.getSenha());
    }

    @Test
    public void testGetNome() {
        cadastro.setNome("John Doe");
        assertEquals("John Doe", cadastro.getNome());
    }

    @Test
    public void testGetIdade() {
        cadastro.setIdade(25);
        assertEquals(25, cadastro.getIdade());
    }

    @Test
    public void testGetDataNascimento() {
        LocalDate dataNascimento = LocalDate.of(1998, 5, 15);
        cadastro.setDataNascimento(dataNascimento);
        assertEquals(dataNascimento, cadastro.getDataNascimento());
    }

    @Test
    public void testGetEmail() {
        cadastro.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", cadastro.getEmail());
    }

    @Test
    public void testGetSenha() {
        cadastro.setSenha("securepassword");
        assertEquals("securepassword", cadastro.getSenha());
    }
}
