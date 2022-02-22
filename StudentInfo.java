//10 a
import java.awt.*;
import java.awt.event.*;
class StudentInfo extends Frame {
    TextField tf1,tf2,tf3;
    Label lb;
    public StudentInfo() {
        setLayout(new FlowLayout());
        tf1 = new TextField(4);
        tf2 = new TextField(6);
        tf3 = new TextField(6);
        Label l1 = new Label("Enter Roll Number : ");
        Label l2 = new Label("Enter Name : ");
        Label l3 = new Label("Enter Stream : ");
        lb = new Label();
        Button b1 = new Button("Save");
        Button b2 = new Button("Retrive");
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);
        add(b1);
        add(b2);
        add(lb);

        lb.setForeground(Color.red);
        b1.addActionListener(new SaveInnerClass());
        b2.addActionListener(new RetrieveInnerClass());
    }
    public static void main(String[] args) {
        StudentInfo j1=new StudentInfo();
        j1.setSize(900,300);
        j1.setTitle("Student Details");
        j1.setVisible(true);
    }
    class RetrieveInnerClass implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            lb.setText("Roll no. of Student : " +tf1.getText()+ 
            " ,  Name of Student is : "+tf2.getText()+ 
            " ,  Stream of student is : "+tf3.getText());
        }
    }
    class SaveInnerClass implements ActionListener {
        String s1=tf1.getText(), s2=" ", s3=" ";
        public void actionPerformed(ActionEvent ae){
            s1=s1+tf1.getText();
            s2=s2+tf2.getText();
            s3=s3+tf3.getText();
            lb.setText("Inserted");
        }
    }
    
}

