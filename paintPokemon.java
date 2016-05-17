//David Moawt.*;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;

public class paintPokemon extends JApplet
{
	private int x , y;
	Image hold;
	public paintPokemon(Image img)
	{
		hold = img;
		x = 200;
		y = 200;
	}

	public void draw(Graphics g)
	{
		g.drawImage(hold,x,y,null);
	}


}
