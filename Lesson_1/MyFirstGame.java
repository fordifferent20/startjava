public class MyFirstGame {
	public static void main(String[] args) {
		int valuePc = 59;
		int valueHuman = 0;
		do {			
			if( valueHuman > valuePc ) {
				System.out.println("Введенное Вами число больше того, что загадал компьютер");
			} else if( valueHuman < valuePc ) {
				System.out.println("Введенное Вами число меньше того, что загадал компьютер");
			} else
				System.out.println("Вы угадали");
			valueHuman = valueHuman + 1;				
		} while(valueHuman < valuePc);
			System.out.println("Число, которое загадал компьютер = " + valueHuman);
	}
}