import javax.swing.*;

public class Square{
    private ImageIcon w = new ImageIcon("./assets/Water.png");
    private ImageIcon l = new ImageIcon("./assets/LilyPad.png");
    private ImageIcon r = new ImageIcon("./assets/RedFrog.png");
    private ImageIcon rg = new ImageIcon("./assets/RedFrog2.png");
    private ImageIcon g = new ImageIcon("./assets/GreenFrog.png");
    private ImageIcon gg = new ImageIcon("./assets/GreenFrog2.png");
    public JButton b;
    private String type = "Water"

    public Square(){
        b = new JButton(w);
    }
    public Square(String yeet){
        if (yeet.equals("Lily")){
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
    public void Change(String item){
        if(item.equals("w")){
            b.setIcon(w);
        }
        else if(item.equals("l")){
            b.setIcon(l);
        }
        else if(item.equals("r")){
            b.setIcon(r);
        }
        else if(item.equals("rg")){
            b.setIcon(rg);
        }
        else if(item.equals("g")){
            b.setIcon(g);
        }
        else if(item.equals("gg")){
            b.setIcon(gg);
        }
    }
    public String getType(){
        if(b.getIcon)
    }
}