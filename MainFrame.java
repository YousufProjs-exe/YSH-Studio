import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("my first frame and YSH Studio's too ! ");
        // im keeping this for dev purposes
        setSize(1000, 650);
        // the main frame would be  
        // setSize(1450, 900); // perfect !! 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}