package First;

public class Sort {
	public static void main(String args[]) {
		/* Linked List Declaration */
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++)
			arr[i] = i;
		for(int i = arr.length-1; i >=0; i--)
			System.out.println(arr[i]);
	}
}
