package superNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Süper-Mükemmel sayiyi bulma...
		//Mükemmel sayi: Kendisi hariç pozitif tam bölenlerinin toplami kendisine esit olan sayi mükemmel sayidir.
		//6-> 1,2,3
		//28->1,2,4,7,14
		
		Scanner scan = new Scanner(System.in);
		int total=0;//toplam
		System.out.print("Bir sayi giriniz= ");
		int number = scan.nextInt();//sayi
		for (int i = 1; i < number; i++) {
			if (number %i == 0) {
				total = total + i;//toplam+=i
			}
		}
		if (total == number) {
			System.out.println("Girdiginiz sayi Süper Sayidir");
		}
		else {
			System.out.println("Girdiginiz sayi Süper Sayi Degildir");
		}
	}

}
