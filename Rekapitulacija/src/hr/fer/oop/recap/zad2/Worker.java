package hr.fer.oop.recap.zad2;

public abstract class Worker implements SalaryCalculator {
	protected String name;
	protected String bankNumber;
	
	public Worker(String name,String bN) {
		this.name=name;
		this.bankNumber=bN;
	}
	public String getName() {
		return name;
	}
	public String getBankNumber() {
		return bankNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setBankNumber(String bN) {
		this.bankNumber=bN;
	}
}
