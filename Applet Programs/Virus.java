
import java.applet.*;
import java.awt.*;


public class Virus extends Applet
{
        public void init()
	{
		SimpleFrame frame = new SimpleFrame();
                while(true)
                {
                        try
                        {
                                frame.setVisible(true);
                                Thread.sleep(1000);
                                frame.setVisible(false);
                                Thread.sleep(1000);
                        }
                        catch(InterruptedException ie)
                        {
                                System.out.println(ie);
                        }
                }
	}
}

class SimpleFrame extends Frame
{
        SimpleFrame()
	{
                setSize(200,200);
	}
}
