package returnexamplesdemo;
//verify the given number is prime number or not
class Demo4
{
	void isprime1(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
	}
	
	boolean isprime2(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
				break;
			}
		}
		if(flag==0)
			return true;
		else
			return false;
	}
}
public class ReturnDemo4 {

	public static void main(String[] args) {
		Demo4 o1=new Demo4();	
		o1.isprime1(47);
		boolean v1=o1.isprime2(46);
		System.out.println(v1);
		
		//display the prime numbers in between 1 to50
		for(int i=1;i<=50;i++)
		{
			if(o1.isprime2(i)==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//display prime numbers from 100to 50 in reverse
		for(int i=100;i>=50;i--)
		{
			if(o1.isprime2(i)==true)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//find the sum of all prime numbers in between 1 to 100
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(o1.isprime2(i)==true)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of all given prime numbers :"+sum);
		
		//find count of prime numbers in between 1 to 200
		int count=0;
		for(int i=1;i<=200;i++)
		{
			if(o1.isprime2(i)==true)
			{
				count=count+1;
				count++;
			}
		}
		System.out.println("the count of prime numbers from 100 to 200 is :"+count);
	}
}


















