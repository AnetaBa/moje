package Kolejnosc;

public class sortAZ 
{
	public static void main(String[] args) 
	{
		char [] array = {'D', 'A', 'S', 'C', 'Z', 'Q'};
		char tmp;
		
		for (char i=0; i<array.length; i++)
		{
			for (char j=0; j<array.length-1; j++)
			{
				if (array[j]>array[j+1])
				{
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		
		for (char i=0; i<array.length; i++)
		{
			System.out.print(array[i]);
		}
		
	}
}



