import java.util.Scanner;
import java.util.ArrayList;

public class PokeBattle
{
	public static Scanner scan = new Scanner(System.in);

	public static Pokemon pokeA = new Pokemon();
	public static Pokemon pokeB = new Pokemon();

	public static MoveList list = new MoveList();

	public static int turn;

	public static ArrayList<Pokemon> choices = new ArrayList<Pokemon>();

	public static void main(String[] args)
	{
		Trainer alec = new Trainer("Alec",1);
		Trainer david = new Trainer("David",2);

		choices.add(new Pokemon("Pikachu",700));
		choices.add(new Pokemon("Arceus",700));
		choices.add(new Pokemon("Blastoise",1200));
		choices.add(new Pokemon("Charizard",500));
		choices.add(new Pokemon("Mewtwo",1000));
		choices.add(new Pokemon("Shuckle",1500));
		choices.add(new Pokemon("Venusaur",1200));
		choices.add(new Pokemon("Magikarp",600));

		//playerA = choices.get(0);
		//playerB = choices.get(7);
/*
		alec.addPokemon(choices.get(5));
		alec.addPokemon(choices.get(4));
		alec.addPokemon(choices.get(2));
		david.addPokemon(choices.get(1));
		david.addPokemon(choices.get(3));
		david.addPokemon(choices.get(0));
*/

		//battle(alec.getTeam().get(0),david.getTeam().get(0));

		teamSelect(alec);
		teamSelect(david);

		letsFight(alec,david);

	}

	public static void teamSelect(Trainer gary)
	{
		int pick = 0;

		System.out.println("Player " + gary.getPlayer() + ", choose your pokemon:");

		for(int i=0; i < choices.size(); i++)
		{
			System.out.println((i+1) + ". " + choices.get(i).getName());
		}

		System.out.print("\nSelection 1: ");
		pick = scan.nextInt();
		gary.addPokemon(new Pokemon(choices.get(pick-1)));

		System.out.print("\nSelection 2: ");
		pick = scan.nextInt();
		gary.addPokemon(new Pokemon(choices.get(pick-1)));

		System.out.print("\nSelection 3: ");
		pick = scan.nextInt();
		gary.addPokemon(new Pokemon(choices.get(pick-1)));

		System.out.println("\n");
	}


	public static void battle(Pokemon pokeA, Pokemon pokeB)
	{
		while (pokeA.getHP() > 0 && pokeB.getHP() > 0)
		{
			displayStats(pokeA, pokeB);
			turn = 1;
			pokeA.attack(pokeB,moveSelect(pokeA));
			turn = 2;
			if(checkFaint(pokeB) == false)
				pokeB.attack(pokeA,moveSelect(pokeB));
			else
				System.out.println(pokeB.getName() + " fainted!\n");
			if(checkFaint(pokeA))
				System.out.println(pokeA.getName() + " fainted!\n");
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

	public static void letsFight(Trainer student, Trainer hayes)
	{
		int stuTeam = student.teamSize()-1;
		int hayesTeam = hayes.teamSize()-1;

		int currentPokeS = 0;
		int currentPokeH = 0;

		while(stuTeam > 0 && hayesTeam > 0)
		{
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

			battle(student.getTeam().get(currentPokeS),hayes.getTeam().get(currentPokeH));
		}

		if(stuTeam > hayesTeam)
			System.out.println("Player " + student.getPlayer() + " Wins!");
		else if(hayesTeam > stuTeam)
			System.out.println("Player " + student.getPlayer() + " Wins!");
	}


	public static int moveSelect(Pokemon a)
	{
		int choice = 0;
		boolean cont = true;

		if(a.getPP() <= 0)
				a.struggle();

		for(int i=0; i < a.getMoves().size(); i++)
			System.out.println((i+1) + ". " + a.getMoves().get(i).getName());

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

	public static void displayStats(Pokemon pokeA, Pokemon pokeB)
	{
		System.out.println(pokeA.getName() + ":  " + pokeA.getHP() + "\t\t\t" + pokeB.getName() + ":  " + pokeB.getHP());
		System.out.println("     PP:  " + pokeA.getPP() + "\t\t\t" + "   PP:  " + pokeB.getPP() + "\n");

		//System.out.println("Type: " + pokeA.getType() + "\t\t\tType: " + pokeB.getType());
	}



}