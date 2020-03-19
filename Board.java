import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener{
    private JFrame frame = new JFrame("FROGS");
    private Square[][] buttList = new Square[5][5];
    private String[][] levels = new String[40][];
    private JPanel panel = new JPanel();
    private GridLayout layout = new GridLayout(5, 5);
    private int lilyswitch = 0;
    private boolean movemode = false;
    private Square selectsquare;
    private int level = 1;

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
        levels[17] = new String[] {"l","g","l","l","l","g","g","g","g","g","l","r","l"};
        levels[18] = new String[] {"g","g","l","l","g","r","l","l","g","g","l","g","l"};
        levels[19] = new String[] {"l","g","g","g","g","l","l","g","r","g","l","l","l"};
        levels[20] = new String[] {"g","l","l","g","r","l","g","l","l","g","l","l","g"};
        levels[21] = new String[] {"l","l","l","g","g","l","g","l","l","l","g","r","g"};
        levels[22] = new String[] {"l","l","g","g","g","l","g","l","g","l","g","l","r"};
        levels[23] = new String[] {"l","g","l","g","g","g","g","l","g","l","l","l","r"};
        levels[24] = new String[] {"l","l","l","g","g","l","l","g","g","l","g","l","r"};
        levels[25] = new String[] {"r","g","l","g","l","g","g","l","l","g","l","l","l"};
        levels[26] = new String[] {"l","l","r","l","l","g","l","l","g","l","g","g","l"};
        levels[27] = new String[] {"l","r","l","g","g","g","l","g","l","l","g","l","g"};
        levels[28] = new String[] {"l","r","l","l","l","l","g","l","g","g","g","l","g"};
        levels[29] = new String[] {"g","g","l","g","g","g","l","l","g","l","l","l","r"};
        levels[30] = new String[] {"l","g","r","g","l","l","g","l","l","g","l","l","l"};
        levels[31] = new String[] {"l","l","l","g","l","g","g","l","g","g","r","g","l"};
        levels[32] = new String[] {"l","l","l","l","l","g","r","g","g","g","l","g","l"};
        levels[33] = new String[] {"l","g","l","l","l","l","l","l","g","g","g","g","r"};
        levels[34] = new String[] {"g","l","g","g","g","l","l","l","g","g","l","l","r"};
        levels[35] = new String[] {"l","g","l","g","g","l","l","l","g","g","g","l","r"};
        levels[36] = new String[] {"l","l","l","g","l","g","g","l","l","g","r","g","l"};
        levels[37] = new String[] {"g","g","l","l","g","l","l","l","g","l","l","g","r"};
        levels[38] = new String[] {"r","l","g","l","g","g","g","l","g","l","l","g","l"};
        levels[39] = new String[] {"l","l","g","g","l","g","g","l","l","g","r","g","l"};

        for(int i = 0; i<5; i++){      //eventually change i++ to i+=2 to remove lilyswitch
            for(int j = 0; j<5; j++){
                if (lilyswitch == 0){
                    buttList[i][j] = new Square();
                    buttList[i][j].addActionListener(this);
                    lilyswitch = 1;
                }
                else {
                    lilyswitch = 0;
                    buttList[i][j] = new Square();
                    buttList[i][j].addActionListener(this);
                }
                panel.add(buttList[i][j]);
            }
        }
        
        this.setLevel(level);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    public void setLevel(int levelnum){
        lilyswitch = 0;
        int index = 0;
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if (lilyswitch == 0){
                    buttList[i][j].Change(levels[levelnum-1][index]);
                    lilyswitch = 1;
                    index++;
                }
                else {
                    lilyswitch = 0;
                }
                panel.add(buttList[i][j]);
            }
        }
    }
    public void actionPerformed(ActionEvent e){
         if(e.getSource() instanceof Square){
            Square pressedSquare = (Square)e.getSource();
            if (movemode == false){
                if(pressedSquare.getType().equals("g")){
                    pressedSquare.Change("gg");
                    movemode = true;
                    selectsquare = pressedSquare;
                }
                else if(pressedSquare.getType().equals("r")){
                    pressedSquare.Change("rg");
                    movemode = true;
                    selectsquare = pressedSquare;
                }
            }
            else{
                int newi = this.getSquare(pressedSquare)[0];
                int oldi = this.getSquare(selectsquare)[0];
                int newj = this.getSquare(pressedSquare)[1];
                int oldj = this.getSquare(selectsquare)[1];
                if(pressedSquare.getType().equals("l")){
                    if((Math.abs(newi - oldi) == 2) && (Math.abs(newj - oldj) == 2)){
                        if((buttList[(newi+oldi)/2][(newj+oldj)/2].getType().equals("g"))){
                            if(selectsquare.getType().equals("gg")){
                                pressedSquare.Change("g");
                            }
                            else{
                                pressedSquare.Change("r");
                            }
                            selectsquare.Change("l");
                            buttList[(newi+oldi)/2][(newj+oldj)/2].Change("l");
                            this.checkLevel();
                        }
                        else if((buttList[(newi+oldi)/2][(newj+oldj)/2].getType().equals("r"))){
                            pressedSquare.Change("g");
                            selectsquare.Change("l");
                            buttList[(newi+oldi)/2][(newj+oldj)/2].Change("l");
                            this.gameOver();
                        }
                    }
                    else if ((Math.abs(newi - oldi) == 1) && (Math.abs(newj - oldj) == 1)){
                        if((buttList[newi][newj].getType().equals("l"))){
                            if(selectsquare.getType().equals("gg")){
                                pressedSquare.Change("g");
                            }
                            else{
                                pressedSquare.Change("r");
                            }
                            buttList[oldi][oldj].Change("l");
                            System.out.println(selectsquare.getType());
                        }
                    }
                    else{
                        if(selectsquare.getType().equals("gg")){
                            pressedSquare.Change("g");
                        }
                        else{
                            pressedSquare.Change("r");
                        }
                    }
                }
                movemode = false;
            }
        }
    }
    public int[] getSquare(Square s){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(buttList[i][j] == s){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
    public void gameOver(){
        System.out.println("Game Over!");
    }

    public void checkLevel(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(buttList[i][j].getType().equals("g")){
                    System.out.println("check");
                    return;
                }
            }
        }
        level++;
        this.setLevel(level);
    }
}