package javaprogram;

public class FirstMaximumBubbleSiort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {45,5,56,89,121,460};
		for(int j=0; j<arr.length;j++) {
		for(int i=1; i<arr.length-j;i++) {
			if(arr[i-1]>arr[i]) {
			int temp=arr[i-1];
			arr[i-1]=arr[i];
			arr[i]=temp;
		
			 }
			}
	      }
		System.out.print(arr[arr.length-1]);
		}
	}
