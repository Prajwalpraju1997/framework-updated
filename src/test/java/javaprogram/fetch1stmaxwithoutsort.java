package javaprogram;

public class fetch1stmaxwithoutsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrString= {"hello", "good", "mandya23", "mysore"};
		int max=arrString[0].length();
		String maxlength="";
		for(int i=1; i<arrString.length;i++) {
			
			if(arrString[i].length()>max) {
				max=arrString[i].length();
				maxlength=arrString[i];
			}
		}
		System.out.println(maxlength);
	}
}
