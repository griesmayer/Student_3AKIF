public class Student 
{
    private String  name;           // Name des Studierenden
    private int     alter;          // Alter des Studierenden
    private String  religion;       // ...
    private boolean matura;
    
    // Constructor
    public Student(String name, int alter, String religion, boolean matura)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(matura);
    }
    
    public Student(String name,int alter, String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
        setMatura(false);
    }
    
    public Student(String name)
    {
        setName(name);
        setAlter(14);
        setReligion("ob");
        setMatura(false);       
    }
    
    public Student()
    {
        setName("UNKN");
        setAlter(14);
        setReligion("ob");
        setMatura(false);
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public void setReligion(String religion)
    {
        this.religion = religion;
    }
    
    public void setMatura(boolean matura)
    {
        this.matura = matura;
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
    /*
    public int getLength()
    {
        int erg;
        
        erg = name.length();
        
        return erg;
    }
    */
    public String getAccount()
    {
        String erg;
        
        erg = name.substring(0,4);
        
        return erg;
    }
    
    public String getInitialen()
    {
        String erg;
        int pos;
        
        erg = "" + name.charAt(0);
        pos = name.indexOf(' ')+1;
        erg = erg + name.charAt(pos);
        
        return erg;
    }
    
    public void printStudent()
    {
        if (matura == true)
        {
            System.out.println(name + ": " + alter + " Jahre, Rel: " + religion + ", Matura");
        }
        else
        {
            System.out.println(name + ": " + alter + " Jahre, Rel: " + religion + ", keine Matura");
        }
    }
}










