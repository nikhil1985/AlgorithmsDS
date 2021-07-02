
public class BubbleSort {

	public static void main(String[] args) {
		int[] values = {3,23,1,45,62,6,4,5};
		for(int value:bubbleSort(values)) {
			System.out.print(value +" ");
		}
	}
	
	public static int[] bubbleSort(int ...values) {
		
		for(int i=0;i<=values.length;i++) {
			int temp;
			for(int j=i+1;j<values.length;j++) {
				if(values[i] > values[j]) {
					temp = values[i];
					values[i]=values[j];
					values[j]=temp;
				}
			}
		}
		return values;
		
		
	}
}
