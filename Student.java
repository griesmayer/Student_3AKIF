public class Student 
{
    private String  name;
    private int     alter;
    private String  religion;
    private boolean matura;
    
    public void setName(String neuName)
    {
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
}
