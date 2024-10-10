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
        // 12 .. 65
        
        if ((alter >= 12) && (alter <= 65))
        {
            this.alter = alter;
        }
        else
        {
            System.out.println("Fehler: ungültiges Alter. Das Alter muss zwischen 12 und 65 sein!");
            this.alter = 14;
        }
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
    
    public String getInitialen()
    {
        String initialen;
        int pos;
        
        initialen = name.substring(0, 1);
        pos = name.indexOf(" ") + 1;
        //"Max " + "Griesmayer" => "Max Griesmayer"
        //"M" + "G" => "MG"
        initialen = initialen + name.substring(pos,pos+1);
        initialen = initialen.toLowerCase();
        
        return initialen;
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










