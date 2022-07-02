public class Student {

    // Student class - getters

    private int id;
    private String name;
    private double cgpa;

    public Student(String name, double cgpa ,int id){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }
    public double getCgpa(){
        return cgpa;
    }
}
