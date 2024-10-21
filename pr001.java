class pr001 {
	public static void main (String args[]){
		System.out.println("Первая");
		//переобразование типов
		//Целые типы
		byte b; //8 bit
		b = -128;
		b = 127;
		b = (byte)256;
		short sn; //16 bit
		sn =  (short)65536;
		int in; //32 bit
		long l; //64 bit
		in = 200000000;
		l = in;
		in = in * in * in;
		System.out.println(in);
		l = l * l * l;
		System.out.println(l);
		//Веществиные
		float f; //32 bit
		double dd; //64 bit
		//символьный
		char ch; //16 bit
		ch = 'A';
		ch++; ++ch;
		for (int i = 0; i<68; i++)
                	System.out.print(ch++ + " ");
                System.out.println();	
		//Логический 
		boolean bool;
	  	bool = true;
		bool = false;


	} 
}	
