package hr.fer.oop.recap.zad2;

public class Salesman extends Worker {
	private static final double Salary_percent = 0.01;
	private double turnover;
	private double minSalary;
	
	public Salesman(String name,String bankNumber,double minSalary) {
		super(name,bankNumber);
		this.minSalary=minSalary;
	}
	
	public double getTurnover() {
		return turnover;
	}
	public void setTurnover(double turnover) {
		this.turnover=turnover;
	}
	
	@Override
	public void paySalary(BankManager bm) {
		double pay;
		pay=minSalary+getTurnover()*Salary_percent;
		bm.payment(this, pay);
	}
	

}
