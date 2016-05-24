package Kolejnosc;

public class liczbaMax 
{
	public static void main(String[] args) 
	{
		int [] array = {1, 9, 4, 8};
		int max, min;
		
		max = array[0];
		min = array[0];
		for (int i=0; i<array.length; i++)
		{
			if(max < array [i])
			{
				max = array [i];
			}
			
			if(min > array[i])
			{
				min = array [i];
			}	
		}
	
		System.out.println("Najwieksza liczba to: " + max);
		System.out.println("Najmniejsza liczba to: " + min);
		
	}
}
