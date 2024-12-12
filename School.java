public class School
{
    private Student sessel0;
    private Student sessel1;
    private Student sessel2;
    
    public void anmelden(Student wer)
    {
        if (wer != null)
        {
            if (wer.getSchool() == null)
            {
                if (sessel0 == null)
                {
                    sessel0 = wer;
                    wer.setSchool(this);
                }
                else
                {
                    if (sessel1 == null)
                    {            
                        sessel1 = wer;
                        wer.setSchool(this);
                    }
                    else
                    {
                        if (sessel2 == null)
                        {
                            sessel2 = wer;
                            wer.setSchool(this);
                        }
                        else
                        {
                            System.out.println("Fehler: kein Platz!");
                        }
                    }
                }
            }
            else
            {
                System.out.println("Fehler: schon in einer Schule angemeldet!");
            }
        }
        else
        {
            System.out.println("Fehler: kein Student!");            
        }
    }
    
    public void abmeldenJungerStudent()
    {
        Student wer;
        
        wer = jungerStudent();
        if (wer != null)
        {
            abmelden(wer);
        }
        else
        {
            System.out.println("Fehler: kein Student!");
        }
    }
    
    public void abmelden(Student wer)
    {
        if (wer != null)
        {
            if (sessel0 == wer)
            {
                sessel0 = null;
                wer.setSchool(null);
            }
            else
            {
                if (sessel1 == wer)
                {
                    sessel1 = null;
                    wer.setSchool(null);
                }
                else
                {
                    if (sessel2 == wer)
                    {
                        sessel2 = null;
                        wer.setSchool(null);
                    }
                    else
                    {
                        System.out.println("Fehler: nicht in dieser Schule!");
                    }
                }
            }
        }
        else
        {
            System.out.println("Fehler: kein gültiger Student!");
        }
    }
    
    public void printSchool()
    {
        if (sessel0 != null)
        {
            sessel0.printStudent();
        }
        if (sessel1 != null)
        {
            sessel1.printStudent();
        }
        if (sessel2 != null)
        {
            sessel2.printStudent();
        }
    }
    
    public int altesterStudent()
    {
        int max;
        
        max = -999;
        if (sessel0 != null)
        {
            if (sessel0.getAlter() > max)
            {
                max = sessel0.getAlter();
            }
        }
        if (sessel1 != null)
        {
            if (sessel1.getAlter() > max)
            {
                max = sessel1.getAlter();
            }
        }
        if (sessel2 != null)
        {
            if (sessel2.getAlter() > max)
            {
                max = sessel2.getAlter();
            }
        }
        return max;
    }
    
    public Student jungerStudent()
    {
        int min;
        Student wer;
        
        min = 999;
        wer = null;
        if (sessel0 != null)
        {
            if (sessel0.getAlter() < min)
            {
                min = sessel0.getAlter();
                wer = sessel0;
            }
        }
        if (sessel1 != null)
        {
            if (sessel1.getAlter() < min)
            {
                min = sessel1.getAlter();
                wer = sessel1;
            }
        }
        if (sessel2 != null)
        {
            if (sessel2.getAlter() < min)
            {
                min = sessel2.getAlter();
                wer = sessel2;
            }
        }
        
        return wer;
    }
}











