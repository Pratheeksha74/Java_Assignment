package Lab;

public class Lab_3_4 {
	static int modifyNumber(int num) {
		String s = Integer.toString(num);
		char a,b;
		int j = 0;
		System.out.println("hi");
		StringBuffer str = new StringBuffer();
		for(int i=0;i<s.length()-1;i++) {
			a = s.charAt(i);
			b = s.charAt(i+1);
			str.append(Math.abs(a-b));
		}
		str.append(s.charAt(s.length()-1));
		num = Integer.parseInt(str.toString());
		return num;
	}
	public static void main(String[] args) {
		int num = 875532;
		System.out.println((modifyNumber(num)));
	
	}

}
