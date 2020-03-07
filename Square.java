import javax.swing.*;

public class Square{
    private ImageIcon w = new ImageIcon("./assets/Water.png");
    private ImageIcon l = new ImageIcon("./assets/LilyPad.png");
    private ImageIcon r = new ImageIcon("./assets/RedFrog.png");
    private ImageIcon rg = new ImageIcon("./assets/RedFrog2.png");
    private ImageIcon g = new ImageIcon("./assets/GreenFrog.png");
    private ImageIcon gg = new ImageIcon("./assets/GreenFrog2.png");
    public JButton b;
    private String type = "w";

    public Square(){
        b = new JButton(w);
    }
    public Square(String yeet){
        type = yeet;
        b = new JButton(yeet);
        if (type.equals("l")){
            b = new JButton(l);
        }
        else if (type.equals("r")){
            b = new JButton(r);
        }
        else if (type.equals("g")){
            b = new JButton(g);
        }
        else if (type.equals("rg")){
            b = new JButton(rg);
        }
        else if (type.equals("gg")){
            b = new JButton(gg);
        }
    }
    public void Update(){
        if(type.equals("w")){
            b.setIcon(w);
        }
        else if(type.equals("l")){
            b.setIcon(l);
        }
        else if(type.equals("r")){
            b.setIcon(r);
        }
        else if(type.equals("rg")){
            b.setIcon(rg);
        }
        else if(type.equals("g")){
            b.setIcon(g);
        }
        else if(type.equals("gg")){
            b.setIcon(gg);
        }
    }
    public void Change(String item){
        type = item;
    }
    public String getType(){
        return type;
    }
}