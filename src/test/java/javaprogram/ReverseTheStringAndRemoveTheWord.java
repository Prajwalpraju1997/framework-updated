package javaprogram;

public class ReverseTheStringAndRemoveTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String s="Welcome to Mandya";
			String[] arr=s.split(" ");
			for(int i=arr.length-1; i>=0; i--)
			{
				//if(i%2==0)
				System.out.println(rev(arr[i]));
				//System.out.println("");		
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