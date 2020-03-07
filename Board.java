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
        levels[0] = new String[] {"r","l","l","g","l","l","l","l","l","l","l","l","l"};
        levels[1] = new String[] {"l","l","r","l","l","l","l","g","l","l","l","l","l"};
        levels[2] = new String[] {"l","l","l","l","g","l","r","l","l","l","l","l","l"};
        levels[3] = new String[] {"r","l","l","g","l","l","l","l","l","g","l","l","l"};
        levels[4] = new String[] {"l","g","l","l","l","g","l","l","l","l","r","l","l"};
        levels[5] = new String[] {"l","l","l","l","l","l","g","r","g","g","l","l","l"};
        levels[6] = new String[] {"l","g","r","l","l","g","l","g","l","l","l","g","l"};
        levels[7] = new String[] {"l","r","l","g","g","l","l","l","g","g","l","l","l"};
        levels[8] = new String[] {"l","g","l","g","g","l","r","g","l","g","l","l","l"};
        levels[9] = new String[] {"l","g","l","l","g","g","l","l","g","g","l","l","r"};
        levels[10] = new String[] {"r","l","l","l","l","l","g","l","l","g","l","l","l"};
        levels[11] = new String[] {"l","l","l","l","l","l","g","g","l","l","r","l","l"};
        levels[12] = new String[] {"l","l","r","g","l","l","l","l","g","l","l","g","l"};
        levels[13] = new String[] {"l","g","l","l","l","g","l","g","g","l","l","r","g"};
        levels[14] = new String[] {"g","g","l","l","l","l","l","g","r","g","l","l","l"};
        levels[15] = new String[] {"l","l","r","l","g","l","l","g","l","l","l","l","l"};
        levels[16] = new String[] {"l","r","l","l","l","l","g","l","g","g","l","g","l"};
        levels[17] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[18] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[19] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[20] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[21] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[22] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[23] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[24] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[25] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[26] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[27] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[28] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[29] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[30] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[31] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[32] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[33] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[34] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[35] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[36] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[37] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[38] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};
        levels[39] = new String[] {"l","l","l","l","l","l","l","l","l","l","l","l","l"};

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