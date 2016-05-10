/*
Pokemon Class

Stores used to make a pokemon object storing the specific pokemon's data
*/

public class Pokemon
{
	public MoveList list = new MoveList();

	private String name, type;
	private Move move1, move2, move3, move4;
	private int hp, PP;
	private Move[] moves;

	public Pokemon(String who, int health)
	{
		this.name = who;
		this.hp = health;
		this.PP = 100;

		if(name.equals("Pikachu"))
		{
			this.moves = list.pikachuMoves();
			this.type = "Electric";
		}

		else if(name.equals("Arceus"))
		{
			this.moves = list.arceusMoves();
			this.type = "Normal";
		}

		else if(name.equals("Blastoise"))
		{
			this.moves = list.blastoiseMoves();
			this.type = "Water";
		}

		else if(name.equals("Charizard"))
		{
			this.moves = list.charizardMoves();
			this.type = "Fire";
		}

		else if(name.equals("Magikarp"))
		{
			this.moves = list.magikarpMoves();
			this.type = "Water";
		}

		else if(name.equals("Mewtwo"))
		{
			this.moves = list.mewtwoMoves();
			this.type = "Normal";
		}

		else if(name.equals("Shuckle"))
		{
			this.moves = list.shuckleMoves();
			this.type = "Normal";
		}

		else if(name.equals("Venusaur"))
		{
			this.moves = list.venusaurMoves();
			this.type = "Grass";
		}


	}

	public int getHP()
	{
		return hp;
	}

	public int getPP()
	{
		return PP;
	}

	public void takeDMG(int dmg)
	{
		this.hp = hp - dmg;
	}

	public void reducePP(int reduce)
	{
		this.PP = PP - reduce;
	}

	public String getName()
	{
		return name;
	}

	public Move[] getMoves()
	{
		return moves;
	}

	public String getType()
	{
		return type;
	}

	public int effect(Move atk, Pokemon poke)
	{
		String a = atk.getType();
		String p = poke.getType();
		String aName = atk.getName();
		String pName = poke.getName();

		if(a.equals("Fire") && p.equals("Grass"))
		{
			System.out.println("It's Super Effective!");
			return 2;
		}
		else if((a.equals("Electric") || a.equals("Grass")) && p.equals("Water"))
		{
			System.out.println("It's Super Effective!");
			return 2;
		}
		else if(a.equals("Water") && p.equals("Fire"))
		{
			System.out.println("It's Super Effective!");
			return 2;
		}
		else if(aName.equals("Rock Slide") && (pName.equals("Charizard") || pName.equals("Charizard Mega")))
		{
			System.out.println("It's Super Effective!");
			return 99999;
		}
		else
			return 1;
	}

	public void attack(Pokemon poke, int move)
	{
		move = move - 1;
		Move[] a = moves;

		if(a[move].getName().equals("Synthesis"))
			this.takeDMG(-250);
		else if((a[move].getName().equals("Evolve")) || (a[move].getName().equals("MegaEvolve")))
		{
			System.out.print(this.getName() + " evolved into ");
			this.evolve();
			System.out.println(this.getName() + "!");
		}
		else
		{
			int dmg = a[move].getDamage() * effect(a[move],poke);
			poke.takeDMG(dmg);

			System.out.println(this.getName() + " attacks " + poke.getName() + " for " + dmg + "\n");
		}

		this.reducePP(a[move].getPP());


	}




	public void evolve()
	{
		if(this.getName().equals("Charizard"))
		{
			this.name = name + " Mega";
			this.moves = list.charizardMMoves();
			this.takeDMG(-1000);
		}

		else if(this.getName().equals("Mewtwo"))
		{
			this.name = name + " Mega";
			this.moves = list.mewtwoMMoves();
			this.takeDMG(-1000);
		}

		else if(this.getName().equals("Magikarp"))
		{
			this.name = "Gyarados";
			this.moves = list.gyaradosMoves();
			this.takeDMG(-2000);
		}
	}


}