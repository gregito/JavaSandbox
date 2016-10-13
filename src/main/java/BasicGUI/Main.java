package BasicGUI;

import java.awt.*;

public class Main extends Frame{

    private static Containers containers = new Containers();

    public static void main(String[] args) {
        containers.resizeFrame(250,250);
        containers.getMainFrame();
    }

}
