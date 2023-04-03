import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConcessionariaTest {

    @Test
    void testCarroBasico() {
        Veiculo carro = new Carro();
        assertEquals(25000.0, carro.preco(), 0.001);
    }

    @Test
    void testCarroComArCondicionado() {
        Veiculo carroComArCondicionado = new ArCondicionado(new Carro());
        assertEquals(26500.0, carroComArCondicionado.preco(), 0.001);
    }

    @Test
    void testCarroComVidroEletrico() {
        Veiculo carroComVidroEletrico = new VidroEletrico(new Carro());
        assertEquals(25800.0, carroComVidroEletrico.preco(), 0.001);
    }

    @Test
    void testCarroComDirecaoEletrica() {
        Veiculo carroComDirecaoEletrica = new DirecaoEletrica(new Carro());
        assertEquals(27000.0, carroComDirecaoEletrica.preco(), 0.001);
    }

    @Test
    void testCarroComVidroEletricoEDirecaoEletrica() {
        Veiculo carroComVidroEletricoEDirecaoEletrica = new DirecaoEletrica(new VidroEletrico(new Carro()));
        assertEquals(27800.0, carroComVidroEletricoEDirecaoEletrica.preco(), 0.001);
    }
}
