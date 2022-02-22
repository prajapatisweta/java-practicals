// 10b calculator 
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
    String s,s1,s2,s3,s4,s5;
    TextField t1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button bplus,bminus,bmul,bdiv,bmod,bequal,bclear;
    int a,b,c;
    Calculator() {
        Frame f = new Frame("My Calculator");
        t1 = new TextField(10);
        bplus=new Button("+");
        bminus =new Button("-");
        bmul=new Button("*");
        bdiv =new Button("/");
        bmod =new Button("%");
        bequal =new Button("=");
        bclear =new Button("C");
        b1 =new Button("1");
        b2 =new Button("2");
        b3 =new Button("3");
        b4 =new Button("4");
        b5 =new Button("5");
        b6 =new Button("6");
        b7 =new Button("7");
        b8 =new Button("8");
        b9 =new Button("9");
        b0 =new Button("0");
        f.add(t1);
        f.setLayout(new GridLayout(4,4,10,20));
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bclear);
        f.add(bplus);
        f.add(bminus);
        f.add(bmul);
        f.add(bdiv);
        f.add(bmod);
        f.add(bequal);
        f.add(bclear);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bclear.addActionListener(this);
        bequal.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
               System.exit(0); 
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        s=e.getActionCommand();
        if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals("0")){
           s1=t1.getText()+s;
           t1.setText(s1); 
        }
        if(s.equals("+")){
            s2 = t1.getText();
            t1.setText("");
            s3="+";
        }
        if(s.equals("-")){
            s2 = t1.getText();
            t1.setText("");
            s3="-";
        }
        if(s.equals("*")){
            s2 = t1.getText();
            t1.setText("");
            s3="*";
        }
        if(s.equals("/")){
            s2 = t1.getText();
            t1.setText("");
            s3="/";
        }
        if(s.equals("%")){
            s2 = t1.getText();
            t1.setText("");
            s3="%";
        }
        if(s.equals("=")){
            s4 = t1.getText();
            a=Integer.parseInt(s2);
            b=Integer.parseInt(s4);
            if(s3.equals("+"))
            c=a+b;
            if(s3.equals("-"))
            c=a-b;
            if(s3.equals("*"))
            c=a*b;
            if(s3.equals("/"))
            c=a/b;
            if(s3.equals("%"))
            c=a%b;
            t1.setText(String.valueOf(c));
        }
        if(s.equals("c"))
        t1.setText("");
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
