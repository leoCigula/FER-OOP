package hr.fer.oop.recap.zad2;

public class HourBasedWorker extends Worker {

	private static final double MONTHLY_WORKING_HOURS = 160;
	private static final double OVERTIME_FACTOR = 1.2;
	private double workingHours;
	private double salaryPerHour;
	
	public HourBasedWorker(String name,String bankNumber,double salary) {
		super(name,bankNumber);
		this.salaryPerHour=salary;
	}

	 
	public double getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}


	@Override
	public void paySalary(BankManager bm) {
		double payment;
		if(workingHours<=MONTHLY_WORKING_HOURS) {
			payment=salaryPerHour*workingHours;
		}else {
			payment=MONTHLY_WORKING_HOURS*salaryPerHour + (workingHours-MONTHLY_WORKING_HOURS)*salaryPerHour*OVERTIME_FACTOR;
		}
		bm.payment(this,payment );
		
	}
}
