
public class ForEach 
{
	public static void main (String [] args)
	{
		String[] strings = {"Java", "Oracle", "Epam"};
//		for (String elem : strings)						ця залупа не працює
//		{
//			elem += 11;
//		}

//		берем звичайний фор
	
//		for (int i = 0; i < strings.length; i++)
//		{
//			strings[i] += 11;
//		}
//		
//		for (String elem : strings)
//		System.out.println(elem);
		
		StringBuilder[] stringBuilders = new StringBuilder[3];
		stringBuilders[0] = new StringBuilder("Java");
		stringBuilders[1] = new StringBuilder("Oracle");
		stringBuilders[2] = new StringBuilder("EPAM");
		for (StringBuilder elem : stringBuilders)
		{
			elem.append(11);			
		}
		for (StringBuilder elem : stringBuilders)
		{
			System.out.println(elem);
		}
		
	}

}
