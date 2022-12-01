import java.awt.*;
import java.awt.event.*;

class FrameCrt implements WindowListener
{
    public FrameCrt(String title)
    {
        Frame obj= new Frame(title);

        obj.setSize(500,500);
        obj.setVisible(true);
        obj.addWindowListener(this);
    }
    public void windowDeactivated(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void windowOpened(WindowEvent obj){}


}

class GUI1 
{
    public static void main(String A[])
    {
        FrameCrt fobj = new FrameCrt("Cool Baby");
    }
}