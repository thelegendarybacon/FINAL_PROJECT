/*
Move

Class for an attack, stores data on the power and name of the attack
*/

public class Move
{
	private String attack, type;
	private int power, PP;

	public Move(String n, int a, String t, int x)
	{
		this.attack = n;
		this.power = a;
		this.type = t;
		this.PP = x;
	}

	public Move()
	{
		this.attack = "";
		this.power = 0;
		this.type = "Normal";
	}


	public int getDamage()
	{
		return power;
	}

	public String getName()
	{
		return attack;
	}

	public String getType()
	{
		return type;
	}

	public int getPP()
	{
		return PP;
	}

}
