//David Mo
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;

public class PokemonGame extends JApplet implements MouseListener, MouseMotionListener
{
	int x,y;

	//initialize images for all pokemon
	Image arceusB;
	Image arceusF;
	Image charizardB;
	Image charizardF;
	Image blastoiseB;
	Image blastoiseF;
	Image gyaradosB;
	Image gyaradosF;
	Image magikarpB;
	Image magikarpF;
	Image mewtwoB;
	Image mewtwoF;
	Image pikachuB;
	Image pikachuF;
	Image shuckleB;
	Image shuckleF;
	Image venasaurF;
	Image venasaurB;






	JLabel startLabel = new JLabel("Start!");
	ImageIcon icon = new ImageIcon("images\\pikachu_front.png");
	Image img = icon.getImage();
	ImageIcon background = new ImageIcon("images\\pokemonBattle.png");
	Image img2 = background.getImage();
	String str = "hello";




	public void init()
	{
		this.setSize(800,600);
		addMouseMotionListener( this );


	}

	public void paint(Graphics g)
	{
		g.drawImage(img2,0,0,null);
		g.drawImage(img,40,40,null);

	}


	public static void main(String[] args)
	{
		//new PokemonGame();
	}


	public void mouseDragged(MouseEvent e){};

	public void mouseClicked(MouseEvent e)
	{

		}
	public void mousePressed(MouseEvent e){};
	public void mouseReleased(MouseEvent e){};
	public void mouseEntered(MouseEvent e){};
	public void mouseExited(MouseEvent e){};
	public void mouseMoved(MouseEvent e)
	{
		 x = e.getX();
		      y = e.getY();
		      showStatus( "Mouse at (" + x + "," + y + ")" );
		      repaint();
      e.consume();
  }



}