//David Mo
//David Moawt.*;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;
public class paintBackground extends JApplet
{
	Image hold;
	public paintBackground(Image img)
	{
		hold = img;
	}

	public void draw(Graphics g)
	{
		g.drawImage(hold,0,0,null);
	}


}