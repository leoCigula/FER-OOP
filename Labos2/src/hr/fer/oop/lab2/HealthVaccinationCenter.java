package hr.fer.oop.lab2;

public class HealthVaccinationCenter extends HealthCenter implements VaccinationCenter{

	private int vaccinatedPatients;
	
	public HealthVaccinationCenter() {
		
	}
	public HealthVaccinationCenter(String name,String address,int registeredPatients) {
		super(name,address,registeredPatients);
		this.vaccinatedPatients=0;
	}
		
	public void vaccinate(int numberOfPatients) {
		vaccinatedPatients+=numberOfPatients;
		
	}

	public int getVaccinatedPatients() {
		return vaccinatedPatients;
	}

	public int getNotVaccinatedPatients() {
		// TODO Auto-generated method stub
		return getRegisteredPatients()-vaccinatedPatients;
	}
	@Override
	public String toString() {
		return String.format("HealthVaccinationCenter [name=%s, address=%s, registered patients=%d, vaccinated patients=%d]",getName(),getAddress(),getRegisteredPatients(),vaccinatedPatients);
	}
	
}
