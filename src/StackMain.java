package sett04;

public class StackMain 
{
	public static void main(String[] args)
	{
		Stack aStack = new Stack();
		
		// Legg in 10 først i stacken
		aStack.pushFirst(10);
		System.out.println("Legger i først i stacken");

		
		aStack.printdata();
			
		// Legg in 20 sist i stacken
		aStack.pushLast(20);
		System.out.println("Legger i siste i stacken");

		
		aStack.printdata();

		aStack.pushFirst(30);
		System.out.println("Legger i først i stacken");


		
		aStack.printdata();
		
		aStack.pushLast(40);
		System.out.println("Legger i siste i stacken");

		
		aStack.printdata();
		
		aStack.pushFirst(50);
		System.out.println("Legger i først i stacken");

		
		aStack.printdata();
		
		aStack.popFirst();
		System.out.println("Sletter første i stacken");

		aStack.printdata();
		
		aStack.popLast();
		System.out.println("Sletter Siste i stacken");
		aStack.printdata();

		
		
		
	}
}
