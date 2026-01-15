import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicaTest1 {
    @Test
    public void testSuma() {
        Matematica m = new Matematica();
        assertEquals(5, m.suma(2, 3));
    }
    
    @Test
    public void testEstePar() {
        Matematica m = new Matematica();
        assertTrue(m.estePar(4));
        assertFalse(m.estePar(5));
    }
}
