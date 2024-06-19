package Solid_Principles;

public class Gla_Admission {
    private Student s;
    private int Count_Subject;

    public Gla_Admission(Student s){
        this.s=s;
    }
    // Student ki fess calculate krenge inside this function
    public int Admission_Fee(Student s,int c){
        return c*1000+s.age*7;
    }
    public void Print_Admission_Receipt(){
        // this function will print the student name
        System.out.println("Student Name: "+s.name);
    }

    public void Save_Data_Base(){
        // Save data in database
    }
}
