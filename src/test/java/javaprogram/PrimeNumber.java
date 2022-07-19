package javaprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=23;
		boolean flag = false; 
		for(int i=2; i<a; i++) {
			if(a%1==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("The given number is prime");
		}
		else {
			System.out.println("The given number is non-prime");
		}

	}

}
