
public class PalindromeStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = "nayan";
	     StringBuffer sb = new StringBuffer(str);
	     sb.reverse();
	     String str1 = sb.toString();
	     if(str.equals(str))
	     {
	         System.out.println(str + " string is palindrome.");
	     }
	     else
	     {
	         System.out.println(str + " string is not palindrome.");
	     }
	}

}
