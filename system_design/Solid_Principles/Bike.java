package Solid_Principles;

public class Bike implements Vehicle{
    boolean Turn_On;
    int accl;

    @Override
    public boolean StartEngine(){
        Turn_On = true;
        return Turn_On;
    }

    @Override
    public int Accelerate(){
        return accl*10;
    }

    @Override
    public Vehicle Engine_Type(){
        //  return type vehicle hai and we will return bike
        // Vehicle v = new Bike();
        return new Bike();
    }

    public boolean Turn_Off_Engine(){
        Turn_On=false;
        return Turn_On;
    }

    public String toString(){
        return "KTM bike ka engine hai";
    }
}
