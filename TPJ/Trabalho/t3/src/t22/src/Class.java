public class Class {
    private int id;
    private String name;
    private String teacher;
    private int capacity;
    private int participants;
    private double cost;
    private static int last = 0;
    
    public Class() {
    	name = "";
    }
    public Class(String name, String teacher, int capacity, double cost) {
        this.name = name;
        this.capacity = capacity;
        this.cost = cost;
        last++;
        id = last;
    }

    public String getName() {
        return name;
    }
    
    public String getTeacher() {
    	return teacher;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getParticipants() {
        return participants;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setTeacher(String teacher) {
    	this.teacher = teacher;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {
        return "Class Name = "  + getName() + "\ncapacity = " + capacity + "\nparticipants = " + participants + "\ncost = " + cost;
    }

    public void getReservationForClass() {
        if(getParticipants()<getCapacity()) {
            participants++;
        } else {
            System.out.println("The class is full");
        }
    }

    public double moneyMade() {
        return participants * cost;
    }
}
