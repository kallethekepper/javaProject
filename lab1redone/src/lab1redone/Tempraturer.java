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
		
		// mata in uppgifter om antalet veckor och antalet mätningar
		System.out.print ("antalet veckor: ");
		int antalVeckor = in.nextInt ();
		System.out.print ("antalet mätningar per vecka: ");
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
		
		// denminsta, den största och medeltemperaturen – veckovis
		double[] minT = new double[antalVeckor + 1];
		double[] maxT = new double[antalVeckor + 1];
		double[] sumT = new double[antalVeckor + 1];
		double[] medelT = new double[antalVeckor + 1];
		
		// koden ska skrivas här
		for(int vecka = 1;vecka<antalVeckor; vecka++ )
		{
		// visa den minsta, den största och medeltemperaturen för varje vecka
		// koden ska skrivas här
		// den minsta, den största och medeltemperaturen - hela mätperioden
			minT[vecka] = t[vecka][1];
			maxT[vecka] = t[vecka][1];
			sumT[vecka] = t[vecka][1];
			
			
			for(int g = 2; g < antalMatningarPerVecka; g++ )
			{	
				//
				sumT[vecka] += t[vecka][g];
				
				//medel värde
				
				sumT[vecka] += t[vecka][g]/g;
				
				//något fel med minT
				minT[vecka] += 0;
				if(minT[vecka]>minT[vecka + 1])
					minT [vecka] = minT[vecka+1];
				//jämförelse operator
								
				maxT[vecka] += 0;
				//jämförelse operator
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
			
		// koden ska skrivas här
		// visa den minsta, den största och medeltemperaturen i hela mätperioden
		// koden ska skrivas här
		
		
		}
		System.out.println("Lägsta tempraturen " + minTemp);
		System.out.println("Högsta tempraturen " + maxTemp);
		System.out.println("Summan av alla tempraturer " + sumTemp);
		System.out.println("Medel tempraturen under veckorna " + medelTemp);
		}
		
}
