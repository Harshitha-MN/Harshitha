package program2;

public class simpleinterest {
	public static void main(String[] args) {
		//double
		double a,b,c; 
		a=3.643;b=88.746;c=12.76;
		double res = a*b*c/100;
		System.out.println("res="+res);
		
		//float
		float p=5.5f;
		float q=5f;
		float res1 = p+q;
		System.out.println("p="+p);
		System.out.println("q="+q);
		System.out.println(res1);
		
		//long
		long num = -176542252626l;
    	System.out.println(num);
		
    	//boolean
    	if(a!=b)
    	{
    		System.out.println(true);
    	}
    	else
    	{
    		System.out.println("false");
    	}
    	
    	//short
        short d;
    	d = 150;
    	System.out.println(d);
    	
    	//char
    	
    	char ch = 'h';
    	System.out.println(ch);
	}

}
