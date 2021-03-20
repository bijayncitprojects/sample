
import javax.swing.*;

class MessageDialog{
    JFrame f;

    MessageDialog(){
        f = new JFrame("Message Dialog");
        f.setSize(400,500);

        JOptionPane.showMessageDialog(f, "You have failed !!","Warning",JOptionPane.WARNING_MESSAGE);

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String [] args){
        new MessageDialog();
    }
}
    

