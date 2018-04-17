package labb5;


import java.io.*; // PrintWriter
class PunktTest

{
	public static void main (String[] args)
	{
		PrintWriter out = new PrintWriter (System.out, true);
		out.println("Test av Punkt");
		out.println("***********************************************");
		// testa en konstruktor och en transformator
		Punkt p1 = new Punkt ("A", 3, 4);
		Punkt p2 = new Punkt ("B", 5, 6);
		Punkt p3 = new Punkt ("C", 7, 8);
		out.println (p1 + " " + p2);
		

		// testa inspektorer
		String n = p1.getNamn ();
		int x = p1.getX ();
		int y = p1.getY ();
		out.println (n + " " + x + " " + y);
		
		// testa en kombinator och en komparator                   
		double d = p2.avstand (p1);
		out.println (d);
		boolean b = p1.equals (p2);
		out.println (b);
		
		// testa mutatorer
		p2.setX (1);
		p2.setY (2);
		out.println (p2);
		
		// testa en konstruktor till
		Punkt p = new Punkt (p1);
		out.println (p);
		
		// Min egen utskrift av en punkt
		//p1.skrivUt();
		//p2.skrivUt();
		//d = p2.avstand(p1);
		//out.println(d);
		
		out.println("Test av PolyLinje");
		out.println("***********************************************");
		Punkt[]  punktLista = {p1, p2, p3};
		
		// testa  konstruktorer
		Polylinje pL1 = new Polylinje ();
		Polylinje pL2 = new Polylinje (punktLista);
		
		out.println (pL1 + " " + pL2);
		// testa inspektor
		
		// Test av kombinator
		double langd = pL2.langd();
		System.out.println("linjen innan manipulering");
		pL2.skrivUt();
		out.println("Polylinjen är " + langd);
		Punkt nyPunkt = new Punkt("D", 7, 8);
		pL2.laggTillFramfor ( nyPunkt, "bla");
		System.out.println("Efter lägg till famför");
		pL2.skrivUt();
		pL2.taBort("A");
		out.println("Efter ta bort A ");
		pL2.skrivUt();

	}
}