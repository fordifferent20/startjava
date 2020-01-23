public class Cycle {
	public static void main(String[] args) {
		for(int i = 0;i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println(" ");

		int i = 6; 
		while(i >= -6) {
			System.out.println(i);
			i-=2;
		}
		System.out.println(" ");
		
		int start = 10;
		int result = 0;
		do {
			start = start + 1;
			if(start % 2 == 1) {
			result = result + start;
			}
		} while(start < 20);
		System.out.println("Summ = " + result);
	}
}