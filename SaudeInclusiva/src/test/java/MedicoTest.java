import org.example.domain.Medico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {
    @Test
    public void testGetNome() {
        Medico medico = new Medico("Dr. Smith", 40, 1, Medico.Especializacao.GERAL);
        assertEquals("Dr. Smith", medico.getNome());
    }

    @Test
    public void testGetIdade() {
        Medico medico = new Medico("Dr. Smith", 40, 1, Medico.Especializacao.GERAL);
        assertEquals(40, medico.getIdade());
    }

    @Test
    public void testGetEspecializacao() {
        Medico medico = new Medico("Dr. Smith", 40, 1, Medico.Especializacao.GERAL);
        assertEquals(Medico.Especializacao.GERAL, medico.getEspecializacao());
    }

    @Test
    public void testGetIdMedico() {
        Medico medico = new Medico("Dr. Smith", 40, 1, Medico.Especializacao.GERAL);
        assertEquals(1, medico.getIdMedico());
    }

    @Test
    public void testSetIdMedico() {
        Medico medico = new Medico("Dr. Smith", 40, 1, Medico.Especializacao.GERAL);
        medico.setIdMedico(2);
        assertEquals(2, medico.getIdMedico());
    }

    @Test
    public void testSetEspecializacao() {
        Medico medico = new Medico("Dr. Smith", 40, 1, Medico.Especializacao.GERAL);
        medico.setEspecializacao(Medico.Especializacao.ORTOPEDISTA);
        assertEquals(Medico.Especializacao.ORTOPEDISTA, medico.getEspecializacao());
    }
}
