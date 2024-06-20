package Solid_Principles;

public class HP_Printer  extends Print_Admission_Receipt {

    // public abstract void save_DB();
    @Override
    public void print(){
        System.out.println("Printing Admission Receipt using HP Printer");
    }
}
