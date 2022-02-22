//10 c
import java.awt.*;
import java.awt.event.*;

//import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
class StudentResult extends Frame implements ActionListener{
    Label lname, lrollno, lgender, lm1, lm2, lm3, ltot, lper;
    TextField tname, trollno, tgender, tm1, tm2, tm3, ttot, tper;
    Checkbox cbm, cbf;
    CheckboxGroup cbg;
    Button bsubmit, bclear;
    public StudentResult() {
        lname = new Label("Name : ");
        lrollno = new Label("Roll no : ");
        lgender = new Label("Gender : ");
        lm1 = new Label("English : ");
        lm2 = new Label("Maths : ");
        lm3 = new Label("Science : ");
        ltot = new Label("Total : ");
        lper = new Label("Percentage : ");
        tname = new TextField(10);
        trollno = new TextField(10);
        tm1 = new TextField(10);
        tm2 = new TextField(10);
        tm3 = new TextField(10);
        ttot = new TextField(10);
        tper = new TextField(10);
        cbg = new CheckboxGroup();
        cbm = new Checkbox("Male", cbg, false);
        cbf = new Checkbox("Female", cbg, false);
        bsubmit = new Button("Submit");
        bclear = new Button("Clear");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=1;
        add(lname,gbc);
        gbc.gridx=2;
        gbc.gridy=1;
        add(tname,gbc);
        gbc.gridx=1;
        gbc.gridy=2;
        add(lrollno,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        add(trollno,gbc);
        gbc.gridx=1;
        gbc.gridy=3;
        add(lgender,gbc);
        gbc.gridx=2;
        gbc.gridy=3;
        add(cbm,gbc);
        gbc.gridx=3;
        gbc.gridy=3;
        add(cbf,gbc);
        gbc.gridx=1;
        gbc.gridy=4;
        add(lm1,gbc);
        gbc.gridx=2;
        gbc.gridy=4;
        add(tm1,gbc);
        gbc.gridx=1;
        gbc.gridy=5;
        add(lm2,gbc);
        gbc.gridx=2;
        gbc.gridy=5;
        add(tm2,gbc);
        gbc.gridx=1;
        gbc.gridy=6;
        add(lm3,gbc);
        gbc.gridx=2;
        gbc.gridy=6;
        add(tm3,gbc);
        gbc.gridx=1;
        gbc.gridy=7;
        add(ltot,gbc);
        gbc.gridx=2;
        gbc.gridy=7;
        add(ttot,gbc);
        gbc.gridx=1;
        gbc.gridy=8;
        add(lper,gbc);
        gbc.gridx=2;
        gbc.gridy=8;
        add(tper,gbc);
        gbc.gridx=1;
        gbc.gridy=9;
        add(bsubmit,gbc);
        gbc.gridx=2;
        gbc.gridy=9;
        add(bclear,gbc);
        bsubmit.addActionListener(this);
        bclear.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new StudentResult();
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bsubmit){
            int s1 = Integer.parseInt(tm1.getText());
            int s2 = Integer.parseInt(tm2.getText());
            int s3 = Integer.parseInt(tm3.getText());
            int t = s1+s2+s3;
            float p = t/3;
            ttot.setText(String.valueOf(t));
            tper.setText(String.valueOf(p));
        }
        else{
            tname.setText("");
            trollno.setText("");
            tm1.setText("");
            tm2.setText("");
            tm3.setText("");
            ttot.setText("");
            tper.setText("");
        }
    }
}
