import javax.swing.*;
import java.awt.*;

public class Level{
    private Square[][] buttList = new Square[5][5];

    private int lilyswitch = 0;
    public Level(){
        
        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                if (lilyswitch == 0){
                    buttList[i][j] = new Square("Water");
                    lilyswitch = 1;
                }
                else{
                    buttList[i][j] = new Square("Lily");
                    lilyswitch = 0;
                }
                panel.add(buttList[i][j].b);
            }
        }

        if (levelnum == 1){

        }
        
    }
}