
public class Bound 
{
	public static void main (String [] args)
	{
		ArrayAction action = new ArrayAction();
		int[] a = {3, 4, 5};
		
		action.changeArray(a, 7);
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
