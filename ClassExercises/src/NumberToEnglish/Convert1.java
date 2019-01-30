package NumberToEnglish;

public class Convert1 {
	
	public void digitToWord(int number) {
		String answer = "";
		if (number >= 1000) {
			answer = ones(number / 1000) + " thousand ";
			number %= 1000;
		}
		if (number >= 100) {
			answer += ones(number / 100) + " hundred ";
			number %= 100;
		}
		if (number >= 20) {
			answer += ty((number / 10)* 10) + " ";
			number %= 10;
		}
		if (number < 20) {
			answer += ones(number);
		}
		System.out.println(answer);
	}
	
	private String ones(int number) {
		String word = "";
		switch(number) {
			case 1: word = "one"; break;
			case 2: word = "two"; break;
			case 3: word = "three"; break;
			case 4: word = "four"; break;
			case 5: word = "five"; break;
			case 6: word = "six"; break;
			case 7: word = "seven"; break;
			case 8: word = "eight"; break;
			case 9: word = "nine"; break;
			case 10: word = "ten"; break;
			case 11: word = "eleven"; break;
			case 12: word = "twelve"; break;
			case 13: word = "thirteen"; break;
			case 14: word = "fourteen"; break;
			case 15: word = "fifteen"; break;
			case 16: word = "sixteen"; break;
			case 17: word = "seventeen"; break;
			case 18: word = "eighteen"; break;
			case 19: word = "nineteen"; break;
		}
		return word;
	}
	
	private String ty(int number) {
		String word = "";
		switch (number) {
			case 20: word = "twenty"; break;
			case 30: word = "thirty"; break;
			case 40: word = "fourty"; break;
			case 50: word = "fifty"; break;
			case 60: word = "sixty"; break;
			case 70: word = "seventy"; break;
			case 80: word = "eighty"; break;
			case 90: word = "ninety"; break;
		}
		return word;
	}
	
	public static void main(String[] args) {
		Convert1 conv = new Convert1();
		conv.digitToWord(9999);
	}
}
