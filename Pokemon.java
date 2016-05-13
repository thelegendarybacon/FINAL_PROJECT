/*
Pokemon Class

Stores used to make a pokemon object storing the specific pokemon's data
*/

import java.util.ArrayList;

public class Pokemon
{
	public MoveList atks = new MoveList();

	private String name, type;
	private Move move1, move2, move3, move4;
	private int hp, PP;
	private ArrayList<Move> moves;

	public Pokemon()
	{
		this.name = "";
		this.hp = 0;
		this.PP = 0;
	}

	public Pokemon(Pokemon inherit)
	{
		this.name = inherit.getName();
		this.hp = inherit.getHP();
		this.PP = inherit.getPP();
		this.moves = inherit.getMoves();
	}


	public Pokemon(String who, int health)
	{
		this.name = who;
		this.hp = health;
		this.PP = 100;

		if(name.equals("Pikachu"))
		{
			/*
			for(int i = 0; i< 4; i++)
			{
				this.moves.add(atks.pikachuMoves().get(i));
			}
			*/


			this.moves = atks.pikachuMoves();
			this.type = "Electric";
		}

		else if(name.equals("Arceus"))
		{
			this.moves = atks.arceusMoves();
			this.type = "Normal";
		}

		else if(name.equals("Blastoise"))
		{
			this.moves = atks.blastoiseMoves();
			this.type = "Water";
		}

		else if(name.equals("Charizard"))
		{
			this.moves = atks.charizardMoves();
			this.type = "Fire";
		}

		else if(name.equals("Magikarp"))
		{
			this.moves = atks.magikarpMoves();
			this.type = "Water";
		}

		else if(name.equals("Mewtwo"))
		{
			this.moves = atks.mewtwoMoves();
			this.type = "Normal";
		}

		else if(name.equals("Shuckle"))
		{
			this.moves = atks.shuckleMoves();
			this.type = "Normal";
		}

		else if(name.equals("Venusaur"))
		{
			this.moves = atks.venusaurMoves();
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

	public ArrayList<Move> getMoves()
	{
		return moves;
	}

	public void struggle()
	{
		this.atks.addStruggle();
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
		ArrayList<Move> a = moves;

		if(a.get(move).getName().equals("Synthesis"))
			this.takeDMG(-250);
		else if((a.get(move).getName().equals("Evolve")) || (a.get(move).getName().equals("MegaEvolve")))
		{
			System.out.print(this.getName() + " evolved into ");
			this.evolve();
			System.out.println(this.getName() + "!\n");
		}
		else
		{
			int dmg = a.get(move).getDamage() * effect(a.get(move),poke);
			poke.takeDMG(dmg);

			System.out.println(this.getName() + " attacks " + poke.getName() + " for " + dmg + "\n");
		}

		this.reducePP(a.get(move).getPP());


	}




	public void evolve()
	{
		if(this.getName().equals("Charizard"))
		{
			this.name = name + " Mega";
			this.moves = atks.charizardMMoves();
			this.takeDMG(-1000);
		}

		else if(this.getName().equals("Mewtwo"))
		{
			this.name = name + " Mega";
			this.moves = atks.mewtwoMMoves();
			this.takeDMG(-1000);
		}

		else if(this.getName().equals("Magikarp"))
		{
			this.name = "Gyarados";
			this.moves = atks.gyaradosMoves();
			this.takeDMG(-2000);
		}
	}


}