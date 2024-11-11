
public class TestReference
{
    public void testFritz()
    {
        Student fritz;
        Student f2;
        Student f3;
        
        fritz = new Student("Fritz", 29, "rk", true);
        f2 = fritz;
        f3 = f2;
    }
    
    public void test2()
    {
        Student a, b, c, d, e, f, g, h;
        
        b = new Student("Max", 25, "rk");
        h = new Student("Susi", 27, "islam");
        e = b;
        f = new Student("Maria", 29, "ob");
        e = f;
        c = h;
        h = null;
        e.setAlter(30);
        f = new Student("Alex", 29, "ob");
        //a.printStudent();
        b.printStudent();
        c.printStudent();
        //d.printStudent();
        e.printStudent();
        f.printStudent();
        //g.printStudent();
        //Wurde auf NULL gesetzt!
        //h.printStudent();
    }
    
    public void test3()
    {
        Student s0, s1, s2, s3, s4, s5;
        
        s0 = new Student ("Hans", 30, "rk");
        s4 = new Student ("Alex", 20, "ob");
        s0.setName("Hans2");
        s5 = new Student ("Hans", 30, "rk");
        s1 = s5;
        s0 = s4;
        s3 = s0;
        s3.setAlter(41);
        s2 = null;
        // null pointer rexception
        // s2.setAlter(22);
        s1 = s5;
        s5 = s0;
        s1.setAlter(33);
        s0.printStudent();
        s1.printStudent();
        // null pointer exception
        // s2.printStudent();
        s3.printStudent();
        s4.printStudent();
        s5.printStudent();
    }

    public void test4()
    {
        Student q, w, e, r, t, z;
        
        q = new Student("Alex",   22, "ob");
        e = new Student("Alex",   22, "ob");
        r = new Student("Max",    33, "ob");
        t = q;
        t.setAlter(20);
        q = null;
        t = new Student("Peter",  44, "ob");
        t.setName("Neue");
        w = null;
        r = new Student("Franz",  33, "ob");
        q.setAlter(30);
        z = new Student("Andrea", 55, "ob");
        e.setAlter(40);
        q.printStudent();
        w.printStudent();
        e.printStudent();
        r.printStudent();
        t.printStudent();
        z.printStudent();;
    }

}


