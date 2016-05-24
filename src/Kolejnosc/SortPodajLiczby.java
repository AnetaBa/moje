//Dopisaæ kod do wyœwietlania wylosowanych liczb

package Kolejnosc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class liczby

{
	//Podawanie iloœci liczb
	public void wprowadzanie(int [][] array, int n) throws IOException
	{
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
				System.out.println("Podaj iloœæ wprowadzanych liczb");
				n = Integer.parseInt(br.readLine());
				System.out.println("Poda³eœ " + n + " liczb ");
	}
	int i, j;
	
	//Losowanie liczb
	public void losowanie (int[][] array, int n) throws IOException
	{
		for (i = 0; i < n; i++)
		{
			for(j = 0; j < 2; j++)
			{
				if (j==0)
				{
					array[i][j]=i+1;
				}
				
				if (j==1)		//Losowanie liczb w drugiej kolumnie	
				{
					Random r = new Random();
					array[i][j]=r.nextInt(100); //Zakres Intow
				}
			}
		}
	}
	
	//wyswietlanie liczb
	
	
}




public class SortPodajLiczby 
{
	public static void main(String[] args) throws IOException
	{
		int n=0, m=0;
		int [][] array = new int [n][m];
		liczby pole = new liczby();
		pole.wprowadzanie(array, n);
		pole.losowanie(array, n);
	}
	
}