import javax.swing.*;

public class Square{
    private ImageIcon w = new ImageIcon("./assets/Water.png");
    private ImageIcon l = new ImageIcon("./assets/LilyPad.png");
    private ImageIcon r = new ImageIcon("./assets/RedFrog.png");
    private ImageIcon rg = new ImageIcon("./assets/RedFrog2.png");
    private ImageIcon g = new ImageIcon("./assets/GreenFrog.png");
    private ImageIcon gg = new ImageIcon("./assets/GreenFrog2.png");
    public JButton b;

    public Square(String yeet){
        if (yeet.equals("Water")){
            b = new JButton(w);
        }
        else if (yeet.equals("Lily")){
            b = new JButton(l);
        }
        else if (yeet.equals("RedFrog")){
            b = new JButton(r);
        }
        else if (yeet.equals("GreenFrog")){
            b = new JButton(g);
        }
        else if (yeet.equals("RedFrogSel")){
            b = new JButton(rg);
        }
        else if (yeet.equals("GreenFrogSel")){
            b = new JButton(gg);
        }
    }
}