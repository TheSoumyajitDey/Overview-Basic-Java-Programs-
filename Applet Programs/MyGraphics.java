/*<applet code="MyGraphics"
          width=400
          height=500>
</applet>
*/

import java.awt.*;
import java.applet.*;

public class MyGraphics extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("HI!this is my first java applet",10,10);
        showStatus("Hello Applet");
        g.drawLine(20,20,110,120);
        //g.drawRect(30,30,100,120);
         g.fillRect(30,30,100,120);
         g.drawRoundRect(130 ,130,50,50,5,5);
         g.drawOval(200,200,50,50);
         
    }
}
