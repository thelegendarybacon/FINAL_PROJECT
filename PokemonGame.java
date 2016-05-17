//David Mo
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonGame extends JApplet implements MouseListener, MouseMotionListener
{
	static PokeBattle battle = new PokeBattle();

	static Scanner scan = new Scanner(System.in);

	static ArrayList<Trainer> trainers = battle.getTrainers();

	static Trainer student;
	static Trainer hayes;

	static ArrayList<Pokemon> choices = new ArrayList<Pokemon>();
	ArrayList<Pokemon> studentTeam;
	ArrayList<Pokemon> hayesTeam;

	paintSelectionScreen selection = new paintSelectionScreen();


	int x,y;
	int pokeChoose;
	static int turn = 1;
	static int currentPokeS, currentPokeH;
	boolean check;


	//sets images
	static ImageIcon arceusIconB = new ImageIcon("images\\arceus_back.png");
	static ImageIcon arceusIconF = new ImageIcon("images\\arcues_front.png");
	static ImageIcon charizardIconB = new ImageIcon("images\\charizard_back.png");
	static ImageIcon charizardIconF = new ImageIcon("images\\charizard_front.png");
	static ImageIcon blastoiseIconB = new ImageIcon("images\\blastoise_back.png");
	static ImageIcon blastoiseIconF = new ImageIcon("images\\blastoise_front.png");
	static ImageIcon gyaradosIconB = new ImageIcon("images\\gyarados_back.png");
	static ImageIcon gyaradosIconF = new ImageIcon("images\\gyarados_front.png");
	static ImageIcon magikarpIconB = new ImageIcon("images\\magikarp_back.png");
	static ImageIcon magikarpIconF = new ImageIcon("images\\magikarp_front.png");
	static ImageIcon mewtwoIconB = new ImageIcon("images\\mewtwo_back.png");
	static ImageIcon mewtwoIconF = new ImageIcon("images\\mewtwo_front.png");
	static ImageIcon pikachuIconB = new ImageIcon("images\\pikachu_back.png");
	static ImageIcon pikachuIconF = new ImageIcon("images\\pikachu_front.png");
	static ImageIcon shuckleIconB = new ImageIcon("images\\shuckle_back.png");
	static ImageIcon shuckleIconF = new ImageIcon("images\\shuckle_front.png");
	static ImageIcon venasaurIconB = new ImageIcon("images\\venasaur_back.png");
	static ImageIcon venasaurIconF = new ImageIcon("images\\venasaur_front.png");
	static ImageIcon mewtwoMIconB = new ImageIcon("images\\mewtwo_mega_back.png");
	static ImageIcon mewtwoMIconF = new ImageIcon("images\\mewtwo_mega_front.png");
	static ImageIcon charizardMIconB = new ImageIcon("images\\charizard_mega_back.png");
	static ImageIcon charizardMIconF = new ImageIcon("images\\charizard_mega_front.png");
	static ImageIcon profOakIcon = new ImageIcon("images\\prof_oak.png");
	static ImageIcon ballIcon = new ImageIcon("imgaes\\pokeball.png");

	//initialize images for all pokemon
	static Image arceusB = arceusIconB.getImage();
	static Image arceusF = arceusIconF.getImage();
	static Image charizardB = charizardIconB.getImage();
	static Image charizardF = charizardIconF.getImage();
	static Image blastoiseB = blastoiseIconB.getImage();
	static Image blastoiseF = blastoiseIconF.getImage();
	static Image gyaradosB = gyaradosIconB.getImage();
	static Image gyaradosF = gyaradosIconF.getImage();
	static Image magikarpB = magikarpIconB.getImage();
	static Image magikarpF = magikarpIconF.getImage();
	static Image mewtwoB = mewtwoIconB.getImage();
	static Image mewtwoF = mewtwoIconF.getImage();
	static Image pikachuB = pikachuIconB.getImage();
	static Image pikachuF = pikachuIconF.getImage();
	static Image shuckleB = shuckleIconB.getImage();
	static Image shuckleF = shuckleIconF.getImage();
	Image venasaurF = venasaurIconB.getImage();
	Image venasaurB = venasaurIconF.getImage();
	static Image charizardMB = charizardMIconB.getImage();
	static Image charizardMF = charizardMIconF.getImage();
	static Image mewtwoMB = mewtwoMIconB.getImage();
	static Image mewtwoMF = mewtwoMIconF.getImage();
	Image profOak = profOakIcon.getImage();
	Image pokeball = ballIcon.getImage();


	JLabel startLabel = new JLabel("Start!");

	static ImageIcon background = new ImageIcon("images\\pokemonBattle.png");
	static Image img2 = background.getImage();

	paintPokemon studentA;
	paintPokemon studentB;
	paintPokemon studentC;

	paintPokemon hayesA;
	paintPokemon hayesB;
	paintPokemon hayesC;
/*
	student.addPokemon(new Pokemon(choices.get(1)));
	student.addPokemon(new Pokemon(choices.get(3)));
	student.addPokemon(new Pokemon(choices.get(4)));
*/


/*
	hayes.addPokemon(new Pokemon(choices.get(5)));
	hayes.addPokemon(new Pokemon(choices.get(0)));
	hayes.addPokemon(new Pokemon(choices.get(2)));
*/




	public void init()
	{
		this.setSize(800,600);
		//setBackground(Color.blue);
		addMouseMotionListener( this );

	}

	public void paint(Graphics g)
	{
		//selectPokemon();
		//selection.draw(g);


		g.drawImage(img2,0,0,null);

		addpokes();
		letsFight(student,hayes,g);

	}


	public static void addpokes()
	{
/*
		choices.add(new Pokemon("Pikachu",700));
		//choices.add(new Pokemon("Arceus",700));
		choices.add(new Pokemon("Blastoise",1200));
		choices.add(new Pokemon("Charizard",500));
		choices.add(new Pokemon("Mewtwo",1000));
		choices.add(new Pokemon("Shuckle",1500));
		//choices.add(new Pokemon("Venusaur",1200));
		choices.add(new Pokemon("Magikarp",600));
*/

		student = new Trainer("Player 1",1);
		hayes = new Trainer("Player 2",2);

		Pokemon pika = new Pokemon("Pikachu",700);
		//choices.add(new Pokemon("Arceus",700));
		Pokemon blast = new Pokemon("Blastoise",1200);
		Pokemon charz = new Pokemon("Charizard",500);
		Pokemon mew = new Pokemon("Mewtwo",1000);
		Pokemon shuck = new Pokemon("Shuckle",1500);
		//choices.add(new Pokemon("Venusaur",1200));
		Pokemon magi = new Pokemon("Magikarp",600);

		//new PokemonGame();
		teamSelect(student,blast);
		teamSelect(student,mew);
		teamSelect(student,shuck);

		teamSelect(hayes,magi);
		teamSelect(hayes,pika);
		teamSelect(hayes,charz);
	}


	public static void battle(Pokemon pokeA, Pokemon pokeB, Graphics g)
	{
		paintHpBar barA = pokeA.getBar();
		paintHpBar barB = pokeB.getBar();

		while (pokeA.getHP() > 0 && pokeB.getHP() > 0)
		{
			displayStats(pokeA, pokeB);
			turn = 1;
			barA.changeHP(pokeA);
			g.drawImage(img2,0,0,null);
			drawPokemon(g);
			pokeA.attack(pokeB,moveSelect(pokeA));
			turn = 2;
			if(checkFaint(pokeB) == false)
			{
				pokeB.attack(pokeA,moveSelect(pokeB));
				barB.changeHP(pokeB);
			}
			else
				System.out.println(pokeB.getName() + " fainted!\n");
			if(checkFaint(pokeA))
				System.out.println(pokeA.getName() + " fainted!\n");
			g.drawImage(img2,0,0,null);
			drawPokemon(g);
		}

	}

	public static boolean checkFaint(Pokemon check)
	{
		if(check.getHP() <= 0)
		{
			//System.out.println(check.getName() + " fainted!\n");
			return true;
		}
		else
			return false;
	}

	public static Pokemon getCurrentPoke(Trainer x)
	{
		if(x.getPlayer() == 1)
			return student.getTeam().get(currentPokeS);
		else if(x.getPlayer() == 2)
			return hayes.getTeam().get(currentPokeH);
		return new Pokemon();
	}

	public static void letsFight(Trainer student, Trainer hayes, Graphics g)
	{
		int stuTeam = student.teamSize()-1;
		int hayesTeam = hayes.teamSize()-1;

		currentPokeS = 0;
		currentPokeH = 0;

		g.setFont(new Font("TimesRoman",Font.PLAIN,25));

		while(stuTeam > 0 && hayesTeam > 0)
		{
			g.drawImage(img2,0,0,null);

			if(checkFaint(student.getTeam().get(currentPokeS)))
			{
				stuTeam -= 1;
				currentPokeS += 1;
			}

			else if(checkFaint(hayes.getTeam().get(currentPokeH)))
			{
				hayesTeam -= 1;
				currentPokeH += 1;
			}

			drawPokemon(g);

			battle(student.getTeam().get(currentPokeS),hayes.getTeam().get(currentPokeH), g);
		}

		if(stuTeam > hayesTeam)
			System.out.println("Player " + student.getPlayer() + " Wins!");
		else if(hayesTeam > stuTeam)
			System.out.println("Player " + student.getPlayer() + " Wins!");
	}

	public static void drawPokemon(Graphics g)
	{
		if(getCurrentPoke(student).getName().equals("Blastoise"))
			g.drawImage(blastoiseB,178,350,null);
		else if(getCurrentPoke(student).getName().equals("Mewtwo"))
			g.drawImage(mewtwoB,178,350,null);
		else if(getCurrentPoke(student).getName().equals("Shuckle"))
			g.drawImage(shuckleB,178,350,null);
		else if(getCurrentPoke(student).getName().equals("Mewtwo Mega"))
			g.drawImage(mewtwoMB,178,350,null);

		g.setColor(Color.black);
		g.drawString(getCurrentPoke(student).getName(),480,343);
		getCurrentPoke(student).getBar().draw(g,616,365);

		if(getCurrentPoke(hayes).getName().equals("Pikachu"))
			g.drawImage(pikachuF,548,183,null);
		else if(getCurrentPoke(hayes).getName().equals("Charizard"))
			g.drawImage(charizardF,548,183,null);
		else if(getCurrentPoke(hayes).getName().equals("Charizard Mega"))
			g.drawImage(charizardMF,548,183,null);
		else if(getCurrentPoke(hayes).getName().equals("Magikarp"))
			g.drawImage(magikarpF,548,183,null);
		else if(getCurrentPoke(hayes).getName().equals("Gyarados"))
			g.drawImage(gyaradosF,548,183,null);

		g.setColor(Color.black);
		g.drawString(getCurrentPoke(hayes).getName(),22,101);
		getCurrentPoke(hayes).getBar().draw(g,154,126);
		}


public static int moveSelect(Pokemon a)
	{
		int choice = 0;
		boolean cont = true;

		if(a.getPP() <= 0)
				a.struggle();

		for(int i=0; i < a.getMoves().size(); i++)
			System.out.println((i+1) + ". " + a.getMoves().get(i).getName() + "\t\t(" + a.getMoves().get(i).getPP() + " PP)");

		while(cont)
		{
			System.out.print("\nPlayer " + turn + ", pick a move:\t");
			choice = scan.nextInt();

			if(a.getMoves().get(choice-1).getPP() <= a.getPP())
				cont = false;
			else
				System.out.println("Not enough PP");
		}

		System.out.println();

		return choice;

	}

	public static void teamSelect(Trainer ash, int selection)
	{
		ash.addPokemon(new Pokemon(choices.get(selection)));
	}

	public static void teamSelect(Trainer hayes, Pokemon a)
	{
		hayes.addPokemon(new Pokemon(a));
	}




	public static void displayStats(Pokemon pokeA, Pokemon pokeB)
	{
		System.out.println(pokeA.getName() + ":  " + pokeA.getHP() + "\t\t\t" + pokeB.getName() + ":  " + pokeB.getHP());
		System.out.println("     PP:  " + pokeA.getPP() + "\t\t\t" + "   PP:  " + pokeB.getPP() + "\n");

		//System.out.println("Type: " + pokeA.getType() + "\t\t\tType: " + pokeB.getType());
	}










/*
	public void selectPokemon()
	{
		int choosePokes = 6;

		if(hasClicked && (X
*/
	public void selectPokemon()
	{
		check = true;
		pokeChoose = 0;
	}


	public void mouseDragged(MouseEvent e){};

	public void mouseClicked(MouseEvent e)
	{
		/*
		if(pokeChoose >= 6)
			check = false;
		else if(check)
		{
			if((x >= 40 && x <= 120) && (y >= 205 && y <= 295))
			{
				if(pokeChoose < 3)
					student.addPokemon(choices.get(2));
				else
					hayes.addPokemon(choices.get(2));
			}
			else if((x >= 45 && x <= 120) && (y >= 315 && y <= 380))
			{
				if(pokeChoose < 3)
					student.addPokemon(choices.get(1));
				else
					hayes.addPokemon(choices.get(1));
			}
			else if((x >= 65 && x <= 110) && (y >= 420 && y <= 475))
			{
				if(pokeChoose < 3)
					student.addPokemon(choices.get(0));
				else
					hayes.addPokemon(choices.get(0));
			}
			else if((x >= 700 && x <= 755) && (y >= 215 && y <= 275))
			{
				if(pokeChoose < 3)
					student.addPokemon(choices.get(5));
				else
					hayes.addPokemon(choices.get(5));
			}
			else if((x >= 695 && x <= 770) && (y >= 315 && y <= 385))
			{
				if(pokeChoose < 3)
					student.addPokemon(choices.get(3));
				else
					hayes.addPokemon(choices.get(3));
			}
			else if((x >= 705 && x <= 755) && (y >= 420 && y <= 475))
			{
				if(pokeChoose < 3)
					student.addPokemon(choices.get(4));
				else
					hayes.addPokemon(choices.get(4));
			}

			pokeChoose += 1;
		}*/


};
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