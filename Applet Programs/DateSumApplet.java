import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code=DateSumApplet
           width=600
           height=600
>
</applet>
*/

public class DateSumApplet extends Applet implements Runnable{
        Thread t;
        Random r=new Random();
        int sum=0;
        Date d;
        String str;
        public void init(){
                setBackground(Color.blue);
                setForeground(Color.white);
                Font f=new Font("Dialog",Font.PLAIN,14);
                setFont(f);
        }
        public void start(){
                t=new Thread(this);
                t.start();
        }        
        public void paint(Graphics g){
                g.drawString(str,350,50);
                g.drawString("Cumulative sum of Random numbers is:"+sum,100,200);
        }
        public void run(){
                while(true){
                        try{
                                sum=sum+r.nextInt(100);
                                d=new Date();
                                str=d.toString();
                                Thread.sleep(1000);
                                repaint();
                        }
                        catch(InterruptedException ie){
                                System.out.println(ie);
                        }
                }
        }
}



