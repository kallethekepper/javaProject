package lab3;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
import java.util.*;
public class  BestamDenKorstasteVagen {
	public static void main(String[] args)throws Exception{
		Scanner  in = new Scanner(System.in);
		in.useLocale(Locale.US);
		 
		System.out.println("The shortest way");
		
		
		
		System.out.println("Nummber of stations between zone Z2 and Z3: ");
		//antal knytpunkter
		int m = in.nextInt();
		int n = in.nextInt();
		
		System.out.println();
		System.out.flush();
		
		double[]     a=new double[m+1];
		double[][]   b=new double[m+1][n+1];
		double[]	 c=new double[n+1];
		System.out.println("Length betwen X and station  Z2: "  );
			
		for(int i =1; i<=m;i++)
			a[i]=in.nextDouble();
			System.out.println();
			for(int i =1; i<=m;i++)
			{
				System.out.println("distance between station U "+i +
					"and staion in Z3:");
				for(int j= 1; j<=n;j++)
					b[i][j]= in.nextDouble();
			}
			System.out.println();
			System.out.println("Distance between Z3 and Y:");
			for(int j= 1;j<=n;j++)
				c[j]= in.nextDouble();
			
			System.out.println();
			
			
			int[]	mellanstationerna =  DenKortasteVagen.mellanstationer(a, b, c);
			System.out.println("The shortest path between X and Y go trough the stations"
					+ "U"+ mellanstationerna[1]
					//+ "trough stations Z2 and Z3 "
					+ " and trough V"+ mellanstationerna[2]);
			
			double langden=DenKortasteVagen.langd(a, b, c);
			
			System.out.println("The length of the shortest path is: " + langden + ".");
			
			
			in.close();
			
	}
}
	
	
	
	
