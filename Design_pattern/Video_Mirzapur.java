package Design_pattern;

public class Video_Mirzapur {
    public static void main(String[] args) {
        VLC v=new VLC();
        // client start ko call krega and start run ko call krega
        // v.run();
        v.start(); // built in method of thread class
        for(int i=0;i<100;i++){
            System.out.println("hello");
        }
        // v.open_VLC();
        // Video v1 = new Video();
        // v1.play_video_on_VLC();
        // Timer t = new Timer();
        // t.timebar();

    }
}
