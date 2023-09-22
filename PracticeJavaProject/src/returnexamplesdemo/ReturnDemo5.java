package returnexamplesdemo;
//program for addition of two matrix using void and return aproach
class Demo10
{
	void matrixaddition1(int x[][],int y[][])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				int res=x[i][j]+y[i][j];
				System.out.print(res+" ");
			}
			System.out.println();
		}
	}
	
	int [][] matrixaddition2(int x[][],int y[][])
	{
		int z[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
}
public class ReturnDemo5 {
	public static void main(String[] args) {
		Demo10 o=new Demo10();
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{2,4,6},{3,5,9}};
		o.matrixaddition1(a, b);
		System.out.println("------------------------------------");
		int m[][]= {{1,2,3},{4,5,6}};
		int n[][]= {{2,4,6},{3,5,9}};
		int r[][]= o.matrixaddition2(m, n);

		for(int i=0;i<r.length;i++)
		{
			for(int j=0;j<r[i].length;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}

}
