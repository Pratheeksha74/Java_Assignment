package day3;

public class Array2 {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{1,2,3},{4,5},{6,7,8,9},{1}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===========================================");
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}


