package id.ac.unpas.kakas;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pilih Menu");
		int menu = 0;
		menu = sc.nextInt();
		int n1 , n2 ;
		int total = 0;
		System.out.println("Masukan Variabel 1");
		n1 = sc.nextInt();
		System.out.println("Masukan Variabel 1");
		n2 = sc.nextInt();
		hitung hi = new hitung();
		switch (menu) {
		case 1:
			total = hi.tambah(n1, n2);
			System.out.println(total);
		break;
		case 2:
			total = hi.kurang(n1, n2);
			System.out.println(total);
		break;
		case 3:
			total = hi.kali(n1, n2);
			System.out.println(total);
		break;
		case 4:
			total = hi.bagi(n1, n2);
			System.out.println(total);
		break;

		default:
			break;
		}

	}
	
}
