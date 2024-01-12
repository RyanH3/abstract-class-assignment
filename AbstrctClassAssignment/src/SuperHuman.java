
public abstract class SuperHuman 
{
	private String name;
	private String power;
	
	public SuperHuman(String name, String power)
	{
		setName(name);
		setPower(power);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPower() 
	{
		return power;
	}

	public void setPower(String power) 
	{
		this.power = power;
	}
	
	public abstract void usePower();
	
	public abstract void talk();
	
	public String toString()
	{
		String result = " " + name + ": " + "\n Power: " + power;
		return result;
	}
}
