//Denis Olaleye
//30.09.1993

//програма, яка виводить рядок сзаду наперед
public class ReversedString
{
	public static void main (String [] args)
	{
//		ініціалізуємо змінні
		String recursionString = "recurcion";
		String charAtStr = "charat";
		String toCharArrStr = "chararr";
		
//		ініціалізуємо змінну, яка зберігає рекурсивно перевернутий рядок і виводимо її
		String recurcionedStr = reverseStringRecurcion(recursionString);
		System.out.println(recurcionedStr);
		
//		рядок перевернутий за допомогою CharAt 
		String reversedCharAt = reverseWithCharAt(charAtStr);
		System.out.println(reversedCharAt);
		
//		...перевернутий з CharArray
		String reversedWithArray = reverseWithCharArray(toCharArrStr);
		System.out.println(reversedWithArray);

//		використаємо метод клас StringBuffer і його метод revers
		String inputStr = "Stringbuffer";
		String reversedString = new StringBuffer(inputStr).reverse().toString();
		System.out.println(reversedString);
	}
	
//	рекурсивний метод перевороту рядка
	public static String reverseStringRecurcion(String str)
	{
		String rightPart;
		String leftPart;
		
		int length = str.length();
		
  //		закінчуємо рекурсивний обхід
		if (length <= 1)		//якщо в рядку 1 символ або меньше, то одразу повертаємо назад
		{
			return str;
		}
  //		substring повертає рядок, який є частиною основного рядка. підрядок починається з beginIndex і закінчується до endIndex 
		leftPart = str.substring(0, length/2);			//беремо ліву половину
		rightPart = str.substring(length/2, length);		//беремо праву половину
		
  //		рекурсивно перевертаємо ліву і праву частини вхідної строки
		return reverseStringRecurcion(rightPart) + reverseStringRecurcion(leftPart);
	}
	
  //	перевертаємо строку з методом CharAt
	public static String reverseWithCharAt(String str)
	{
		int strLength = str.length();
		String result = "";
		for (int i = 0; i < strLength; i++)
		{
			result = str.charAt(i) +result;
		}
		return result;
	}
	
  //	виводимо строку за допомогою toCharArray()
	public static String reverseWithCharArray(String str)
	{
		char[] charArray = str.toCharArray();		//представляємо рядок у вгляді масиву символів
		String resultString = "";
		for (int i = charArray.length-1; i >= 0; i--)		//проходимо по циклу у зворотньому напрямі
		{
			resultString += charArray[i];		//додаємо символи в рядок у зворотньому порядку
		}
		return resultString;		//повертаємо рядок
	}
	
	
}
