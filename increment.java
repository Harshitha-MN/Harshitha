package program2;

public class increment {
public static void main(String[] args) {
	int a=1;
	int b=2;
	int res=(++b + a)+10;
	int res1=(++a +b)+30;
	int res2=(a++ + b++);
	int res3=(a++ + ++b)+a;
	System.out.println(res1);
	System.out.println(res);
	System.out.println(b);
	System.out.println(res2);
	System.out.println(res3);
}
}
