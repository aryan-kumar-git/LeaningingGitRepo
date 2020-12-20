package firstPackage;
import java.util.Scanner;
public class RotatingArray {

	
	static void rotateArray(int arr[], int n, int d) {
		
		int temp[] = new int[d];
		
		for(int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		
		for(int i = d; i < n; i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i = 0; i < d; i++){
			arr[i+n-d] = temp[i];
		}
		
		for(int s : arr) {
			System.out.print(s + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers do you want in your array : ");
		int n = sc.nextInt();
		
		System.out.print("From which number do you want to rotate you array : ");
		int r = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		rotateArray(arr,n,r);
	}

}


