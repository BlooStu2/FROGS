import javax.swing.*;
import java.awt.*;

public class Board{
    private JFrame frame = new JFrame("FROGS");
    private Square[][] buttList = new Square[5][5];
    private String[][] levels = new String[40][];
    private JPanel panel = new JPanel();
    private GridLayout layout = new GridLayout(5, 5);
    //private String levels = {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
    private int lilyswitch = 0;

    public Board(){
        frame.setSize(750,750);
        panel.setLayout(layout);
        levels[0] = new String[] {"l","g","l","l","l","l","l","l","l","l","l","l","l"};

        for(int i = 0; i<5; i++){      //eventually change i++ to i+=2 to remove lilyswitch
            for(int j = 0; j<5; j++){
                if (lilyswitch == 0){
                    buttList[i][j] = new Square();
                    lilyswitch = 1;
                }
                else {
                    lilyswitch = 0;
                    buttList[i][j] = new Square();
                }
                panel.add(buttList[i][j].b);
            }
        }
        
        this.setLevel(1);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    public void setLevel(int levelnum){
        int index = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if (lilyswitch == 0){
                    buttList[i][j].Change(levels[levelnum-1][index]);
                    buttList[i][j].Update();
                    lilyswitch = 1;
                    index++;
                }
                else {
                    lilyswitch = 0;
                }
                panel.add(buttList[i][j].b);
            }
        }
    }
}