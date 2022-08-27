

public class Ex1
{
	public static void main (String [] args)
	{
		int[] a = {1,2,3};
		String[] b = {"String","завжди","в лапках"};
		char[] c = new char[] {'a','b','c'};
		
		for (int i = 0; i<3; i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
	}
	
}




/*
public class Ex1
{
	public static void main(String[] args) 
	{
		String[] strings = new String[3];
		int a = 4;
		
		if (a < 10)
		{
			strings = new String[10];
		}
		else 
		{
			strings = new String[20];
		}
		for (int i = 0; i < strings.length; i++)
		{
		System.out.println(strings[i]);
		}
	}
}*/