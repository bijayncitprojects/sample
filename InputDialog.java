
import javax.swing.*;


public class InputDialog {
    JFrame f;

    InputDialog(){
        f = new JFrame();
        f.setSize(400,300);

        f.setLayout(null);
        f.setVisible(true);

        JOptionPane.showInputDialog(f, "Please eneter your email");
    }
    public static void main(String [] args){
        new InputDialog();
    }
    
}
