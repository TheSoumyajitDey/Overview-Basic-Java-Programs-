import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code  =ParamPassing
        width =500
        height=200>
<param name=hardDisk value=300>
<param name=opSystem value=unix> 
</applet>       
*/

public class ParamPassing extends Applet
{
        int hdd;
        String op;

        public void start()
        {
		String str;
		str=getParameter("hardDisk");		
		try
                {
			if(str!=null)
	
				hdd=Integer.parseInt(str);
			else
				hdd=0;
		}
		catch(NumberFormatException e){}
		op=getParameter("opSystem");
		if(op==null)
			op="NOT FOUND";
        } 
        public void paint(Graphics g)
        {
                g.drawString("HardDisk is "+hdd+" GB",10,20);
                g.drawString("Operating system is "+op,10,40);

        }
}
