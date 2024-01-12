// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// XX Written by...: Ryan Williams                         XX
// XX Date Written.: July 7, 2021                          XX
// XX Purpose......: Practice abstract classes and methods XX
// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

public class TestClass 
{

	public static void main(String[] args) 
	{
		
		
		SuperHuman super1 = new SuperHero("Fire Man", "Fire Control", 2, true);
		SuperHuman super2 = new SuperHero("The Fool", "Memes", 116, false);
		SuperHuman super3 = new SuperVillain("Poison Man", "Poison Blast", 15, true);
		SuperHuman super4 = new SuperVillain("Rude Man", "Disrespect", 2, false);
		
		SuperHuman [] supers = {super1, super2, super3, super4};
		
		useSuperHumans(supers);
	}
	
	public static void useSuperHumans(SuperHuman [] supers)
	{
		for(int i = 0; i < supers.length; i++)
		{
			System.out.println(supers[i]);
			System.out.println();
			supers[i].usePower();
			System.out.println();
			supers[i].talk();
			System.out.println();
		}
	}
}
