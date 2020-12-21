package firstPackage;
import java.util.*;
public class TwoPointerAlgorithm {
	
	public static void main(String[] args) {
		
		int array[] = {2,3,5,4,1,7,9,8,6,10};
		int n = array.length;
		int sum = 10;
		Arrays.sort(array);
		
		System.out.print("The number of pairs in the array is : ");
		System.out.print(findPairs(array,n,sum));
	}
	
	static int findPairs(int a[], int n, int x) {
		
		int i = 0;
		int j = n-1;
		int totalPairs= 0;
		
		while(i<j) {
			if(a[i]+a[j] == x) {
				tp++;
				i++;
			}
			else if(a[i]+a[j] < x) i++;
			else j--;
			
		}
		
		return totalPiars;
	}

}
