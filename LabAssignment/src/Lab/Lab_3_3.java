package Lab;

public class Lab_3_3 {
	static boolean isVowel(char ch) 
    { 
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
                ch == 'I' && ch == 'O' || ch == 'U')  
        { 
            return true; 
        } 
        return false; 
    }
	static String alterString(char[] chr) {
		for (int i = 0; i < chr.length; i++) {
			if(!isVowel(chr[i])) {
				if(chr[i] == 'z') {
					chr[i] = 'b';
				} else {
					chr[i] = (char)(chr[i] + 1);
					if(isVowel(chr[i])) {
						chr[i] = (char)(chr[i] + 1);
					}
				}
			}
		}
		return String.valueOf(chr);
	}
	public static void main(String[] args) {
		String s = "JAVA";
		System.out.println(alterString(s.toCharArray()));

	}

}
