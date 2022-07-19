package javaprogram;

public class PallindramProgramInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=2332;
		String st= String.valueOf(s);
		System.out.println(st);
}
	public static String rev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
