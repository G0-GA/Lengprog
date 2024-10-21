class pr001 {
        public static void main (String args[])
			throws java.io.IOException {
		int ing = 10, inr = 20;
		char ch, an = 'R';
		System.out.println("попробуй угадать символ");
		ch = (char) System.in.read();
		if (ch == an)
			System.out.println("Угадали букву");
		else {
			System.out.print("Нужная буква по алфавиту");
			if (ch < an)
				System.out.println("выше");
			else
                                System.out.println("ниже");
			
		}
		boolean bool = true;
		for(int i=0; i<10; i++)
			switch(i){
				case 0:
					System.out.println("i = 0");
					break;
                                case 1:
                                        System.out.println("i = 1");
                                        break;
                                case 2:
                                        System.out.println("i = 2");
                                        break;
                                case 3:
                                        System.out.println("i = 3");
                                        break;
                                case 4:
                                        System.out.println("i = 4");
                                        break;
				default:
					System.out.println("i = 5 или больше 5");
			}
		if (bool)
			System.out.println("Bool = true");
		else 
			System.out.println("Bool = false");

	}
}
