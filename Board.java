import javax.swing.*;
import java.awt.*;

public class Board{
    private Square[][] buttList = new Square[5][5];
    private JFrame frame = new JFrame("FROGS");
    private JPanel panel = new JPanel();
    private GridLayout layout = new GridLayout(5, 5);
    private Level map;

    public Board(){
        frame.setSize(750,750);
        panel.setLayout(layout);

        map = new Level(panel, buttList);
        map.setlevel(1);
        
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    public void Place(String item, int x, int y){
        buttList[x][y].Change(item);
    }
}