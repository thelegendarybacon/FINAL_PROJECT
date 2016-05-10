/*
MoveList

sets up all the moves for the apropiate pokemon
*/

import java.util.ArrayList;

public class MoveList
{
	private ArrayList<Move> list;

/*
	private Move arceusA, arceusB, arceusC, arceusD;
	private Move blastoiseA, blastoiseB, blastoiseC, blastoiseD;
	private Move charizardA, charizardB, charizardC, charizardD;
	private Move charizardMA, charizardMB, charizardMC, charizardMD;
	private Move gyaradosA, gyaradosB, gyaradosC, gyaradosD;
	private Move magikarpA, magikarpB, magikarpC, magikarpD;
	private Move mewtwoA, mewtwoB, mewtwoC, mewtwoD;
	private Move mewtwoMA, mewtwoMB, mewtwoMC, mewtwoMD;
	private Move pikachuA, pikachuB, pikachuC, pikachuD;
	private Move shuckleA, shuckleB, shuckleC, shuckleD;
	private Move venusaurA, venusaurB, venusaurC, venusaurD;
*/

/*  Move pokemon = new Move("name", attack, "type", PP cost);*/

	Move arceusA = new Move("Judgement", 100, "Normal", 50);
	Move arceusB = new Move("Aerial Ace", 60, "Normal", 10);
	Move arceusC = new Move("Incinerate", 60, "Fire", 10);
	Move arceusD = new Move("Hyper Beam", 150, "Normal", 100);

	Move blastoiseA = new Move("Hydro Pump", 110, "Water", 55);
	Move blastoiseB = new Move("Water Gun", 40, "Water", 5);
	Move blastoiseC = new Move("Mega Punch", 80, "Normal", 30);
	Move blastoiseD = new Move("Flail", 0, "Normal", -25);

	Move charizardA = new Move("Fire Blast", 110, "Fire", 55);
	Move charizardB = new Move("Blast Burn", 150, "Fire", 100);
	Move charizardC = new Move("Aerial Ace", 60, "Normal", 10);
	Move charizardD = new Move("MegaEvolve", 0, "Normal", 45);

	Move charizardMA = new Move("Aerial Ace", 85, "Normal", 10);
	Move charizardMB = new Move("Blast Burn", 175, "Fire", 100);
	Move charizardMC = new Move("Charge", 0, "Normal", -200);
	Move charizardMD = new Move("#REKT", 200, "Fire", 150);

	Move gyaradosA = new Move("Hydro Pump", 150, "Water", 50);
	Move gyaradosB = new Move("Magikarp = WIN", 300, "Normal", 100);
	Move gyaradosC = new Move("Restore PP", 0, "Normal", -300);
	Move gyaradosD = new Move("Thunder Punch", 100, "Electric", 25);

	Move magikarpA = new Move("Tackle", 50, "Normal", 5);
	Move magikarpB = new Move("EXP Share", 0, "Normal", -100);
	Move magikarpC = new Move("Evolve", 0, "Normal", 300);
	Move magikarpD = new Move("Water Gun", 40, "Water" , 5);

	Move mewtwoA = new Move("Hurricane", 110, "Normal", 50);
	Move mewtwoB = new Move("Mega Kick", 120, "Normal", 60);
	Move mewtwoC = new Move("MegaEvolve", 0, "Normal", 40);
	Move mewtwoD = new Move("Thunderbolt", 90, "Electric", 40);

	Move mewtwoMA = new Move("Thunder", 120, "Electric", 60);
	Move mewtwoMB = new Move("Fire Blast", 120, "Fire", 60);
	Move mewtwoMC = new Move("Hydro Pump", 120, "Water", 60);
	Move mewtwoMD = new Move("AIDS", 0, "Normal", -500);

	Move pikachuA = new Move("Thunder" , 120, "Electric", 20);
	Move pikachuB = new Move("Thunderbolt", 90, "Electric", 10);
	Move pikachuC = new Move("Slam", 90, "Normal", 10);
	Move pikachuD = new Move("Surf", 90, "Water", 10);

	Move shuckleA = new Move("Body Slam", 85, "Normal", 5);
	Move shuckleB = new Move("Rock Slide", 75, "Normal", 5);
	Move shuckleC = new Move("Darude Sandstorm", 150, "Normal", 75);
	Move shuckleD = new Move("Don't F***le with shuckle", 250, "Normal", 100);

	Move venusaurA = new Move("Frenzy Plant", 150, "Grass", 50);
	Move venusaurB = new Move("Synthesis", 0, "Grass", 10);
	Move venusaurC = new Move("Photosynthesis", 0, "Grass", -500);
	Move venusaurD = new Move("Electron Crack Bomb", 500, "Grass", 500);



	public ArrayList<Move> arceusMoves()
	{
		list.add(arceusA);
		list.add(arceusB);
		list.add(arceusC);
		list.add(arceusD);
		return list;
	}

	public ArrayList<Move> blastoiseMoves()
	{
		list.add(blastoiseA);
		list.add(blastoiseB);
		list.add(blastoiseC);
		list.add(blastoiseD);
		return list;
	}

	public ArrayList<Move> charizardMoves()
	{
		list.add(charizardA);
		list.add(charizardB);
		list.add(charizardC);
		list.add(charizardD);
		return list;
	}

	public ArrayList<Move> charizardMMoves()
	{
		list.add(charizardMA);
		list.add(charizardMB);
		list.add(charizardMC);
		list.add(charizardMD);
		return list;
	}

	public ArrayList<Move> gyaradosMoves()
	{
		list.add(gyaradosA);
		list.add(gyaradosB);
		list.add(gyaradosC);
		lsit.add(gyaradosD);
		return list;
	}

	public ArrayList<Move> magikarpMoves()
	{
		list.add(magikarpA);
		list.add(magikarpB);
		list.add(magikarpC);
		list.add(magikarpD);
		return list;
	}

	public ArrayList<Move> mewtwoMoves()
	{
		list.add(mewtwoA);
		list.add(mewtwoB);
		list.add(mewtwoC);
		list.add(mewtwoD);
		return list;
	}

	public ArrayList<Move> mewtwoMMoves()
	{
		list.add(mewtwoMA);
		list.add(mewtwoMB);
		list.add(mewtwoMC);
		list.add(mewtwoMD);
		return list;
	}

	public ArrayList<Move> pikachuMoves()
	{
		list.add(pikachuA);
		list.add(pikachuB);
		list.add(pikachuC);
		list.add(pikachuD);
		return list;
	}

	public ArrayList<Move> shuckleMoves()
	{
		list.add(shuckleA);
		list.add(shuckleB);
		list.add(shuckleC);
		list.add(shuckleD);
		return list;
	}

	public ArrayList<Move> venusaurMoves()
	{
		list.add(venusaurA);
		list.add(venusaurB);
		list.add(venusaurC);
		list.add(venusaurD);
		return list;
	}


}