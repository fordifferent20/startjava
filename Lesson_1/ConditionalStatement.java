public class ConditionalStatement {
	public static void main(String[] args) {
		
		int Year = 30;
		if ( Year > 20 ) {
			System.out.println("Age over 20");
		}

		boolean isMale = true;
		if ( isMale == true ) {
			System.out.println("This is a man");
		}

		boolean isFamale = true;
		if ( isFamale == true ) {
			System.out.println("This is a woman");
		}

		float height = 1.90f;
		if ( height < 1.80 ) {
			System.out.println("Big gnome");
		}else{
			System.out.println("Little giant");
		}

		char firstletter = 'M';
		if ( firstletter == 'M') {
			System.out.println("This is Masha");
		}else if ( firstletter == 'S') {
			System.out.println("This is Sasha");
		}else{
			System.out.println("No Masha, no Sasha");
			
		}
	}
}