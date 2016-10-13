package BasicGUI;

import java.awt.*;

public class Containers {

    private Components components = new Components();
    private Panel panel = new Panel();
    private Frame mainFrame = new Frame("MainWindow");


    public Containers() {
        panel.add(components.getBtnOK());
        panel.add(components.getBtnExit());
        mainFrame.add(panel);
        mainFrame.add(components.getLblMainTitle());
        components.setAlignment(Components.TOPALIGN);
        mainFrame.setSize(500, 500);
    }

    public Frame getMainFrame() {
        mainFrame.setVisible(true);
        return mainFrame;
    }

    public void rewriteLabelContent(String labelContent){
        components.setStrLabel(labelContent);
    }

    public void resizeFrame(int x, int y) {
        mainFrame.setSize(x, y);
    }

    public Panel getPanel() {
        return panel;
    }
}
