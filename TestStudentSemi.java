public class TestStudentSemi
{
    public void testZuJung()
    {
        Student hans;
        
        hans = new Student("Hans", 11, "rk", false);
        // Fehlermeldung
        System.out.println(hans.getAlter());
        // 14
    }
    
    public void testZuAlt()
    {
        Student max;
        
        max = new Student("Max", 66, "islam", false);
        // Fehlermeldung
        System.out.println(max.getAlter());
        // 14
    }
    
    public void testOk()
    {
        Student susi;
        
        susi = new Student("Susi", 25, "rk", true);
        System.out.println(susi.getAlter());
        // 25
    }
}















