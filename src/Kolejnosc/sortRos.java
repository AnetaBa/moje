package Kolejnosc;

public class sortRos 
{
	public static void main(String[] args) 
	{	
		System.out.println("Sortowanie b¹belkowe ROSN¥CE dla liczb:");
		int [] array = {9, 2, 1, 8, 3};
		int tmp;
			
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length-1; j++)
				{
					if (array[j]>array[j+1])
					{
						tmp = array [j];
						array [j] = array [j+1];
						array [j+1] = tmp;
					}
				}
		}
		
		for (int i=0; i<array.length; i++)
		{
		System.out.print(array[i]);
		}

	}
}
	
		      
		      
		
