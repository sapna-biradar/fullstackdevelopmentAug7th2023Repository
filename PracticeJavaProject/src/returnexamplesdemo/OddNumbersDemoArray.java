package returnexamplesdemo;

public class OddNumbersDemoArray {

	public static void main(String[] args) {
		int count=0;
		for(int i=11;i<=31;i++)
		{
			if(i%2==1)
			{
				count=count+1;
			}
		}
		System.out.println("count of odd numbers from 11 to 31 is:"+count);
		int x[]=new int[count];
		int k=0;
		for(int j=11;j<=31;j++)
		{
			if(j%2==1)
			{
			x[k]=j;
			k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}
	}

}
