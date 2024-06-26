package Design_pattern; 
public class Table_Client{
    public static void main(String[] args) {
        // this is the concept of multithreading
        Table table = new Table();
        // table is a shared resource beacuse we pass the same object in both the thread
        Table_Thread1 th1 = new Table_Thread1(table);
        Table_Thread2 th2 = new Table_Thread2(table);
        th1.start();
        th2.start();
        // th2.start();
        // one thraed is depend on second thraed
        
        // os , dbms and oops are important for system design you must have strong command on these topics
        // table.print(7);
}

}