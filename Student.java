public class Student 
{
    private String  name;           // Name des Studierenden
    private int     alter;          // Alter des Studierenden
    private String  religion;       // ...
    private boolean matura;
    
    // Constructor
    public Student(String neuName, int neuAlter, String neuReligion, boolean neuMatura)
    {
        setName(neuName);
        setAlter(neuAlter);
        setReligion(neuReligion);
        setMatura(neuMatura);
    }
    
    public void setName(String neuName)
    {
        /*
         * Die Eigenschaft name wird überschrieben mit dem
         * Wert des Parameters.
         */
        name = neuName;
    }

    public void setAlter(int neuAlter)
    {
        alter = neuAlter;
    }

    public void setReligion(String neuReligion)
    {
        religion = neuReligion;
    }
    
    public void setMatura(boolean neuMatura)
    {
        matura = neuMatura;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public String getReligion()
    {
        return religion;
    }
    
    public boolean getMatura()
    {
        return matura;
    }
    
    public void printStudent()
    {
        System.out.println(name + ": " + alter + " Jahre, Rel: " + religion + ", Matura: " + matura);
    }
}
