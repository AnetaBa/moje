package Kolejnosc;

public class sortMal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int [] array = {9, 8, 1, 4, 6, 3};
		int tmp;
		
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length-1; j++)
			{
				if (array[j]<array[j+1])
				{
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		for (int i=0; i<array.length; i++)
		{
		System.out.print(array[i]);
		}
		
	}

}
