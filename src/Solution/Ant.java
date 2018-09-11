package Solution;

import java.lang.String;

public class Ant extends Creature 
{
	public Ant(String name)
	{
		super(name);
	}
	public void move()
	{
		System.out.println(super.getName()+" the Ant is crawling around ");
	}
	
	
}


