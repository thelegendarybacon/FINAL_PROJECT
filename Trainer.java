import java.util.ArrayList;

public class Trainer
{
	public ArrayList<Pokemon> team = new ArrayList<Pokemon>();
	public String name;
	public int playerNum;

	public Trainer(String n, int x)
	{
		this.name = n;
		this.playerNum = x;
	}

	public void addPokemon(Pokemon mo)
	{
		team.add(mo);
	}

	public String getName()
	{
		return name;
	}

	public int getPlayer()
	{
		return playerNum;
	}

	public ArrayList<Pokemon> getTeam()
	{
		return team;
	}


}
