import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*

<applet code=MethodSequence
        width=500
        height=200>
</applet>

*/

public class MethodSequence extends Applet
{
        String msg=null;
        public void init()
        {
                setBackground(Color.blue);
                setForeground(Color.white);
                Font f=new Font("Dialog",Font.BOLD+Font.ITALIC,20);
                setFont(f);
                
                msg="From init().....";
        }

        public void paint(Graphics g)
        {
                showStatus("Methods Of Applet..");
                msg=msg+"From paint().....";
                g.drawString(msg,50,50);
        }
        public void start()
        {
                msg=msg+"From start().....";
        }
	public void stop()
        {
                msg=msg+"From stop().....";
        }
}
                
        
