// Design a AWT program to print the factorial for an input value
import java.awt.*;
import java.awt.event.*;
class FactorialGUI extends Frame implements ActionListener {
    TextField tf1, tf2;
    public FactorialGUI() {
        setLayout(new FlowLayout());
        Label lb1 = new Label("Enter a number :");
        Label lb2 = new Label("Factorial is :");
        tf1 = new TextField(15);
        tf2 = new TextField(15);
        Button b1 = new Button("Calculate");
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(b1);
        b1.addActionListener(this);
    }
    public static void main(String[] args) {
        FactorialGUI f = new FactorialGUI();
        f.setSize(300, 300);
        f.setTitle("Calculating Factorial");
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        int n, a=1, i;
        n=Integer.parseInt(tf1.getText());
        for(i=1; i<=n; i++) {
            a=a*i;
        }
        tf2.setText(""+a);
    }
}

