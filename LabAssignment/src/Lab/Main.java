package Lab;


interface Largest {
	int findLargest(int a,int b,int c);
}

public class Main {

	public static void main(String[] args) {
		Largest l = (x,y,z)->{
			if (x >= y && x >= z)  
	            return x;  
	        else if (y >= x && y >= z) 
	            return y; 
	  
	        else	  
	            return z;
		};
		System.out.println(l.findLargest(1,2,3));

	}

}
