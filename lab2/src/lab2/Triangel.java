package lab2;
import static java.lang.Math.*;
public class Triangel {
	public static double bisektris(double b, double c, double alfa)
	{  //räknar ut bisektris av en triangel
		double p = 2 * b * c *cos(alfa/2);
		double bis = p / (b+c);
			
		return bis;
	}
	
	
	public static double area(double hojd, double bas)
	{
		double a = (hojd * bas)/2;
		
		return a;
	}
	public static double vinkel(double b, double c, double alfa)
	{  //räknar ut en vinkel (does not work jet)
		double p = 0;
		
			double vinkel = ((-1*(alfa*alfa)+b*b+c*c))/(2*b*c);
			p=cos(vinkel);
			
			return  p;
	}
	public static double sida(double vinkel, double b, double a)
	{
		//räknar ut en sida av triangeln
		double sida = b*b+a*a-2*a*b*cos(vinkel);
		return sqrt(sida);
	}
	public static double omkrets(double c, double b, double alfa )
	{  //räknar ut omkrets av en triangel
		double omkrets = c + b + alfa;
		return omkrets;
	}
	public static double cirkelradie(double b, double c, double alfa, double s)
	  {
	  double cirkelradie = (alfa * b * c)/(4*sqrt(s*(s-alfa)*(s-b)*(s-c)));
	  return cirkelradie;
	}
	  public static double cirkelradiein(double b, double c, double alfa, double s)
	  {
		  double cirkelradiein = (sqrt((s-alfa)*(s-b)*(s-c)/s));
		  return cirkelradiein;
	  }
}