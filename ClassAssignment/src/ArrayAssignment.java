
public class ArrayAssignment {
	static int a[] = {1,2,5,9,4};
	static int TotalSum() {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static int OddSum() {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 == 0) {
				continue;
			}
			sum += a[i];
		}
		return sum;
	}
	
	static int EvenSum() {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] % 2 != 0) {
				continue;
			}
			sum += a[i];
		}
		return sum;
	}
	
	static void Sort() {
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j+1] < a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Total Sum is: "+TotalSum());
		System.out.println("Sum of Odd elements: "+OddSum());
		System.out.println("Sum of even elements: "+EvenSum());
		System.out.println("The sorted Array");
		Sort();

	}

}
