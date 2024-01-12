
public class SuperVillain extends SuperHuman
{
	private int danger; // how many unarmed men it takes to defeat them
	private boolean free;
	
	public SuperVillain(String name, String power, int danger, boolean free)
	{
		super(name, power);
		setDanger(danger);
		setFree(free);
	}

	public int getDanger() 
	{
		return danger;
	}

	public void setDanger(int danger) 
	{
		if(danger < 1)
		{
			System.out.println("Invalid danger. Danger must be greater than 0.");
			System.exit(1);
		}
		else
		{
			this.danger = danger;
		}
	}

	public boolean isFree() 
	{
		return free;
	}

	public void setFree(boolean free) 
	{
		this.free = free;
	}
	
	public void usePower()
	{
		System.out.println(super.getName() + " uses their power, " + super.getPower() + "!");
		System.out.println("Massive damage was done to the environment.");
	}
	
	public void talk()
	{
		System.out.println(super.getName() + " says, \"You cannot begin to comprehend your own foolishness!\"");;
	}
	
	public String toString()
	{
		String result = super.toString() + "\n Danger Level: " + danger + "\n " + (free ? super.getName() + " is free from prison." : super.getName() + " is currently in prison.");
		return result;
	}
}
