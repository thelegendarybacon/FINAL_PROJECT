//David Mo
//health bar
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;

public class paintHpBar extends JApplet
{
		int maxHp, currentHp;
		double hpBarVal;
		public paintHpBar(Pokemon name)
		{
			maxHP = name.getHP();
			currentHp = name.getHP();
		}

		public void draw(Graphics g)
		{
			hpBarVal = (  (currentHp/maxHp) * 100);
			g.fillRect(153,129,hpBarVal, 20);

		}

		public void changeHP(int hp)
		{
			currentHp = hp;
			repaint();
		}


}