import java.awt.*;
import java.applet.*;

/*
<applet code=BannerApplet
           width=400
           height=400
>
</applet>
*/

public class BannerApplet extends Applet implements Runnable{
        Thread t;
        String msg="Department of Computer Application ";
        boolean flag;
        public void init(){
                setBackground(Color.blue);
                setForeground(Color.red);
                Font f=new Font("Dialog",Font.PLAIN,28);
                setFont(f);
        }
        public void start(){
                t=new Thread(this);
                flag=false;
                t.start();
        }
        public void run(){
                char ch;
                while(true){
                        try{
                                repaint();
                                Thread.sleep(250);
                                ch=msg.charAt(0);
                                msg=msg.substring(1,msg.length());
                                msg=msg+ch;
                                if(flag)
                                        break;
                        }
                        catch(InterruptedException ie){
                                System.out.println(ie);
                        }
                }
        }
        public void stop(){
                flag=true;
                t=null;
        }
        public void paint(Graphics g){
                g.drawString(msg,10,200);
        }
}




