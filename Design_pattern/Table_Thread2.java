package Design_pattern;

public class Table_Thread2 extends Thread {
    private Table t;
    public Table_Thread2(Table t){
        this.t = t;
    }

@Override
public void run(){
    try{
        t.print(12);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
}
}
