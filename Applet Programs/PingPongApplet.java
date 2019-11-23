import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code=PingPongApplet
           width=400
           height=400
>
</applet>
*/

public class PingPongApplet extends Applet implements Runnable{
        Random r=new Random();
        String str="ping PONG";
        int s;
        Thread t;
        public void init(){
                setBackground(Color.blue);
                setForeground(Color.red);
                Font f=new Font("SanSerif",Font.PLAIN,18);
                setFont(f);
        }
        public void start(){
                t=new Thread(this);
                t.start();
        }
        public void paint(Graphics g){
                showStatus("Lots of pings and pongs....");
                g.drawString(str,10+s,10+s);
        }
        public void run(){
                while(true){
                        try{
                                s=r.nextInt(400);
                                Thread.sleep(500);
                                repaint();
                        }
                        catch(InterruptedException ie){
                                System.out.println(ie);
                        }
                }
        }
}



