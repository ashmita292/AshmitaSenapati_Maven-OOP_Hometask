package abstraction;

public class Scooter extends Vehicle {
	 void start()
	    {
	    	System.out.println("Starts with kick");
	    }

	public static void main(String[] args)
	{
		Car c= new Car();
		c.start();
		
		Scooter s=new Scooter();
		s.start();
	}
}
