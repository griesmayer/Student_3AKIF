

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestJungerStudent
{
    @Test
    public void testKeinStudent()
    {
        School s;
        
        s = new School();
        assertEquals(s.jungerStudent(), null);
    }
    
    @Test
    public void test1Student()
    {
        School s;
        Student max, alex, miri;
        
        s = new School();
        max  = new Student("Max",    29, "ob");
        alex = new Student("Alex",   29, "ob");
        miri = new Student("Miriam", 29, "ob");
        s.anmelden(max);
        assertEquals(s.jungerStudent(), max);        
    }

    @Test
    public void test2Student()
    {
        School s;
        Student max, alex, miri;
        
        s = new School();
        max  = new Student("Max",    29, "ob");
        alex = new Student("Alex",   27, "ob");
        miri = new Student("Miriam", 29, "ob");
        s.anmelden(max);
        s.anmelden(alex);
        assertEquals(s.jungerStudent(), alex);        
    }

    @Test
    public void test3Student()
    {
        School s;
        Student max, alex, miri;
        
        s = new School();
        max  = new Student("Max",    29, "ob");
        alex = new Student("Alex",   27, "ob");
        miri = new Student("Miriam", 31, "ob");
        s.anmelden(max);
        s.anmelden(alex);
        s.anmelden(miri);
        assertEquals(s.jungerStudent(), alex);        
    }

    @Test
    public void testPos0()
    {
        School s;
        Student max, alex, miri;
        
        s = new School();
        max  = new Student("Max",    25, "ob");
        alex = new Student("Alex",   27, "ob");
        miri = new Student("Miriam", 31, "ob");
        s.anmelden(max);
        s.anmelden(alex);
        s.anmelden(miri);
        assertEquals(s.jungerStudent(), max);        
    }


    @Test
    public void testPos1()
    {
        School s;
        Student max, alex, miri;
        
        s = new School();
        max  = new Student("Max",    29, "ob");
        alex = new Student("Alex",   27, "ob");
        miri = new Student("Miriam", 31, "ob");
        s.anmelden(max);
        s.anmelden(alex);
        s.anmelden(miri);
        assertEquals(s.jungerStudent(), alex);        
    }

    @Test
    public void testPos2()
    {
        School s;
        Student max, alex, miri;
        
        s = new School();
        max  = new Student("Max",    29, "ob");
        alex = new Student("Alex",   27, "ob");
        miri = new Student("Miriam", 25, "ob");
        s.anmelden(max);
        s.anmelden(alex);
        s.anmelden(miri);
        assertEquals(s.jungerStudent(), miri);        
    }

}

