package lab1redone;

import java.util.*; // Scanner, Locale
import java.math.*;
 class Temperaturer
{
	public static void main (String[] args)
	{
		System.out.println ("TEMPERATURER\n");
		
		// inmatningsverktyg
		
		Scanner in = new Scanner (System.in);
		in.useLocale (Locale.US);
		
		// mata in uppgifter om antalet veckor och antalet m�tningar
		System.out.print ("antalet veckor: ");
		int antalVeckor = in.nextInt ();
		System.out.print ("antalet m�tningar per vecka: ");
		int antalMatningarPerVecka = in.nextInt ();
		
		// plats att lagra temperaturer
		double[][] t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];
		
		// mata in temperaturerna
		for (int vecka = 1; vecka <= antalVeckor; vecka++)
		{
			System.out.println ("temperaturer - vecka " + vecka + ":");
			for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
				t[vecka][matning] = in.nextDouble ();
		}
		System.out.println ();
		
		// visa temperaturerna
		System.out.println ("temperaturerna:");
		for (int vecka = 1; vecka <= antalVeckor; vecka++)
		{
			for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
				System.out.print (t[vecka][matning] + " ");
			System.out.println ();
		}
		System.out.println ();
		
		// denminsta, den st�rsta och medeltemperaturen � veckovis
		double[] minT = new double[antalVeckor + 1];
		double[] maxT = new double[antalVeckor + 1];
		double[] sumT = new double[antalVeckor + 1];
		double[] medelT = new double[antalVeckor + 1];
		
		// koden ska skrivas h�r
		for(int vecka = 1;vecka<antalVeckor; vecka++ )
		{
		// visa den minsta, den st�rsta och medeltemperaturen f�r varje vecka
		// koden ska skrivas h�r
		// den minsta, den st�rsta och medeltemperaturen - hela m�tperioden
			minT[vecka] = t[vecka][1];
			maxT[vecka] = t[vecka][1];
			sumT[vecka] = t[vecka][1];
			
			
			for(int g = 2; g < antalMatningarPerVecka; g++ )
			{	
				//
				sumT[vecka] += t[vecka][g];
				
				//medel v�rde
				
				sumT[vecka] += t[vecka][g]/g;
				
				//n�got fel med minT
				minT[vecka] += 0;
				if(minT[vecka]>minT[vecka + 1])
					minT [vecka] = minT[vecka+1];
				//j�mf�relse operator
								
				maxT[vecka] += 0;
				//j�mf�relse operator
				if(maxT[vecka]<maxT[vecka + 1])
					maxT [vecka] = maxT[vecka+1];
				
				System.out.println("vecka");
				System.out.println(minT[vecka]);
				System.out.println(maxT[vecka]);
				System.out.println(sumT[vecka]);
				System.out.println(medelT[vecka]);
				
				
				
			}
			in.close();
		}
		
		double minTemp = minT[1];
		double maxTemp = maxT[1];
		double sumTemp = sumT[1];
		double medelTemp = 0;
		
		
		for(int antal = 0; antal < antalVeckor; antal++)
		{
			sumTemp += sumT[antal];
			
			medelTemp += sumT[antal]/ antalVeckor;
			
			if(minTemp  > minT[antal]){	
				minTemp  = minT [antal];
			}
			if(maxTemp  < maxT[antal]){
				maxTemp  = maxT[antal];	
		}
			
		// koden ska skrivas h�r
		// visa den minsta, den st�rsta och medeltemperaturen i hela m�tperioden
		// koden ska skrivas h�r
		
		
		}
		System.out.println("L�gsta tempraturen " + minTemp);
		System.out.println("H�gsta tempraturen " + maxTemp);
		System.out.println("Summan av alla tempraturer " + sumTemp);
		System.out.println("Medel tempraturen under veckorna " + medelTemp);
		}
		
}
