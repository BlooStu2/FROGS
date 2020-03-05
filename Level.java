import javax.swing.*;
import java.awt.*;

public class Level{
    private char[][] levels = new char[40][13];
    levels[0] = {'l','l','l','l','l','l','l','l','l','l','l','l','l','l'};
    private int lilyswitch = 0;
    private int levelnum = 1;
    public Level(JPanel panel, Square[][] buttList){
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if (lilyswitch == 0){
                    buttList[i][j] = new Square();
                    lilyswitch = 1;
                }
                panel.add(buttList[i][j].b);
            }
        }
        if (levelnum == 1){

        }
        
    }
}