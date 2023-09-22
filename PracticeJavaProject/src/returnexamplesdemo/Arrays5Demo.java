package returnexamplesdemo;

public class Arrays5Demo {
	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=200;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
		}
		System.out.println("count of numbers in between 100 to 200 which are divisible by 6 is:");
		
		int a[]=new int[count];
		int k=0;
		for(int j=100;j<=200;j++)
		{
			if(j%6==0)
			{
				a[k]=j;
				k++;
			}
		}
		
		for(int z=0;z<a.length;z++)
		{
			System.out.println(a[z]);
		}
	}

}
