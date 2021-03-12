
public class EndRepeatString {
		String repeatEnd(String str, int n) {
		String s = "";
		for(int i=0;i<n;i++) {
			s += str.substring(str.length()-n);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mynameis";
		EndRepeatString ers = new EndRepeatString();
		System.out.println(ers.repeatEnd(s, 3));
	}

}
