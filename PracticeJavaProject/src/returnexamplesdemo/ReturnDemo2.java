package returnexamplesdemo;
class calculation2
{
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("Addition result is :"+res);
	}
	
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("Multiplication result is :"+res);
	}
}
public class ReturnDemo2 {

	public static void main(String[] args) {
		calculation2 o=new calculation2();
		o.addition(10, 20);
		o.multiplication(2, 4);
		
		calculation2 o1=new calculation2();
		o1.addition(3, 6);
		o1.multiplication(3, 4);
	}
}
