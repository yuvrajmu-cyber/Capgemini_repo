package PracticePrograms;

public class a1b2c3 {
	
	
	
	
	public static void main(String[] args) {
		
		String str = "a1b2c3";
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i = 0;i<str.length();i+=2) {
			
			
			char ch = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i+1));
			//int count = str.charAt(i+1);
			
			
			
			for(int j=0;j<count;j++) {
			
			sb.append(ch);
			}
			
		}
		
		System.out.println(sb.toString());
		
		
		
		
		
		
		
	}

	
	
	
	
	

}
