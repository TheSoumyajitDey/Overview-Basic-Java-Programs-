import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code=ArrayApplet
           width=400
           height=400
>
</applet>
*/
public class ArrayApplet extends Applet{
        Random r=new Random();
        int i,j,k;
        int a[];
        public void init(){
                setBackground(Color.blue);
                setForeground(Color.white);
                Font f=new Font("Dialog",Font.PLAIN,18);
                setFont(f);
                i=r.nextInt(10);
                a=new int[i];
                for(j=0;j<i;j++)
                        a[j]=r.nextInt(100);
        }
        public void paint(Graphics g){
                int max=a[0];
                for(j=1;j<i;j++){
                        if(a[j]>max)
                                max=a[j];
                } 
                k=20;
                for(j=0;j<i;j++){
                        g.drawString(a[j]+" ",10,10+k);
                        k=k+20;
                }
                g.drawString("Maximum element is:"+max,10,10+k);
        }
}




