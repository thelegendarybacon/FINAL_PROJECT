//David Mo
//health bar
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;

public class paintHpBar extends JApplet
{
		final int maxHp;
		int currentHp;
		double pctHP, hpBarVal;
		Pokemon poke;

		public paintHpBar(Pokemon name)
		{
			this.maxHp = name.getHP();
			this.currentHp = name.getHP();
			this.poke = name;
		}

		public void draw(Graphics g, int x, int y)
		{
			//hpBarVal = (  (poke.getHP()/(double)maxHp) * 156);
			pctHP = currentHp / (double)maxHp;
			hpBarVal = pctHP * 156;
			if(pctHP > .5)
				g.setColor(Color.green);
			else if(pctHP > .2)
				g.setColor(Color.yellow);
			else
				g.setColor(Color.red);
			g.fillRect(x,y,(int)hpBarVal, 20);
			//System.out.println(poke.getHP());
			//System.out.println(maxHp);

		}

		public void changeHP(Pokemon poke)
		{
			this.currentHp = poke.getHP();
			repaint();
		}


}