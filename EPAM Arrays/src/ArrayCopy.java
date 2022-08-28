import java.util.Arrays;

public class ArrayCopy 
{
	public static void main (String [] args)
	{
		int[] array = {21, 22, 23, 24};
		int[] hold = {40, 41, 42, 43, 44, 45, 46, 47};
		
		System.arraycopy(array, 0, hold, 2, array.length-1);
		
		System.out.println(Arrays.toString(hold));
		
		
	}

}
