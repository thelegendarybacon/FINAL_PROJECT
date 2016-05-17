//David Mo
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PokemonGame extends JApplet implements MouseListener, MouseMotionListener
{
	PokeBattle battle = new PokeBattle();

	ArrayList<Trainer> trainers = battle.getTrainers();

	Trainer student = trainers.get(0);
	Trainer hayes = trainers.get(1);
/*
	ArrayList<Pokemon> studentTeam = student.getTeam();
	ArrayList<Pokemon> hayesTeam = student.getTeam();
*/

	int x,y;

	//sets images
	ImageIcon arceusIconB = new ImageIcon("images\\arceus_back.png");
	ImageIcon arceusIconF = new ImageIcon("images\\arcues_front.png");
	ImageIcon charizardIconB = new ImageIcon("images\\charizard_back.png");
	ImageIcon charizardIconF = new ImageIcon("images\\charizard_front.png");
	ImageIcon blastoiseIconB = new ImageIcon("images\\blastoise_back.png");
	ImageIcon blastoiseIconF = new ImageIcon("images\\blastoise_front.png");
	ImageIcon gyaradosIconB = new ImageIcon("images\\gyarados_back.png");
	ImageIcon gyaradosIconF = new ImageIcon("images\\gyarados_front.png");
	ImageIcon magikarpIconB = new ImageIcon("images\\magikarp_back.png");
	ImageIcon magikarpIconF = new ImageIcon("images\\magikarp_front.png");
	ImageIcon mewtwoIconB = new ImageIcon("images\\mewtwo_back.png");
	ImageIcon mewtwoIconF = new ImageIcon("images\\mewtwo_front.png");
	ImageIcon pikachuIconB = new ImageIcon("images\\pikachu_back.png");
	ImageIcon pikachuIconF = new ImageIcon("images\\pikachu_front.png");
	ImageIcon shuckleIconB = new ImageIcon("images\\shuckle_back.png");
	ImageIcon shuckleIconF = new ImageIcon("images\\shuckle_front.png");
	ImageIcon venasaurIconB = new ImageIcon("images\\venasaur_back.png");
	ImageIcon venasaurIconF = new ImageIcon("images\\venasaur_front.png");
	ImageIcon mewtwoMIconB = new ImageIcon("images\\mewtwo_mega_back.png");
	ImageIcon mewtwoMIconF = new ImageIcon("images\\mewtwo_mega_front.png");
	ImageIcon charizardMIconB = new ImageIcon("images\\charizard_mega_back.png");
	ImageIcon charizardMIconF = new ImageIcon("images\\charizard_mega_front.png");
	ImageIcon profOakIcon = new ImageIcon("images\\prof_oak.png");

	//initialize images for all pokemon
	Image arceusB = arceusIconB.getImage();
	Image arceusF = arceusIconF.getImage();
	Image charizardB = charizardIconB.getImage();
	Image charizardF = charizardIconF.getImage();
	Image blastoiseB = blastoiseIconB.getImage();
	Image blastoiseF = blastoiseIconF.getImage();
	Image gyaradosB = gyaradosIconB.getImage();
	Image gyaradosF = gyaradosIconF.getImage();
	Image magikarpB = magikarpIconB.getImage();
	Image magikarpF = magikarpIconF.getImage();
	Image mewtwoB = mewtwoIconB.getImage();
	Image mewtwoF = mewtwoIconF.getImage();
	Image pikachuB = pikachuIconB.getImage();
	Image pikachuF = pikachuIconF.getImage();
	Image shuckleB = shuckleIconB.getImage();
	Image shuckleF = shuckleIconF.getImage();
	Image venasaurF = venasaurIconB.getImage();
	Image venasaurB = venasaurIconF.getImage();
	Image charizardMB = charizardMIconB.getImage();
	Image charizardMF = charizardMIconF.getImage();
	Image mewtwoMB = mewtwoMIconB.getImage();
	Image mewtwoMF = mewtwoMIconF.getImage();
	Image profOak = profOakIcon.getImage();


	JLabel startLabel = new JLabel("Start!");

	ImageIcon background = new ImageIcon("images\\pokemonBattle.png");
	Image img2 = background.getImage();

	paintPokemon pikachu;
	paintPokemon arceus;




	public void init()
	{
		this.setSize(800,600);
		setBackground(Color.blue);
		addMouseMotionListener( this );
		pikachu = new paintPokemon(pikachuF,200,200);
		arceus = new paintPokemon(arceusF,350,200);

	}

	public void paint(Graphics g)
	{
		pikachu.draw(g);
		arceus.draw(g);





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