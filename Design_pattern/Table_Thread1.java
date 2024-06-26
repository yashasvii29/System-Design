package Design_pattern;

public class Table_Thread1 extends Thread {
    private Table t;
    public Table_Thread1(Table t){
        this.t = t;
    }

@Override
public void run(){
    try{
        t.print(7);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
}

}