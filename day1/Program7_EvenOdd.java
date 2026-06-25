package day1;

public class Program7_EvenOdd {
	
	public static void main(String[] args) {
		
		int num = 17;
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("ODD");
		}
		
//		int age = 18;
//		if(age==18)
//		{
//			System.out.println("Congrats your first vote");
//		}
//		if(age>18)
//		{
//			System.out.println("you can vote");
//		}
//		else
//		{
//			System.out.println("you cannot vote");
//		}
		
		int age = 18;
		if(age==18)
		{
			System.out.println("Congrats your first vote");
		}
		if(age<18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you cannot vote");
		}
	}

}
