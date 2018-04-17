package labb5;

public class Punkt 
{
	private String namn;
	private int x;
	private int y;
	

	public Punkt(String str, int i, int j) 
	{
		// TODO Auto-generated constructor stub
		this.namn = str;
		this.x = i;
		this.y = j;
	}
	

	public Punkt(Punkt p) 
	{
		this.namn = p.namn;
		this.x = p.x;
		this.y = p.y;
	}

	public String getNamn() {
		// TODO Auto-generated method stub
		return namn;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public double avstand(Punkt p2) 
	{
		int k1 = Math.abs(x - p2.x);
		int k2 = Math.abs(y - p2.y);
		double avst = Math.sqrt(k1*k1+k2*k2);
		return avst;
	}
	/*public Boolean equals(Punkt p)
	{
		if(p.x==this.x && p.y==this.y)
		{
			return true;
		}
		else
			return false;
	}*/
	public void setX(int i) {
		x = i;
	}

	public void setY(int i) {
		y = i;
		
	}
	public void skrivUt()
	{
		System.out.println(namn + " " + x + "," + y);
	}
	/*public String toString()
	{
		return (namn + " " + x + "," + y);
		
	}*/
	
}
	
