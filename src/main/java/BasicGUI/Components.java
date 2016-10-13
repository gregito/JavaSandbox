package BasicGUI;

import java.awt.*;

import static java.awt.Label.CENTER;
import static java.awt.Label.LEFT;
import static java.awt.Label.RIGHT;
import static java.awt.Label.TOP_ALIGNMENT;

public class Components {

    public static final int LEFTSIDE = LEFT;
    public static final int RIGHTSIDE = RIGHT;
    public static final int CENTERPOS = CENTER;
    public static final int TOPALIGN = (int) TOP_ALIGNMENT;
    private String strLabel = "Into GUI";
    private int alignment;

    private Button btnOK = new Button("OK");
    private Button btnExit = new Button("Exit");
    private Choice chcResolution = new Choice();
    private Label lblMainTitle = new Label(strLabel, alignment);

    public String getStrLabel() {
        return strLabel;
    }

    public void setStrLabel(String strLabel) {
        this.strLabel = strLabel;
    }

    public int getAlignment() {
        return alignment;
    }

    public void setAlignment(int alignment) {
        this.alignment = alignment;
    }

    public Label getLblMainTitle() {
        return lblMainTitle;
    }

    public Choice getChcResolution() {
        return chcResolution;
    }


    public Button getBtnExit() {
        return btnExit;
    }

    public Button getBtnOK() {
        return btnOK;
    }
}
