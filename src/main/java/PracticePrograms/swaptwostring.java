package PracticePrograms;

public class swaptwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str1 = "yuvaraj";
		String str2 = "kumar";
		
		str1 =str1+str2;
		
		str2 = str1.substring(0,str1.length()-str2.length());
		
		str1 = str1.substring(str2.length());
		
		
		
	System.out.println("String 1 after swap: " + str1);
	System.out.println("String 2 after swap: " + str2);
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
