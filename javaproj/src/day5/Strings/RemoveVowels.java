package day5.Strings;

public class RemoveVowels {

	public static void main(String[] args) {
		String s = "Pratheeksha";
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a'|| s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || 
					s.charAt(i) == 'u') {
				continue;
			} else {
				System.out.print(s.charAt(i));
			}
		}

	}

}
