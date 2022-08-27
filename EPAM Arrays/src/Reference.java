
public class Reference 
{
	public static void main(String[] args) 
	{
		int[] arr = {42,13};
		Object object = arr;
		int x = ((int[])object)[0];
		
//		int [][] multi = {{42, 6},{12, 45, 3}};
//		object = multi;
//		object = multi[0];
		
		double[] dArray = {42.0, 7.1};
		dArray = (double[])object;
		
	}

}
