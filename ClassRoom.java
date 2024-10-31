public class ClassRoom
{
    private String  roomNr;     // consists of building floor and room number
    private boolean computer;   // are there computers in the room
    private int     size;       // number of seats

    /*
     * Constructor
     * Parameters: Room number, computer, size
     * It is creating a new Insatance of the class ClassRoom
     */
    public ClassRoom(String newRoomNr, boolean newComputer, int newSize)
    {
        setRoomNr(newRoomNr);
        setComputer(newComputer);
        setSize(newSize);
    }
    
    public void setRoomNr(String newRoomNr)
    {
        // set the property roomNr to the value of the parameter newRoomNr
        roomNr = newRoomNr;
    }
    
    public void setComputer(boolean newComputer)
    {
        computer = newComputer;
    }
    
    public void setSize(int newSize)
    {
        size = newSize;
    }
    
    public String getRoomNr()
    {
        return roomNr;
    }
    
    public boolean getComputer()
    {
        return computer;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void printClassRoom()
    {
        System.out.println("Classroom " + roomNr + " - Computer: " + computer + " - " + size + " Students");
    }
}















