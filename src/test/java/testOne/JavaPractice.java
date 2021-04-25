package testOne;

import org.testng.annotations.Test;

public class JavaPractice 
{
	@Test
	public void testWhile()
	{
		int i=11;
		while(i<10)
		{
			System.out.println("i is small" +i);
			i++;
		}
	}
	
	@Test
	public void testDoWhile()
	{
	
		int i=11;

	do
	{
		System.out.println("i is small" +i);
		i++;
	}
	while(i<10);
	
	}
	
	@Test
	public void testFor()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number " +i);
			}
			else
			{
				System.out.println("odd number" +i);
			}
		}
	}
	
	public void testArray()
	{
		/*int a[] = new int[5];
		a[0] = 10;
		a[1]=3;
		//=============================
		
		int b[] = {10,20,30};
		
		//=============================
		*/
		int arr[][] = new int [3][2];
		
		arr[0][0]= 10;
		arr[0][1]=11;
		arr[1][0]= 10;
		arr[1][1]=11;
		arr[2][0]= 10;
		arr[2][1]=11;
		
		for (int row=0; row<=2; row++)
		{
			for (int col=0;col<=1;col++)
			{
				System.out.println("2d array reesult " +arr[row][col]);
			}
		}
	}
}
