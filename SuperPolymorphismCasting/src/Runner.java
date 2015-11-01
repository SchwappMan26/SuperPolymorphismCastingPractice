
public class Runner
	{

		public static void main(String[] args)
			{
			Parent p = new Parent();
			Parent p = new Child();
			Child c = new Parent();
			Child c = new Child();

			p.displayParentA();
			p.displayParentB();
			p.displayChildA();

			c.displayParentA();
			c.displayParentB();
			c.displayChildA();
			
			System.out.println("The num is " + num);
			
			
	
			}

	}
