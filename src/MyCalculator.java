import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyCalculator extends JFrame {
    public MyCalculator(int width, int height) {
        super("My Calculator");
        setSize(width,height);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {

                System.exit(0);            }
        });
        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField();
        jTextField.setBounds(50, 10, 230, 30);
        jPanel.add(jTextField);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(50, 50, 230, 30);
        jPanel.add(jTextField2);
        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(50, 90, 230, 30);
        jTextField3.setEnabled(false);
        jPanel.add(jTextField3);
        jPanel.setLayout(null);

        JButton jButton = new JButton("+");
        jButton.setBounds(50, 130, 50, 30);
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                String sd=jTextField2.getText();
                int k=Integer.parseInt(sd);
                int rezult=x+k;
                String qw=Integer.toString(rezult);
                jTextField3.setText(qw);


            }
        });


        JButton jButton1 = new JButton("-");
        jButton1.setBounds(110, 130, 50, 30);
        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent a) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                String sd=jTextField2.getText();
                int k=Integer.parseInt(sd);
                int rezult=x-k;
                String qw=Integer.toString(rezult);
                jTextField3.setText(qw);

            }
        });

        JButton jButton2 = new JButton("*");
        jButton2.setBounds(170, 130, 50, 30);
        jButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent s) {
                String sb=jTextField.getText();
                double x=Double.parseDouble(sb);
                String sd=jTextField2.getText();
                double k=Double.parseDouble(sd);
                double rezult=x*k;
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

        }        });


        JButton jButton3 = new JButton("/");
        jButton3.setBounds(230, 130, 50, 30);
        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent d) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                String sd=jTextField2.getText();
                int k=Integer.parseInt(sd);
                double rezult=x/k;
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);



        }        });
        JButton jButton4 = new JButton("^P");
        jButton4.setBounds(50, 170, 50, 30);
        jButton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent b) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                String sd=jTextField2.getText();
                int k=Integer.parseInt(sd);
                int rezult= (int) Math.pow(x,k);
                String qw=Integer.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton5 = new JButton("sq");
        jButton5.setBounds(110, 170, 50, 30);
        jButton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent l) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                double rezult=Math.sqrt(x);
                String qw=Double.toString( rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton6 = new JButton("| |");
        jButton6.setBounds(170, 170, 50, 30);
        jButton6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent l) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                int rezult= Math.abs(x);
                String qw=Integer.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton7 = new JButton("LN");
        jButton7.setBounds(230, 170, 50, 30);
        jButton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent t) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                double rezult= Math.log(x);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton8 = new JButton("sn");
        jButton8.setBounds(50, 210, 50, 30);
        jButton8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent m) {
                String sb=jTextField.getText();
                double x=Integer.parseInt(sb);
                double rezult= Math.sin(x);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton9 = new JButton("cs");
        jButton9.setBounds(110, 210, 50, 30);
        jButton9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent n) {
                String sb=jTextField.getText();
                double x=Integer.parseInt(sb);
                double rezult= Math.cos(x);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton10 = new JButton("tg");
        jButton10.setBounds(170, 210, 50, 30);
        jButton10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent f) {
                String sb=jTextField.getText();
                double x=Integer.parseInt(sb);
                double rezult= Math.tan(x);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton11 = new JButton("cg");
        jButton11.setBounds(230, 210, 50, 30);
        jButton11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent f) {
                String sb=jTextField.getText();
                double x=Integer.parseInt(sb);
                double rezult= Math.atan(x);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton12 = new JButton("fc");
        jButton12.setBounds(50, 250, 50, 30);
        jButton12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent c) {
                String sb=jTextField.getText();
                int x=Integer.parseInt(sb);
                int rezult=1;
                for(int i=1;i<=x;i++){
                    rezult *=i;
                }
                    String qw=Integer.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton13 = new JButton("Fg");
        jButton13.setBounds(110, 250, 50, 30);
        jButton13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent f) {
                String sb=jTextField.getText();
                double x=Integer.parseInt(sb);
                String sd=jTextField.getText();
                double k=Integer.parseInt(sd);
                double rezult=Math.sqrt(Math.pow(x,2)+Math.pow(k,2));
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton14 = new JButton("Ex");
        jButton14.setBounds(170, 250, 50, 30);
        jButton14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent f) {
                String sb=jTextField.getText();
                double x=Integer.parseInt(sb);
                double rezult=Math.exp(x);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });
        JButton jButton15 = new JButton("^2");
        jButton15.setBounds(230, 250, 50, 30);
        jButton15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent q) {
                String sb=jTextField.getText();
                double x=Double.parseDouble(sb);
                double rezult=Math.pow(x,2);
                String qw=Double.toString(rezult);
                jTextField3.setText(qw);

            }
        });

        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(jButton8);
        jPanel.add(jButton9);
        jPanel.add(jButton10);
        jPanel.add(jButton11);
        jPanel.add(jButton12);
        jPanel.add(jButton13);
        jPanel.add(jButton14);
        jPanel.add(jButton15);





        add(jPanel);
        setVisible(true);
    }}