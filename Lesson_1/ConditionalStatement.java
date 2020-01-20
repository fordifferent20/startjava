public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 30;
		if(age > 20) {
			System.out.println("Age over 20");
		}
		
		boolean isMale = false;
		if(isMale) {
			System.out.println("This is a man");
		}
		/*
		Вариант решения		
		} else if(isMale == false) {
			System.out.println("This is a woman");
		}
		*/
		if(!isMale) {
			System.out.println("This is a woman");
		}

		float height = 1.90f;
		if(height < 1.80) {
			System.out.println("Big gnome");
		} else {
			System.out.println("Little giant");
		}
		
		char firstLetterName = 'M';
		if(firstLetterName == 'M') {
			System.out.println("This is Masha");
		} else if(firstLetterName == 'S') {
			System.out.println("This is Sasha");
		} else {
			System.out.println("No Masha, no Sasha");
		}
	}
}