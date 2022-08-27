	//з масиву символів у строку
public class DeclareCharArray
{
	public static void main(String[] args) 
	{
		char[] arr = new char [] {'У','к','р','а','ї','н','а'};
		String stringFromChar = new String(arr);
		System.out.println(stringFromChar);
		
	}
}




	//заповнюємо масив символів символами строки
/*public class DeclareCharArray
{
	public static void main(String[] args) 
	{
		String s = "Рашці пизда!";
		char[] arr = new char [s.length()];
		for (int i = 0; i < s.length(); i++)
		{
			arr[i] = s.charAt(i);
			System.out.print(arr[i] +" ");
		}
		
	}
}

	//заповнюємо масив циклом фор іч
/*public class DeclareCharArray 
{
	public static void main(String[] args) 
	{
		String str = "Слава Україні!";
		char[] charArray = str.toCharArray();
		
		for (char st : charArray)
		{
			System.out.print(" "+st);
		}
	}

}*/
