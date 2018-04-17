package lab3;

public class  DenKortasteVagen {
	public static int[] mellanstationer(double[] a, double[][] b, double[] c)
	{
		int[] mellanstationer = new int[3];
		double vagLangd = a[1] + b[1][1] + c[1];
		int  m=a.length -1;
		int  n=c.length -1;
		
		for(int j=2; j<= m; j++)
			for (int i=1; i<= n; i++ )
			{
				if(vagLangd >(a[j] + b[j][i] + c[i])){
					vagLangd = a[j] + b[j][i] + c[i];
					mellanstationer[1] = j;
					mellanstationer[2] = i;
				}
			}
		return  mellanstationer;
	}
	
	public static double langd (double[] a, double[][] b, double[] c )
	{
		double vagLangd = 1;
		double minimalVagLangd= a[1] + b[1][1] + c[1];
		int[] mellanStationer = new int[3];
		mellanStationer[1]=1;
		mellanStationer[2]=2;
		int  m=a.length -1;
		int  n=c.length -1;
			for(int j=1; j<= n; j++){
				for (int i=1; i<= m; i++ ){
					vagLangd=a[i] + b[i][j] + c[j];	
					if(vagLangd<minimalVagLangd)
						minimalVagLangd=vagLangd;
				}
			}
		return minimalVagLangd;
	}
}
