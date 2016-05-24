//Program losuje liczby piersze 

package losowanie;
import java.io.IOException;
import java.util.Random;

public class LiczbyPierwsze 
{
	public static void main(String[]args)

	{
		double i, losuj;
		Random r = new Random ();
		losuj = Math.round(1000*( r.nextDouble()));
		
		System.out.println(losuj);
	}
}
