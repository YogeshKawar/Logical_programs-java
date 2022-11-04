package specialCharAtEnd;

public class Test {
	// Java program move all special char to the end of the string

		// Function return a string with all special
		// chars to the end
		static String moveAllSC(String str)
		{
			// Take length of string
			int len = str.length();

			// regular expression for check char is special
			// or not.
			String regx = "[0-9\\s+]";
			String regx1 = "[a-zA-Z]";

			// traverse string
			String res1 = "", res2 = "";
			for (int i = 0; i < len; i++) {
			
				char c = str.charAt(i);

				// check char at index i is a special char
				if (String.valueOf(c).matches(regx1+regx))
				res1 = res1 + c;
				else
				res2 = res2 + c;
			}
			return res1 + res2;
		}

		public static void main(String args[])
		{
			String str = "Acc#$%^2345"
						+ "li67%^";
			System.out.println(moveAllSC(str));
		}
	}

