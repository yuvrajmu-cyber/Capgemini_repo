package PracticePrograms;

public class aabbbcccc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "aabbbcccc";
		StringBuilder sb = new StringBuilder();
		int count = 1;
		
		
		
		for (int i=1;i<str.length();i++) {
			
			
			if(str.charAt(i) == str.charAt(i-1)) {
				
				count++;
			}
			
			else {
				if(count>1) {
					
					
					sb.append(str.charAt(i-1)).append(count);
					
				}
			
			count=1;
		}
	}
		System.out.println(sb.toString());
		
		
		
		
		
	}

}
