/*<applet code="FirstApplet"
          height=600
          width=600>
</applet>*/

import java.applet.*;
import java.awt.*;
import java.util.*;

public class FirstApplet extends Applet implements Runnable
{
    Random r=new Random();
    Thread t;
    int a,b,count=1;
    String msg;
    public void start()
    {
        setBackground(Color.CYAN);
        setForeground(Color.RED);
        setFont(new Font("Dialog",Font.BOLD+Font.ITALIC,20));
        showStatus("Hello Everybody, How R U??????");
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
            g.drawString(msg,a,b);
            count++;
        
    }
    public void run()
    {

            while(true)
            {
                if(count%2==0)
                    msg="PONG";
                else
                    msg="ping";
                
                a=r.nextInt(600);
                b=r.nextInt(600);             
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException i)
                {}
                repaint();
            }
    }     
        
}
