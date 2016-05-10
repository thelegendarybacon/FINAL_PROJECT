import java.util.Scanner;


public class PokeBattle
{
	public static Scanner scan = new Scanner(System.in);

	public static Pokemon playerA, playerB;
	public static Trainer alec, david;

	public static ArrayList<Pokemon> choices;

	public static void main(String[] args)
	{
		choices.add(Pokemon("Pikachu",800));
		choices.add(Pokemon("Arceus",1000));
		choices.add(Pokemon("Blastoise",1200));
		choices.add(Pokemon("Charizard",1000));
		choices.add(Pokemon("Mewtwo",1500));
		choices.add(Pokemon("Shuckle",2000));
		choices.add(Pokemon("Venusaur",1750));
		choices.add(Pokemon("Magikarp",600));



		MoveList list = new MoveList();

		playerA = choices[0];
		playerB = choices[7];

		battle(playerA,playerB);

	}

	public static void battle(Pokemon pokeA, Pokemon pokeB)
	{
		while (pokeA.getHP() > 0 && pokeB.getHP() > 0)
		{
			displayStats();
			pokeA.attack(pokeB,moveSelect(pokeA));
			pokeB.attack(pokeA,moveSelect(pokeB));
		}
	}

	public static int moveSelect(Pokemon a)
	{
		boolean cont = true;

		for(int i=0; i < 4; i++)
			System.out.println((i+1) + ". " + a.getMoves()[i].getName());

		while(cont)
		{
			System.out.print("Pick a move:\t");
			int choice = scan.nextInt();

			if(a.

		System.out.println();

		return choice;

	}

	public static void displayStats()
	{
		System.out.println(playerA.getName() + ":  " + playerA.getHP() + "\t\t\t" + playerB.getName() + ":  " + playerB.getHP());
		System.out.println("     PP:  " + playerA.getPP() + "\t\t\t" + "      PP:  " + playerB.getPP() + "\n");
	}



}