import org.junit.Test;
import static org.junit.Assert.*;

public class MatematicaTest2 {
    @Test
    public void testRaport() {
        Matematica m = new Matematica();
        assertEquals(2.0, m.raport(4, 2), 0.01);
    }
    
    @Test
    public void testNNumerePare() {
        Matematica m = new Matematica();
        int[] nums = {1, 2, 3, 4, 5, 6};
        assertEquals(3, m.nNumerePare(nums));
    }
}
