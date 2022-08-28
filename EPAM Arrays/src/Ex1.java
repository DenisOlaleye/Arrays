




public class Ex1
{
	public static void main (String [] args)
	{
		String s;
		String[] list;
		
		list = new String[10];
		int n = list.length;
		
		list = new String [0];
		
//		list = null;
//		System.out.println(list[1]);
		
		list = new String[10];
		System.out.println("Значення якогось елемента \n" +list[9]);
		System.out.println();
		
		System.out.println("Його величність Масив: \n");
		for (int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}

	}
}






/*public class Ex1
{
	
	public static void main (String [] args)
	{
		int a = 11;
		int[] arr;
		
		if (a < 10)
		{
			arr = new int[10];
		}
		else
		{
			arr = new int [20];
			
		}
		
		for ( a = 0; a < arr.length; a++)
		{
			arr[a] = a+2;
		System.out.println(arr[a]);
		}
		System.out.println();
		System.out.println(arr.length+ " елементів в масиві");
	}
	
}




/*public class Ex1
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