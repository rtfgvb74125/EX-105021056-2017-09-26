import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button btnAdd = new Button("Add");
    private Button btnExit = new Button("Exit");
    private Label lab = new Label("0_0");
    private int x = 0;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,250);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnAdd.setBounds(100,100,100,100);
        btnExit.setBounds(150,100,100,100);
        lab.setBounds(200,100,100,100);
        this.add(btnAdd);
        this.add(btnExit);
        this.add(lab);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(++x));
                lab.setText(Integer.toString(x));
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
