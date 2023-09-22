package returnexamplesdemo;

class calculation1
{
	void addition()
	{
		int x,y,res;
		x=10;
		y=20;
		res=(x+y);
		System.out.println("Addition result is :"+res);
	}
	void multiplication()
	{
		int x,y,res;
		x=10;
		y=20;
		res=(x*y);
		System.out.println("Addition result is :"+res);
	}
}

public class ReturnDemo1 {

	public static void main(String[] args) {
		calculation1 o=new calculation1();
		o.addition();
		o.multiplication();
		
		calculation1 o1=new calculation1();
		o1.addition();
		o1.multiplication();

	}

}
