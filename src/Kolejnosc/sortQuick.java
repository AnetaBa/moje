package Kolejnosc;

import java.util.Arrays;

public class sortQuick {

	public static void main(String[] args) 
	{
		int array [] = {99,9,20,19, 0, -9};

		Arrays.sort(array);	//Metoda sortuj¹ca tablice
		
		//Sposób za pomoca¹ pêtli for each
		System.out.println("Za pomoca for each");
		for (int number : array)
		{
			System.out.println(number);
		}
		
		System.out.println();
		
		//Sposob za pomoca petli for
		System.out.println("Za pomoca for");
		for (int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		for(int j=0; j<5; j++) {
			
		    for(int i=0; i<20; i++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		}
			
	}
}
