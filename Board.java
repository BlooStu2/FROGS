import javax.swing.*;
import java.awt.*;

public class Board{
    private JFrame frame = new JFrame("FROGS");
    private JPanel panel = new JPanel();
    private GridLayout layout = new GridLayout(5, 5);
    private int level = 1;
    private Level map;

    public Board(){
        frame.setSize(750,750);
        panel.setLayout(layout);

        map = new Level();

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    public void Place(String item, int x, int y){
        buttList[x][y].Change(item);
    }
}