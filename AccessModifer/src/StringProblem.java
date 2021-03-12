
public class StringProblem {
	public String repeatFront(String str,int n) {
		StringBuffer sb = new StringBuffer(str);
		String s = "";
		while(n!=0) {
		for(int i=0;i<n;i++) {
			s += str.charAt(i);
		}
		n--;
		}
		return s;
	}
	public static void main(String[] args) {
		
		StringProblem sp = new StringProblem();
		String s = "Choccolate";
		String str = sp.repeatFront(s,4);
		System.out.println(str);
	}

}
