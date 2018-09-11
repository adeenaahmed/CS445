package Solution;

import java.lang.String;

public class Fly extends Creature implements Flyer 
{
	public Fly(String name)
	{
		super(name);
	}
	public void eat(Thing aThing)
	{
		if (aThing.getClass().getSimpleName().equals("Ant")||aThing.getClass().getSimpleName().equals("Fly")||aThing.getClass().getSimpleName().equals("Bat")||aThing.getClass().getSimpleName().equals("Tiger"))
		{
			System.out.println(super.getName()+" is a Fly so it won't eat "+aThing);
		}
		else
		{
			super.eat(aThing);
		}
	}
	public void fly()
	{
		System.out.println(super.getName()+" is a Fly that is buzzing around in flight");
	}
	public void move()
	{
		this.fly();
	}
}