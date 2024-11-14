

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSchool
{
    @Test
    public void testLeer()
    {
        School s;
        
        s = new School();
        assertEquals (s.altesterStudent(), -999);
    }

    @Test
    public void test1()
    {
        School s;
        Student susi;
        
        s = new School();
        susi = new Student("Susi", 21, "rk");
        s.anmelden(susi);
        assertEquals (s.altesterStudent(), 21);
    }

    @Test
    public void test2()
    {
        School s;
        Student susi, max;
        
        s = new School();
        susi = new Student("Susi", 21, "rk");
        s.anmelden(susi);
        max = new Student("Max", 29, "ob");
        s.anmelden(max);
        assertEquals (s.altesterStudent(), 29);
    }

    @Test
    public void test3()
    {
        School s;
        Student susi, max, maria;
        
        s = new School();
        susi = new Student("Susi", 21, "rk");
        s.anmelden(susi);
        max = new Student("Max", 29, "ob");
        s.anmelden(max);
        maria = new Student("Maria", 25, "ob");
        s.anmelden(maria);
        assertEquals (s.altesterStudent(), 29);
    }

    @Test
    public void test4()
    {
        School s;
        Student susi, max, maria;
        
        s = new School();
        susi = new Student("Susi", 31, "rk");
        s.anmelden(susi);
        max = new Student("Max", 29, "ob");
        s.anmelden(max);
        maria = new Student("Maria", 25, "ob");
        s.anmelden(maria);
        assertEquals (s.altesterStudent(), 31);
    }

    @Test
    public void test5()
    {
        School s;
        Student susi, max, maria;
        
        s = new School();
        susi = new Student("Susi", 21, "rk");
        s.anmelden(susi);
        max = new Student("Max", 29, "ob");
        s.anmelden(max);
        maria = new Student("Maria", 33, "ob");
        s.anmelden(maria);
        assertEquals (s.altesterStudent(), 33);
    }

}
