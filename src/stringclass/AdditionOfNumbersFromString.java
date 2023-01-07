package stringclass;

public class AdditionOfNumbersFromString {

	public static void main(String[] args) {
		String s = "32hfkjdshf3jkeh40jkdh50lkas50j";
		int flag = 0;
		String number = "";

		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				number = number + ch;
				flag = 1;
				if (i != (s.length() - 1)) {
					continue;
				}

			}

			if (flag == 1) {
				int value = Integer.parseInt(number);

				number = "";

				sum = value + sum;

				flag = 0;

			}

		}

		System.out.println("Total value is : " + sum);

	}

}
