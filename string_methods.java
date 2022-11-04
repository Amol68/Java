// IN JAVA , STRINGS ARE CASE SENSITIVE


public class Main
{
	public static void main(String[] args)
	{
	String s1 = new String("AusTrAliA");
	 
	 int len = s1.length();     // returns string's length 
	 System.out.println(len);
	 
	 String lstring = s1.toUpperCase();  // converts all characters into uppercase
	 System.out.println(lstring);        // similar for lower case case
	 
	 String nontrimmedstring = "  Java  ";
	 System.out.println(nontrimmedstring);
	 System.out.println(nontrimmedstring.trim());  // removes all leading and trailing spaces
	 
	 
	 System.out.println(s1.substring(1)); // takes an index of the string and displays it from that index till the end
	 
	 System.out.println(s1.substring(3,6)); // element at second index is not displayed
	
	 System.out.println(s1.replace("AliA","IA"));
	  
	 System.out.println(s1.startsWith("t"));  // return true if String s1  starts with A 
	  
	 System.out.println(s1.charAt(3));
	  
	 System.out.println(s1.indexOf("A")); // returns the index of given substring
	 System.out.println(s1.indexOf("A",1));  // will start searching for index from index 1
	 
     System.out.println(s1.lastIndexOf("A")); //  returns the index of latest occurence of given substring
     System.out.println(s1.lastIndexOf("A",5));  // starts searching from specified index
    
     System.out.println(s1.equals("AuSTrAliA")); 
     System.out.println(s1.equalsIgnoreCase("AusTralia")); 
     
     System.out.println("You Will Never \t Walk Alone");  // escape sequence character "\t" leaves a tab space in between
    
	}
}
