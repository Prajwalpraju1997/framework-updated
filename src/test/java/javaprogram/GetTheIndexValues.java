package javaprogram;

public class GetTheIndexValues {

	public static void main(String[] args) {
		
		String s="Welcome to Mandya and enjoy the holiday";
		String[] arr=s.split(" ");
		for(int i=0; i<arr.length; i++)
		{
		if(!arr[i].equals("Welcome") || arr[i].equals(("to"))) {
		
			System.out.print(rev(arr[i]));
		}
		else 
		{
			System.out.print(arr[i]+"("+arr[i].length()+")");		
		}
		System.out.print(" ");
	}
	}

public static String rev(String s)
{
	String rev="";
	for(int i=s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);	
	}
	return rev;
}
}
