import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    private Textpanel textPanel;
    private JButton btn;
    private Toolbar toolbar;

    public MainFrame(){
        super("Hello World");
        setSize(500, 400);
        setVisible(true);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        toolbar = new Toolbar();
        textPanel = new Textpanel();

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmmited(String text) {
                textPanel.appendText(text);
            }
        });

        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);



    }

}
