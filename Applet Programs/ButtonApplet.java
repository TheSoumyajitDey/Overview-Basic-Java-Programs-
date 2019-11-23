import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code=ButtonApplet
           width=500
           height=500
>
</applet>
*/

public class ButtonApplet extends Applet
{
	String msg=null;
	Button yes,no,maybe;
	public void init()
	{		
		yes=new Button("YES");
		no=new Button("NO");
		maybe=new Button("MAYBE");
		yes.setBounds(20,40,100,20);
		no.setBounds(20,80,100,20);
		maybe.setBounds(20,120,100,20);	
		add(yes);
		add(no);
		add(maybe);			
		yes.addActionListener(new MyActionListener(this));
		no.addActionListener(new MyActionListener(this));
		maybe.addActionListener(new MyActionListener(this));		
	}	
	public void paint(Graphics g)
	{		
		g.drawString(msg,20,160);
	}
}

class MyActionListener implements ActionListener
{
	ButtonApplet ba;
			
	MyActionListener(ButtonApplet ba)
	{
		this.ba=ba;
	}
	public void actionPerformed(ActionEvent ae)
	{			
			String s=ae.getActionCommand();
			ba.setFont(new Font("Dialog",Font.BOLD,16));
			if(s.equals("YES"))
				ba.msg="You have Pressed YES";
			else if(s.equals("NO"))
				ba.msg="You have Pressed NO";
			else				
				ba.msg="You have Pressed MAYBE";
			ba.repaint();								
	}	
}


