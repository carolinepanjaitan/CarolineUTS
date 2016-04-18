package nilaiminmax;

import java.util.Scanner;

public class NilaiMinMax {

	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);
		System.out.print("Masukan bilangan 1 = ");
		bil1 = masukan.nextInt();
		System.out.print("Masukan bilangan 2 = ");
		bil2 = masukan.nextInt();
		System.out.print("Masukan bilangan 3 = ");
		bil3 = masukan.nextInt();
		System.out.println();

		System.out.println("Jumlah bil1+bil2 = "+(jumlah(bil1,bil2)));
		System.out.println("Jumlah bil2+bil3 = "+(jumlah(bil2,bil3)));
		System.out.println("Jumlah bil1+bil3 = "+(jumlah(bil1,bil3)));

		String max="";
		String min="";

		max = (jumlah(bil1,bil2))>=(jumlah(bil2,bil3))?""+(jumlah(bil1,bil2)):(jumlah(bil2,bil3)>=bil3)?""+(jumlah(bil2,bil3)):""+(jumlah(bil1,bil3));
		min = (jumlah(bil1,bil2))<=(jumlah(bil2,bil3))?""+(jumlah(bil1,bil2)):(jumlah(bil2,bil3)<=bil3)?""+(jumlah(bil2,bil3)):""+(jumlah(bil1,bil3));

		System.out.println();
		System.out.println("Mencari Nilai Terbesar");
		System.out.println("Bilangan 1 = "+(jumlah(bil1,bil2)));
		System.out.println("Bilangan 2 = "+(jumlah(bil2,bil3)));
		System.out.println("Bilangan 3 = "+(jumlah(bil1,bil3)));
		System.out.println();
		System.out.println("Nilai Max adalah = "+max);
		System.out.println("Nilai Min adalah = "+min);
	}

	private static int jumlah(int a, int b) {

		int hasil = a + b;
		return hasil;
	}
}