package Design_pattern;

public class Table {
    // table is a critical section..jab ek thread enter krega toh dusra enter nhi kr sakta so we will lock it..for that we will use synchronization
   synchronized public void print(int n) throws InterruptedException{
        for(int i=1;i<=6;i++){
            System.out.println(n*i);
            Thread.sleep(4000);
        }
    }
}
