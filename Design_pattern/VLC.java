package Design_pattern;

public class VLC extends Thread{
    // Thread is a inbuilt class
    // thread ko import nhi krenge beacuse lang package m hai
    boolean isOpen;

    // public boolean open_VLC(){
    //     isOpen=true;
    //     return true;
    // }

    // public boolean close_VLC(){
    //     isOpen=false;
    //     return true;
    // }
    @Override
    public void run(){
        if(isOpen=false){
            isOpen=true;
        }
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("open vlc");
    }

}
