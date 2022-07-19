package javaprogram;

public class BubbleSortSumOfTheNum {

	public static void main(String[] args) {
		
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
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}