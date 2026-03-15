package com.jt.eazybytes;

public class StringComparisonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "JAVA";
		String str2 = new String("JAVA");
		String str3 = "JAVA";
		String str4 = new String("JAVA");
		String str5 = new String("Hello");
		String str6 = new String("java");
		
		boolean b1 = str1 == str2; //false
		boolean b2 = str1 == str3; //true
		//boolean b3 = str4 == str5; 
		
		boolean b4 = str1.equals(str2); //true
		boolean b5 = str1.equals(str3); //true
		boolean b6 = str4.equals(str6); //false
		
		boolean b7 = str4.equals("JAVA"); //true
		boolean b8 = "Hello".equals("hello"); //false
		boolean b9 = "Hello".equals(str5); //false
		
		boolean b10 = "Hello".equalsIgnoreCase("hello"); //true

		boolean b11 = str4.equalsIgnoreCase(str6); //true
		
		int comparison1 = "java".compareTo(str6); // 0
		int comparison2 = "java".compareTo(str4); // 32
		int comparison3 = "java".compareToIgnoreCase(str4); // 0
		int comparison4 = "java".compareTo("csharp"); // 7
		int comparison5 = "csharp".compareTo("java"); // -7
		int comparison6 = "Csharp".compareTo("java"); // -39
		
		char char1 = str5.charAt(0);
		char char2 = str5.charAt(1);
		char char3 = str5.charAt(2);
		char char4 = str5.charAt(3);
		char char5 = str5.charAt(4);
		//char exception = str5.charAt(5);

		String emptyValue = "";
		String nullValue = null;
		String blankValue = "    ";
		boolean isEmpty = emptyValue.isEmpty(); //true
		boolean isLenghtZero = emptyValue.length() == 0; //true
		boolean isEmptyEqual = "".equals(emptyValue); //true
		
		//boolean isNullEmpty = nullValue.isEmpty(); // NullPointerException
		boolean isNullEqual = "".equals(nullValue); //false
		
		boolean isBlankEmpty = blankValue.isEmpty(); //false
		boolean isBlank = blankValue.isBlank();  //true
		
		String originalString = "Java";
		String upperCaseString = originalString.toUpperCase();
		String lowerCaseString = originalString.toLowerCase();
		
		String specialString = "Java@1Code";
		String specialUpperCase = specialString.toUpperCase();
		String specialLower = specialString.toLowerCase();
		
		int intValue = 23;
		double doubleValue = 2334.89;
		boolean boolValue = true;
		
		String strValue1 = String.valueOf(intValue);
		String strValue2 = String.valueOf(doubleValue);
		String strValue3 = String.valueOf(boolValue);
		String strValue4 = String.valueOf('B');
		
		int age = 25;
		String strValue5 = "My age is " + age;
		
		String originalString1 = "Hello, World!";
		int index = originalString1.indexOf('!');
		int index1 = originalString1.indexOf("World");
		int index2 = originalString1.indexOf("@");
		int index3 = originalString1.indexOf("w");
		int index4 = originalString1.indexOf(97);

		boolean isContain = originalString1.contains(", W");
		boolean isPresent = originalString1.contains("@");
		
		boolean startsWith = originalString1.startsWith("Hello");
		boolean endsWith = originalString1.endsWith("rld!");

		boolean macthes = originalString1.matches(".*orld.*");
		
		String java1 = " java ".trim();
		String java2 = "java ".trim();
		String java3 = "\n \t java \n \t".trim();
		
		String java4 = " j a\nva ".trim();

		String replacedString1 = originalString1.replace('l', '*');
		String replacedString2 = originalString1.replace("World", "Universe");
		
		String originalString2 = "Java is fun!";
		String replacedString3 =  originalString2.replaceAll("a|e|i|o|u", "*");
		
		String originalString3 = "apple, mango, cherry, apple, guava, apple";
		String replacedString4 =  originalString3.replaceFirst("apple", "grape");
		
		String originalString4 = "ababababababab";
		String replacedString5 = originalString4.replace("ab", "X");

		String fruits = "apple, banana, grape, guava, sapota, mango";
		String[] fruitArray = fruits.split(",");
		
		String joinedString = String.join(" ", "Hello", "World", "Java");
		String joinedString1 = String.join("", "Java", "is", "fun");
		
		String message = "Hloo %s! you have %d messages";
		String msgforBhav = String.format(message, "Bhavani", 3);
		String msgforTeja = String.format(message, "Tejeesh", 6);
		
		String message1 = "The price is %.2f";
		String price1 = String.format(message1, 19.99);
		String price2 = String.format(message1, 20.98);
		
		String message2 = "The price is %5d;";
		String result1 = String.format(message2, 5);
		
		String message3 = "My name is %s. I am %d years old. I live in %s";
		String result2 = String.format(message3, "Bhavani", 25, "Bangalore");
		
		String message4 = "My name is %3$s. I am %2$d years old. I live in %1$s";
		String result3 = String.format(message4, "Hyderabad", 26, "Tejeesh");
		
		System.out.println(result2);
		
		System.out.printf("Name: %s, Age: %d%n", "Bhavani", 25);
		System.out.printf("Grade: %c%n", 'B');
		
		System.out.print("sample string value");
		System.out.print("another string value");
		System.out.println("sample string value");
		System.out.println("another string value");

	} 

}
