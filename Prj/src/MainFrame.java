import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame {

//    private JTextArea textArea;
    private Textpanel textPanel;
    private JButton btn;

    public MainFrame(){
        super("Hello World");
        setSize(500, 400);
        setVisible(true);
//        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textPanel = new Textpanel();
        btn = new JButton("Click me");


        add(textPanel, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.appendText("Button clicked\n");
            }
        });


    }

}
