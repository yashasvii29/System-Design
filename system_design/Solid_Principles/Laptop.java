package Solid_Principles;
public class Laptop {

    private Keyboard keyboard;
    private Mouse mouse;

    public Laptop(Keyboard keyboard,Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public static void main(String[] args){
        Laptop ll = new Laptop(new Wire_Keyboard(), new Bluetooth_Mouse());
    }
    
}
