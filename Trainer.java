import java.util.ArrayList;

public class Trainer
{
	private ArrayList<Pokemon> team = new ArrayList<Pokemon>();
	private String name;
	private int playerNum;

	public Trainer(String n, int x)
	{
		this.name = n;
		this.playerNum = x;
	}

	public Trainer(Trainer next)
	{
		this.name = next.getName();
		this.playerNum = next.getPlayer();
	}

	public void addPokemon(Pokemon mo)
	{
		this.team.add(mo);
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

	public void replaceTeam(ArrayList<Pokemon> squad)
	{
		this.team = squad;
	}

	public int teamSize()
	{
		return team.size();
	}

	public String displayTeam()
	{
		String keks = "";

		for(int i=0; i < teamSize(); i++)
		{
			keks += this.getTeam().get(i).getName();
		}

		return keks;
	}


}
