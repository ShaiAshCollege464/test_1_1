
import javax.swing.*;

import static ash.college.utils.Constants.WINDOW_HEIGHT;
import static ash.college.utils.Constants.WINDOW_WIDTH;

public class Window extends JFrame {
    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //Write your code here
        this.setVisible(true);
    }
}