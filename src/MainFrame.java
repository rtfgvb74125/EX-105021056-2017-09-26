import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class MainFrame extends Frame{
    private Button btnAdd = new Button("Add");
    private Button btnExit = new Button("Exit");
    private Label lab = new Label("0.0");
    private int x = 0,labX = 100,labY = 100;
    private int btnexX = 100,btnexY = 150;
    private Timer tl;
    private boolean bol = true;
    private int b = 77;
    private Color c = new Color(93,255, b);

    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLayout(null);
        btnAdd.setBounds(150,100,50,20);
        btnExit.setBounds(250,100,50,20);
        lab.setBounds(labX,labY,50,50);
        lab.setBackground(c);
        this.add(btnAdd);
        this.add(btnExit);
        this.add(lab);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle("Q皿Q");
                tl.start();
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        tl = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(labX<500 & bol){
                    labX += 5;
                    b+=2;
                    if(labX==500){
                        bol = false;
                    }
                    lab.setLocation(labX, labY);
                    lab.setBackground(new Color(93,255,b));
                }else{
                    labX-=5;
                    b-=2;
                    if(labX==0){
                        bol = true;
                    }
                    lab.setLocation(labX,labY);
                    lab.setBackground(new Color(93,255,b));
                }
            }
        });

    }

}
