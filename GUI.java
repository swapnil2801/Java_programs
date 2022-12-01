import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class FrameCrt extends  WindowAdapter implements ActionListener
{
    Integer no1,no2;
    Label l = new Label();

    Button b1 = new Button("X");
    Button b2 = new Button("-");
    Button b3 = new Button("*");
    Button b4 = new Button("/");
    Button b5 = new Button("1");
    Button b6 = new Button("2");
    Button b7 = new Button("3");
    Button b8 = new Button("4");
    Button b9 = new Button("5");
    Button b10 = new Button("6");
    Button b11 = new Button("7");
    Button b12 = new Button("8");
    Button b13 = new Button("9");
    Button b14 = new Button("0");
    Button b15 = new Button("+");
    Button b16 = new Button("=");

    // TextField t1 = new TextField();
    // TextField t2 = new TextField();

    public FrameCrt(String title)
    {
        Frame fobj= new Frame(title);

        fobj.setSize(500,700);
        fobj.setVisible(true);
        fobj.setBackground(Color.GRAY);
        fobj.addWindowListener(this);

        b1.setForeground(Color.blue);
        b2.setForeground(Color.blue);
        b3.setForeground(Color.blue);
        b4.setForeground(Color.blue);
        b5.setForeground(Color.white);
        b6.setForeground(Color.white);
        b7.setForeground(Color.white);
        b8.setForeground(Color.white);
        b9.setForeground(Color.white);
        b10.setForeground(Color.white);
        b11.setForeground(Color.white);
        b12.setForeground(Color.white);
        b13.setForeground(Color.white);
        b14.setForeground(Color.white);
        b15.setForeground(Color.blue);
        b16.setForeground(Color.blue);

        b1.setBounds(20,200,90,40);
        b2.setBounds(130,200,90,40);
        b3.setBounds(240,200,90,40);
        b4.setBounds(350,200,90,40);
        b15.setBounds(350,300,90,50);
        b16.setBounds(350,400,90,50);

        b5.setBounds(20,300,90,50);
        b6.setBounds(130,300,90,50);
        b7.setBounds(240,300,90,50);
        b8.setBounds(20,400,90,50);
        b9.setBounds(130,400,90,50);
        b10.setBounds(240,400,90,50);
        b11.setBounds(20,500,90,50);
        b12.setBounds(130,500,90,50);
        b13.setBounds(240,500,90,50);
        b14.setBounds(130,600,90,50);

        b1.setBackground(Color.RED);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.RED);
        b4.setBackground(Color.RED);
        b5.setBackground(Color.CYAN);
        b6.setBackground(Color.CYAN);
        b7.setBackground(Color.CYAN);
        b8.setBackground(Color.CYAN);
        b9.setBackground(Color.CYAN);
        b10.setBackground(Color.CYAN);
        b11.setBackground(Color.CYAN);
        b12.setBackground(Color.CYAN);
        b13.setBackground(Color.CYAN);
        b14.setBackground(Color.CYAN);
        b15.setBackground(Color.RED);
        b16.setBackground(Color.RED);

        b1.setFont(new Font("Calibri", Font.BOLD, 30));
        b2.setFont(new Font("Calibri", Font.BOLD, 30));
        b3.setFont(new Font("Calibri", Font.BOLD, 30));
        b4.setFont(new Font("Calibri", Font.BOLD, 30));
        b5.setFont(new Font("Calibri", Font.BOLD, 30));
        b6.setFont(new Font("Calibri", Font.BOLD, 30));
        b7.setFont(new Font("Calibri", Font.BOLD, 30));
        b8.setFont(new Font("Calibri", Font.BOLD, 30));
        b9.setFont(new Font("Calibri", Font.BOLD, 30));
        b10.setFont(new Font("Calibri", Font.BOLD, 30));
        b11.setFont(new Font("Calibri", Font.BOLD, 30));
        b12.setFont(new Font("Calibri", Font.BOLD, 30));
        b13.setFont(new Font("Calibri", Font.BOLD, 30));
        b14.setFont(new Font("Calibri", Font.BOLD, 30));
        b15.setFont(new Font("Calibri", Font.BOLD, 30));
        b16.setFont(new Font("Calibri", Font.BOLD, 30));
        
        // t1.setBounds(30,40,420,30);
        // t2.setBounds(30,80,420,30);

        l.setBounds(30,80,420,60);
        l.setFont(new Font("Calibri", Font.BOLD, 30));
        l.setBackground(Color.white);


        fobj.add(b1);
        fobj.add(b2);
        fobj.add(b3);
        fobj.add(b4);
        // fobj.add(t1);
        // fobj.add(t2);
        fobj.add(l);
        fobj.add(b5);
        fobj.add(b6);
        fobj.add(b7);
        fobj.add(b8);
        fobj.add(b9);
        fobj.add(b10);
        fobj.add(b11);
        fobj.add(b12);
        fobj.add(b13);
        fobj.add(b14);
        fobj.add(b15);
        fobj.add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);


        fobj.setLayout(null);
        fobj.setVisible(true);

    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent obj)
    {
        try 
        {
            
            // no1 = Integer.parseInt(t1.getText());
            // no2 = Integer.parseInt(t2.getText());
            String N1,N2 = null;

            if(obj.getSource() == b5)
            {
                N1 = N2+"1";
                l.setText(N1);
            }
            if(obj.getSource() == b6)
            {
                N1 = "1";
                l.setText("2");
            }
            if(obj.getSource() == b7)
            {
                N1 = "1";
                l.setText("3");
            }
            if(obj.getSource() == b8)
            {
                N1 = "1";
                l.setText("4");
            }
            if(obj.getSource() == b9)
            {
                N1 = "1";
                l.setText("5");
            }
            if(obj.getSource() == b10)
            {
                N1 = "1";
                l.setText("6");
            }
            if(obj.getSource() == b11)
            {
                N1 = "1";
                l.setText("7");
            }
            if(obj.getSource() == b12)
            {
                N1 = "1";
                l.setText("8");
            }
            if(obj.getSource() == b13)
            {
                N1 = "1";
                l.setText("9");
            }
            if(obj.getSource() == b14)
            {
                N1 = "1";
                l.setText("0");
            }




            if(obj.getSource() == b1)
            {
                l.setText("Addition is : "+(no1+no2));
            }
            else if(obj.getSource() == b2)
            {
                l.setText("Subtraction is : "+(no1-no2));
            }
            else if(obj.getSource() == b3)
            {
                l.setText("Multiplication is : "+(no1*no2));
            }
            else if(obj.getSource() == b4)
            {
                l.setText("Division is : "+((float)no1/(float)no2));
            }
            else if(obj.getSource() == b15)
            {
                l.setText("Subtraction is : "+(no1+no2));
            }
            else if(obj.getSource() == b16)
            {
                l.setText("Division is : "+("="));
            }
        }
        catch(Exception eobj)
        {}

    }


}

class GUI2
{
    public static void main(String A[])
    {
        FrameCrt fobj = new FrameCrt("Cool Baby");
    }
}