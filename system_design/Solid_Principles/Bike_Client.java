package Solid_Principles;

public class Bike_Client {
    public static void main(String[] args) {
        Vehicle v= new Bike();
        System.out.println(((Bike)v).Turn_Off_Engine());
        System.out.println(v.StartEngine());
        System.out.println(v.Engine_Type()); // it returns an object 
    }
}
