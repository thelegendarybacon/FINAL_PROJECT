//David Mo
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;

public class paintSelectionScreen extends JApplet
{
	ImageIcon charizardIconB = new ImageIcon("images\\charizard_back.png");
		ImageIcon charizardIconF = new ImageIcon("images\\charizard_front.png");

		ImageIcon blastoiseIconF = new ImageIcon("images\\blastoise_front.png");



		ImageIcon magikarpIconF = new ImageIcon("images\\magikarp_front.png");

		ImageIcon mewtwoIconF = new ImageIcon("images\\mewtwo_front.png");

		ImageIcon pikachuIconF = new ImageIcon("images\\pikachu_front.png");

		ImageIcon shuckleIconF = new ImageIcon("images\\shuckle_front.png");







	Image charizardF = charizardIconF.getImage();

	Image blastoiseF = blastoiseIconF.getImage();


	Image magikarpF = magikarpIconF.getImage();

	Image mewtwoF = mewtwoIconF.getImage();

	Image pikachuF = pikachuIconF.getImage();

	Image shuckleF = shuckleIconF.getImage();


	private int x , y;
	Image hold1, hold2, hold3, hold4, hold5, hold6;
	public paintSelectionScreen()
	{

	}

	public void draw(Graphics g)
	{
		g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g.drawImage(charizardF, 40,200,null);
		g.drawImage(blastoiseF,40,300,null);
		g.drawImage(pikachuF,40,400,null);
		g.drawImage(magikarpF,680,200,null);
		g.drawImage(mewtwoF,680,300,null);
		g.drawImage(shuckleF,680,400,null);
		g.setColor(Color.red);
		g.drawString("Choose your Pokemon!",40,100);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		g.drawString("Team 1:",40,550);
		g.drawString("team 2:",430,550);
	}


}

