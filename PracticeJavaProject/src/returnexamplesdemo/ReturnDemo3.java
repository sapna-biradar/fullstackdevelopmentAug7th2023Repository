package returnexamplesdemo;
class Demo1
{
	String getName()
	{
		String name="sapna biradar";
		return name;
	}
}

public class ReturnDemo3 {

	public static void main(String[] args) {
		Demo1 o=new Demo1();
		String v1=o.getName();
		System.out.println(v1);
	}

}
