package superNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//S�per-M�kemmel sayiyi bulma...
		//M�kemmel sayi: Kendisi hari� pozitif tam b�lenlerinin toplami kendisine esit olan sayi m�kemmel sayidir.
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
			System.out.println("Girdiginiz sayi S�per Sayidir");
		}
		else {
			System.out.println("Girdiginiz sayi S�per Sayi Degildir");
		}
	}

}
