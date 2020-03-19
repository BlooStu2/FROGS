import javax.swing.*;

public class Square extends JButton{
    private ImageIcon w = new ImageIcon("./assets/Water.png");
    private ImageIcon l = new ImageIcon("./assets/LilyPad.png");
    private ImageIcon r = new ImageIcon("./assets/RedFrog.png");
    private ImageIcon rg = new ImageIcon("./assets/RedFrog2.png");
    private ImageIcon g = new ImageIcon("./assets/GreenFrog.png");
    private ImageIcon gg = new ImageIcon("./assets/GreenFrog2.png");
    private String type = "w";

    public Square(){
        this.setIcon(w);
    }
    public Square(String yeet){
        this.Change(yeet);
    }

    public void Change(String item){
        type = item;
        if(type.equals("w")){
            this.setIcon(w);
        }
        else if(type.equals("l")){
            this.setIcon(l);
        }
        else if(type.equals("r")){
            this.setIcon(r);
        }
        else if(type.equals("rg")){
            this.setIcon(rg);
        }
        else if(type.equals("g")){
            this.setIcon(g);
        }
        else if(type.equals("gg")){
            this.setIcon(gg);
        }
    }
    public String getType(){
        return type;
    }
}