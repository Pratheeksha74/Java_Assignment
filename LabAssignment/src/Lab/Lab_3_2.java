package Lab;

public class Lab_3_2 {
	public String getImage(String str) {
		String s = "";
		StringBuffer sb = new StringBuffer(str);
		s = sb.reverse().toString();
		return s;
	}
	public static void main(String[] args) {
		String s = "Earth";
		Lab_3_2 obj = new Lab_3_2();
		System.out.println(s+"|"+obj.getImage(s));
		
	}

}
