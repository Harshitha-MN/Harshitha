package program3;

public class statements {
	public static void num(int m)
	{
		int n=20;
		if(m>n)
		{
			System.out.println("m is greater than n");
		}
		else if(m<n)
		{
			System.out.println("m is less than n");
		}
		else
		{
			System.out.println("numbers are equal");
		}
	}
	public static void main(String[] args) {
		num(15);
		num(50);
		num(20);
		num(5);
	}

}
