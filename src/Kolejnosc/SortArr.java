package Kolejnosc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class SortArr 
{
	public static void main(String[] args) throws IOException
	{
		int n=0, m=2, k=n, l=m;
		int i, j, temp;
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Podaj iloœæ wprowadzanych liczb");
		n = Integer.parseInt(br.readLine());
		System.out.println("Wylosowano " + n + " liczb ");
		
		int array []  = new int [n];
		for (i = 0; i < n; i++)
		{
			for(j = 0; j < n; j++)
			{
					Random r = new Random();
					array[i]=r.nextInt(100); //Zakres Intow
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");		
		System.out.println("");		
		System.out.println("Posortowane liczby ROSN¥CO to:");		
	
		int arrayDwa []= Arrays.copyOf(array, n);
		for (i=0; i<n; i++)
		{
			for (j=0; j<n-1; j++)
			{
				if (arrayDwa[j+1]<arrayDwa[j])
				{
					temp=arrayDwa[j];
					arrayDwa[j]=arrayDwa[j+1];
					arrayDwa[j+1]=temp;
				}
			}
		}
		for (i=0; i<n; i++)
		{
			System.out.print(arrayDwa[i] + " ");
		}
		
		System.out.println("");		
		System.out.println("");		
		System.out.println("Posortowane liczby MALEJ¥CO to:");		
	
		int arrayTrzy []= Arrays.copyOf(array, n);
		for (i=0; i<n; i++)
		{
			for (j=0; j<n-1; j++)
			{
				if (arrayTrzy[j+1]>arrayTrzy[j])
				{
					temp=arrayTrzy[j];
					arrayTrzy[j]=arrayTrzy[j+1];
					arrayTrzy[j+1]=temp;
				}
			}
		}
		for (i=0; i<n; i++)
		{
			System.out.print(arrayTrzy[i] + " ");
		}
	
	}
}
