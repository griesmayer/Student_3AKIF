
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStudentJUnit
{
    @Test
    public void testZuJung()
    {
        Student hans;
        
        hans = new Student("Hans", 11, "rk", false);
        // Fehlermeldung
        assertEquals (hans.getAlter(), 14);
    }
    
    @Test
    public void testZuAlt()
    {
        Student max;
        
        max = new Student("Max", 66, "islam", false);
        // Fehlermeldung
        assertEquals (max.getAlter(), 14);
    }
    
    @Test
    public void testOk()
    {
        Student susi;
        
        susi = new Student("Susi", 25, "rk", true);
        assertEquals (susi.getAlter(), 25);
    }
}
