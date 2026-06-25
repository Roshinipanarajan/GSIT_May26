package day1;

public class Program8_Ifelse {
	
	public static void main(String[] args) {
		
		int num = 15;
		if(num==0)
		{
			System.out.println("Zero number");
		}
		else if(num%2==0)
		{
			System.out.println("Even number");
		}
		
		else if(num%5==0)
		{
			System.out.println("Multiple by 5");
		}
		else
		{
			System.out.println("could not guess");
		}
	}

}
