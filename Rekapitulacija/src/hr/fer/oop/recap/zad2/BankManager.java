package hr.fer.oop.recap.zad2;

public class BankManager {
	public BankManager() {
		
	}
	public void payment(Worker w,double pay) {
		String ispis=String.format("%s - %s: %.2f", w.name,w.bankNumber,pay);
		System.out.println(ispis);
	}
}
