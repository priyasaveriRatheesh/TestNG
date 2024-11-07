package testscript;

import org.testng.annotations.Test;

public class Testclass {
	@Test(priority=1)
	public void sampel()
	{
		System.out.println("test1");
	}
	@Test(priority=2)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=3)
public void test3()
{
		System.out.println("test3");
}

}