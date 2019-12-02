package id.ac.unpas.kakas;

import java.util.Scanner;

public class hitung {
	
	
	public static int tambah()
	    {
			Scanner sc = new Scanner(System.in);

			int n1 =  sc.nextInt();
			int n2 =  sc.nextInt();
			
	        int hasil = n1 + n2;
	        return hasil;
	    }
	  
	public static int kurang()
	    {
			Scanner sc = new Scanner(System.in);
	
			int n1 =  sc.nextInt();
			int n2 =  sc.nextInt();
			
	        int hasil = n1-n2;
	        return hasil;
	    }
	
}
