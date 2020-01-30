public class Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		if(a + b  == 15) {
			System.out.println("10 + 5 = 15");
			System.out.println("");
		}
		if(a - b == 5) {
			System.out.println("10 - 5 = 5");
			System.out.println("");
		}
		if(a * b  == 50) {
			System.out.println("10 * 5 = 50");
			System.out.println("");
		}
		if(a / b  == 2) {
			System.out.println("10 / 5 = 2");
			System.out.println("");
		}
		if(Math.pow(a, b) == 100000) {
			System.out.println(Math.pow(a, b));
		}
		if(b % 2  == 0) {
			System.out.println("5 % 2 = 0"); // 10 без остатка делится на 2
			System.out.println("");
		} else {
			System.out.println("5 % 2 = 0 " + "- Incorrect value");
		}
	}

}