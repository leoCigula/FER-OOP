package hr.fer.oop.labprip;

public class BankReceivingSystem implements ReceivingSystem{

		   private int urgentPeeps=0;
		   private int nonUrgent=0;
		   private boolean zauzet=false;
		   private int cnt=0;
		   
		   public BankReceivingSystem(){
		   }
		   
		    public void customerArrived(boolean urgent){
		    	if(urgent) urgentPeeps++;
		       else nonUrgent++;
		       cnt++;
		       calculateEmployeeStatus();
		    }
		   
		   public int getUrgentListSize(){
		      return urgentPeeps;
		   }
		   public int getNonUrgentListSize(){
		      return nonUrgent;
		   }
		   public void customerLeft(boolean urgent){
		    if(urgent)
		       urgentPeeps--;
		      else nonUrgent--;
		    zauzet=false;
		    calculateEmployeeStatus();
		   }
		   
		   public void calculateEmployeeStatus(){
		   	if(urgentPeeps>0 || nonUrgent>0)
		         zauzet=true;
		   }
		   public boolean isEmployeeOccupied(){
		      return zauzet;
		   }
		   public int getNumberOfArrivedCustomers(){
		   	return cnt;
		   }

}
