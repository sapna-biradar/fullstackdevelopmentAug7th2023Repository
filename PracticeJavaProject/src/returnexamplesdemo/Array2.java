package returnexamplesdemo;

public class Array2 {

	public static void main(String[] args) {
		String s[]= {"doing","are you","what","vandana","hari"};
		/*for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]);
		}
		*/
		int i=s.length-1;
		while(i>=0)
		{
			System.out.print(s[i]+" ");
			i--;
		}
		System.out.println();
	}

}
