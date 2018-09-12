package Solution;

import java.lang.String;

public class TestCreature{
    private static int CREATURE_COUNT = 6;
    private static int THING_COUNT = 10;

    public static void main(String[] args){
        Thing[] things;
        Creature[] creatures = new Creature[CREATURE_COUNT];
        creatures[0]= new Ant("Bob");
        creatures[1]= new Fly("Max");
        creatures[2]= new Bat("Sue");
        creatures[3]= new Tiger("Carol");
        creatures[4]= new Ant("Jon");
        creatures[5]= new Fly("Kris");
        
        //creatures[1].eat(creatures[0]);
        
        things = new Thing[THING_COUNT];
        
        for(int i=0; i < THING_COUNT; i++)
        {
            things[i] = new Thing("thing");
            
        }
            
        for(int i=0; i < CREATURE_COUNT; i++)
        {
            things[i] = creatures[i];
            //System.out.println(things[i]);
        }
        
        System.out.println("THINGS:" );
        
        for(int i = 0; i < THING_COUNT; i ++)
        {
        		
        		System.out.println(things[i]+ " and I am a : "+things[i].getClass().getSimpleName());
        		System.out.println(" ");
        }
        System.out.println("Creatures: ");
        for(int i = 0; i < CREATURE_COUNT ; i++)
        {
        		if (things[i].getClass().getSimpleName().equals("Thing"))
        		{
        			break;
        		}
        		else 
        		{
        			System.out.println(things[i]+ " and I am a : "+things[i].getClass().getSimpleName());
            		System.out.println(" ");
        		}
        }
        Ant ant = new Ant("ant");
        System.out.println("What can you eat and how do you move?");
        for(int i = 0; i < CREATURE_COUNT ; i++)
        {
        		creatures[i].eat(things[6]);
        		creatures[i].eat(ant);
        		creatures[i].move();
        		System.out.println(" ");
        		
        }
        
        
       
      /*  for(int j = 0; j < THING_COUNT; j++){
            System.out.println(things[j].toString());
        } */
    }
}
