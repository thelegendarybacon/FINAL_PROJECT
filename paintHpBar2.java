//David Mo
//health bar
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;

public class paintHpBar2 extends JApplet
{
		int maxHp, currentHp;
		double hpBarVal;

		public paintHpBar2(Pokemon name)
		{
			this.maxHp = name.getHP();
			this.currentHp = name.getHP();
		}

		public void draw(Graphics g)
		{
			g.setColor(Color.green);
			hpBarVal = (  (currentHp/maxHp) * 100);
			g.fillRect(616,366,(int)hpBarVal, 20);

		}

		public void changeHP(int hp)
		{
			currentHp = hp;
			repaint();
		}


}