package lab2;
import java.util.*;
public class  EnTriangeOchDessCirklar{

	public static void main(String[] args) {
		
		Scanner  in = new Scanner(System.in);
		in.useLocale(Locale.US);
		double mataInFormelTyp;
		do{
		
		System.out.println("\nmata in vilken formel typ: ");
		System.out.println("tryck 0 f�r att avsluta");
		System.out.println("tryck 1 f�r bisektris: ");
		System.out.println("tryck 2 f�r area: ");
		System.out.println("tryck 3 f�r vinkel: ");
		System.out.println("tryck 4 f�r l�ngden av en sida: ");
		System.out.println("tryck 5 f�r omkrets: ");
		System.out.println("tryck 6 f�r omskriven cirkel: ");
		System.out.println("tryck 7 f�r inskriven cirkel: ");
		 mataInFormelTyp = in.nextDouble();
		
		//skriver ut bisektrisen
		  if (mataInFormelTyp == 1){
			System.out.println("Mata in triangelns tv� sidor: ");
			double b = in.nextDouble();
			double c = in.nextDouble();
			System.out.println("Mata in triangelns vinkel: ");
			double alfa = in.nextDouble();
			double bis = Triangel.bisektris(b, c, alfa);
			System.out.println("Bisektris: " + bis);
		}
		
		//skriver ut arean av triangeln
		else if(mataInFormelTyp == 2){
			System.out.println("Mata in basen och h�jden: ");
			double b = in.nextDouble();
			double h = in.nextDouble();
			double a = Triangel.area(b, h);
			System.out.println("Area: " + a);
		}
		
		//skriver ut vinkeln
		else if(mataInFormelTyp == 3){
			System.out.println("Mata in triangelns alla sidor: ");
			double b = in.nextDouble();
			double c = in.nextDouble();
			double alfa = in.nextDouble();
			double vinkela = Triangel.vinkel( alfa, b, c);
			System.out.println("Vinkel: " + vinkela);
		}
		
		//skriver ut l�ngden av en sida
		else if(mataInFormelTyp == 4){
			System.out.println("Mata in tv� ihopsittande sidor: ");
			double b = in.nextDouble();
			double c = in.nextDouble();
			System.out.println("Mata in vinkeln mellan dessa tv� sidor: ");
			double vink = in.nextDouble();
			double sida = Triangel.sida(vink, b, c);
			System.out.println("Sida: " + sida);
			
		}
		
		//skriver ut omkretsen
		else if(mataInFormelTyp == 5){
			System.out.println("Mata in triangelns alla sidor: ");
			double b = in.nextDouble();
			double c = in.nextDouble();
			double alfa = in.nextDouble();
			//semiparimeter
			double omkretsa = Triangel.omkrets(alfa, b, c);
			System.out.println("omkrets: " + omkretsa);
		}
		
		//skriver ut radien av den den cirkel som omger en triangel(alfa, b, a, s)
		else if(mataInFormelTyp == 6)
		{
			System.out.println("Mata in triangelns alla sidor: ");
			double b = in.nextDouble();
			double c = in.nextDouble();
			double alfa = in.nextDouble();
			double s = (alfa + b + c)/2;
			double omskrivencirkel = Triangel.cirkelradie(alfa, b, c ,s );
			System.out.println("omskrivencirkel: " + omskrivencirkel);
		}
		
		//skriver ut radien av en cirkel som �r inuti en triangel(alfa, b, a, s)
		else if(mataInFormelTyp == 7)
		{
			System.out.println("Mata in triangelns alla sidor: ");
			double b = in.nextDouble();
			double c = in.nextDouble();
			double alfa = in.nextDouble();
			double s = (alfa + b + c)/2;
			double omskrivencirkelin = Triangel.cirkelradiein(alfa, b, c, s);
			System.out.println("inskrivencirkelin : " + omskrivencirkelin);
		}
	}
	while(mataInFormelTyp != 0);
		
	in.close();
		
	}
	
}