
import static org.junit.jupiter.api.Assertions.*;

import org.example.DigitAnalyzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DigitAnalyzerTest {

    private DigitAnalyzer digitAnalyzer;

    // Configuração do objeto antes de cada teste
    @BeforeEach
    public void setUp() {
        digitAnalyzer = new DigitAnalyzer();
    }

    // Teste para calcular a média dos dígitos
    @Test
    public void testAverageOfDigits() {
        assertEquals(3.0, digitAnalyzer.averageOfDigits(123), "A média deve ser 3.0");
        assertEquals(4.5, digitAnalyzer.averageOfDigits(4567), "A média deve ser 4.5");
        assertEquals(5.0, digitAnalyzer.averageOfDigits(50505), "A média deve ser 5.0");
        assertEquals(0.0, digitAnalyzer.averageOfDigits(0), "A média de 0 deve ser 0.0");
        assertEquals(4.0, digitAnalyzer.averageOfDigits(-4444), "A média de -4444 deve ser 4.0");
    }
}
