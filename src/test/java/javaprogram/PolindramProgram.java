package javaprogram;

public class PolindramProgram {

	public static void main(String[] args) {

		String s="CIVIC";
		String rev=rev(s);
		if(s.equals(rev)) {
			System.out.println("given String is palindram");
		}
		else {
			System.out.println("given String is not palindram");
		}
	}
	public static String rev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}
