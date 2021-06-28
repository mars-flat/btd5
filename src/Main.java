import processing.core.PApplet;

public class Main extends PApplet {
    public static Main client = null;
    public static final int defaultWidth = 1000;
    public static final int defaultHeight = 800;
    public static final int defaultFrameRate = 30;

    Main(){
        if(client != null){
            throw new RuntimeException("Singleton Main Client was Initialized a second time!");
        }
        client = this;
    }

    public void setup(){
        frameRate(defaultFrameRate);
    }

    public void draw(){

    }

    public void settings(){
        size(defaultWidth, defaultHeight);
    }

    public static void main(String[] args){
        PApplet.main("Main");
    }
}