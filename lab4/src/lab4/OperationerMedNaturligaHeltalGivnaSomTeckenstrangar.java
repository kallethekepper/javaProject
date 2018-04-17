package lab4;


import java.util.*;    // Scanner

import static java.lang.System.out;

class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar
{
    public static void main (String[] args)
    {
        out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");

        // mata in två naturliga heltal
        Scanner    in = new Scanner (System.in);
        out.println ("två naturliga heltal:");
        String    tal1 = in.next ();
        String    tal2 = in.next ();
        out.println ();
        
        System.out.println("addition av talen");
        // addera heltalen och visa resultatet
        String    addSumma = addera (tal1, tal2);
        visa (tal1, tal2, addSumma, '+');
        // subtrahera heltalen och visa resultatet
        // koden här
        System.out.println("subraktion av talen");
        String  subSumman =subtrahera(tal1, tal2);
        visa(tal1, tal2, subSumman, '-');
        
        in.close();
    }

    // addera tar emot två naturliga heltal givna som teckensträngar, och returnerar de    // summa som en teckensträng.
   /* public static String oldaddera (String tal1, String tal2)
    {
    	// koden ska skrivas här
    	Integer summa =Integer.parseInt(tal1)+Integer.parseInt(tal2);
    	return Integer.toString(summa);
    }*/
    public static String addera (String tal1, String tal2)
    {
    	StringBuilder	tal = new StringBuilder("");
    	int			siffra1 = 0;
    	int			siffra2	= 0;
    	int			sum=0;
    	int			siffra=0;
    	int		minnessiffra=0;
    	int			pos1=tal1.length() -1;
    	int			pos2=tal2.length() -1;
    	
    	while (pos1 >= 0 && pos2 >= 0)
    	{
    		siffra1 = tal1.charAt(pos1) -48;
    		siffra2 = tal2.charAt(pos2) -48;
    		
    		sum = minnessiffra + siffra1 + siffra2;
    		siffra = sum % 10;
    		tal.insert(0,  siffra);
    		minnessiffra= sum/10;
    		
    		pos1--;
    		pos2--;
    	}
    	while (pos1 >= 0)
    	{
    		siffra1 =tal1.charAt (pos1) -48;
    		
    		sum = minnessiffra + siffra1;
    		siffra = sum % 10;
    		
    		tal.insert(0, siffra);
    		minnessiffra = sum/10;
    		
    		pos1--;
    	}
    	while (pos2 >= 0)
    	{
    		siffra2=tal2.charAt(pos2) -48;
    		
    		sum = minnessiffra + siffra2;
    		siffra = sum % 10;
    		tal.insert(0, siffra);
    		minnessiffra = sum / 10;
    		
    		pos2--;
    	}
    	if (minnessiffra > 0)
    		tal.insert(0, minnessiffra);
    	return tal.toString();
    }

    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar
    // deras differens som en teckensträng.
    // Det första heltalet är inte mindre än det andra heltalet.
    public static String subtrahera (String tal1, String tal2)
    {
        // koden ska skrivas här modifiering krävs
    	StringBuilder	tal = new StringBuilder("");
    	int			siffra1 = 0;
    	int			siffra2	= 0;
    	int			sum=0;
    	int			siffra=0;
    	int		minnessiffra=0;
    	int			pos1=tal1.length() -1;
    	int			pos2=tal2.length() -1;
    	
    	while (pos1 >= 0 && pos2 >= 0)
    	{
    		siffra1 = tal1.charAt(pos1) -48;
    		siffra2 = tal2.charAt(pos2) -48;
    		
    		sum = minnessiffra + siffra1 - siffra2;
    		minnessiffra= 0;
    		if(sum<0)
    		{
    			sum = sum +10;
    			minnessiffra= -1;
    		}
    		siffra = sum ;
    		tal.insert(0,  siffra);
    		
    		
    		pos1--;
    		pos2--;
    	}
    	while (pos1 >= 0)
    	{
    		siffra1 =tal1.charAt (pos1) -48;
    		
    		
    		sum = minnessiffra + siffra1;
    		siffra =sum % 10;
    		
    		tal.insert(0, siffra);	
    		minnessiffra = sum/10;
    		
    		pos1--;
    	}
    	while (pos2 >= 0)
    	{
    		siffra2=tal2.charAt(pos2) -48;
    		
    		
    		sum = minnessiffra + siffra2;
    		siffra = sum % 10;
    		tal.insert(0, siffra);
    		minnessiffra = sum/10;
    		
    		pos2--;
    	}
    	if (minnessiffra > 0)
    		tal.insert(0, minnessiffra);
    	return tal.toString();
    }

    // visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation
    // utförd i samband med hetalen
    public static void visa (String tal1, String tal2, String resultat, char operator)
    {
        // sätt en lämplig längd på heltalen och resultatet
        int    len1 = tal1.length ();
        int    len2 = tal2.length ();
        int    len  = resultat.length ();
        int    maxLen = Math.max (Math.max (len1, len2), len);
        tal1 = sattLen (tal1, maxLen - len1);
        tal2 = sattLen (tal2, maxLen - len2);
        resultat = sattLen (resultat, maxLen - len);

        // visa heltalen och resultatet
        out.println ("  " + tal1);
        out.println ("" + operator + " " + tal2);
        for (int i = 0; i < maxLen + 2; i++)
            out.print ("-");
        out.println ();
        out.println ("  " + resultat + "\n");
    }

 		// sattLen lägger till ett angivet antal mellanslag i början av en given sträng
 	public static String sattLen (String s, int antal)
 	{
        StringBuilder    sb = new StringBuilder (s);
        for (int i = 0; i < antal; i++)
            sb.insert (0, " ");

        return sb.toString ();
        
        
 	}
 	
} 
