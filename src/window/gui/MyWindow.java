package window.gui;

import javax.swing.*;

public class MyWindow extends JFrame {

    public MyWindow(){
        this.setSize(500,50);
        this.setTitle("My first window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
