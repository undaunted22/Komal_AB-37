package practice;
	public class Arr1 {
		public static void main(String[] args) {
			String s1 = "komal22";
			char c1[] = s1.toCharArray();

			for (int i = 0; i < s1.length(); i++) {
				boolean answer = Character.isDigit(c1[i]);

				if (answer == true) {
					System.out.println(c1[i] + " is a digit: " + answer);
				} else {
					System.out.println(c1[i] + " is a char: " + answer);
				}
			}
		}
	}


