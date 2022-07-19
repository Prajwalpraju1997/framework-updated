package javaprogram;

public class BubbleSortAsendingOrder {

	public static void main(String[] args) {

		int[] arr= {45,5,56,89,121,460,777};
		for(int j=0; j<arr.length;j++) {
			for(int i=1; i<arr.length;i++) {
				if(arr[i-1]>arr[i]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}			
			}
		} //
		for(int data:arr)
		{
			System.out.print(data+" ");
		}
	}
}
