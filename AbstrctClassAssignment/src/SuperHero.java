
public class SuperHero extends SuperHuman
{
	private int rank;
	private boolean famous;
	
	public SuperHero(String name, String power, int rank, boolean famous)
	{
		super(name, power);
		setRank(rank);
		setFamous(famous);
	}

	public int getRank() 
	{
		return rank;
	}

	public void setRank(int rank) 
	{
		if(rank < 1)
		{
			System.out.println("Invalid rank. Rank must be greater than 0.");
			System.exit(1);
		}
		else
		{
			this.rank = rank;
		}
		
	}

	public boolean isFamous() 
	{
		return famous;
	}

	public void setFamous(boolean famous) 
	{
		this.famous = famous;
	}
	
	public void usePower()
	{
		System.out.println(super.getName() + " uses their power, " + super.getPower() + "!");
		System.out.println("Minimal damage was done to the environment.");
	}
	
	public void talk()
	{
		System.out.println(super.getName() + " says, \"When we work together, we will succeed!\"");;
	}
	
	public String toString()
	{
		String result = super.toString() + "\n Rank: " + rank + "\n " + (famous ? super.getName() + " is famous!" : super.getName() + " is not famous.");
		return result;
	}
}
