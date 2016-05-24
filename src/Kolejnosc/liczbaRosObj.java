package Kolejnosc;


class sortowanie
{
	public void dane(int [] array, int n)
	{
		//int [] array = {1, 9, 5, 81, 19};	
		
		array[0] = 1;
		array[1] = 9;
		array[2] = 5;
		array[3] = 81;
		array[4] = 10;
	}
		
	public void sort(int [] array, int n)
	{
		
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
	}
			
	public void show(int [] array, int n)
	{
		for (int i=0; i<n; i++)
		{
			System.out.println(array[i]);
		}
	}
	
}

public class liczbaRosObj 
{
	public static void main (String[] args)
	{
		int n = 5;
		int [] array = new int [n];
		sortowanie pole = new sortowanie();
		pole.dane(array, n);
		pole.sort(array, n);
		pole.show(array, n);	
	}
	
}
