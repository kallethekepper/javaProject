package labb5;
// Poly linjen består av sammanbundna punkter 
public class Polylinje
{
	// Det här är polylinjens egenskaper(medlemmar)
	//alla hörn
	private Punkt[] horn;
	private String farg = "svart";
	private int bredd = 1;
	// Konstruktorer
	public Polylinje ()
	{
		this.horn = new Punkt[0];
	}
	
	public Polylinje (Punkt[] horn)
	{
		this.horn = new Punkt[horn.length];
		for (int i = 0; i < horn.length; i++)
			this.horn[i] = new Punkt (horn[i]);
	}
	public String toString () 
	{
		/*String s=" ";
		for(int a =0;  a < horn.length; a++)
			s+= horn.length;
			s+=farg + "";
			s+=bredd + "";
		return s;*/
		return "Jag är en polylinje eller kanske ett polynom ";
	}
	
	public Punkt[] getHorn () {return horn;}
	
	public String getFarg () {return farg;}
	
	public int getBredd () {return bredd;}
	
	public void setFarg (String farg) {this.farg=farg;}
	
	public void setBredd (int bredd) {this.bredd=bredd;}
	
	public double langd () 
	{
		double totlangd = 0;
		for(int i=1; i< horn.length; i++ )
		{
			totlangd += horn[i-1].avstand(horn[i]);
		}
		return totlangd;
	}
	
	public void laggTill (Punkt horn)
	{
		Punkt[] h = new Punkt[this.horn.length + 1];
		int i = 0;
		for (i = 0; i < this.horn.length; i++)
			h[i] = this.horn[i];
		h[i] = new Punkt (horn);
		this.horn = h;
	}
	public void laggTillFramfor (Punkt horn, String hornNamn) 
	{
		Punkt[] h = new Punkt[this.horn.length + 1];
		h[0] = new Punkt(horn);
		for(int i = 0; i < this.horn.length; i++)
		{
			h[i+1] = this.horn[i];
		}
		this.horn = h;
		
	}
	public void taBort (String hornNamn) 
	{
		Punkt[] h = new Punkt[this.horn.length - 1];
		
		int j = 0;
		for(int i = 0; i < this.horn.length; i++)
		{
		
			if(this.horn[i].getNamn() != hornNamn)
			{
				h[j] = this.horn[i];
				j++;
			}
		}
		this.horn = h;
	}
	public void skrivUt()
	{
		for(int i = 0; i < this.horn.length; i++)
		{
			horn[i].skrivUt();
		}
	}
}