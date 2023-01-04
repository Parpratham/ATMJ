package atmmachineproject;

import java.util.HashMap;
import java.util.Map;
public class AtmOperationImpl  {//implements AtmOperationInterface
	ATM atm = new ATM();
	Map<Double,String> ministatment = new HashMap<>();
	
	//@Override
	public void viewBalance(){
		System.out.println("Available Balance is : " + atm.getBalance());
	}
	//@Override
	public void withDrawAmount(double withdrawAmount){
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()){
				ministatment.put(withdrawAmount,"Amount WIthdraw");
				System.out.println("collect the Cash" + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount );
				viewBalance();
			}
			else {
				System.out.println("InSufficient Balance !!");
			}
		}
		else {
			System.out.println("Please Enter The Amount In Multipal of 500");
		}
	}
	//@Override
	public void depositAmount(double deopositAmount){
		//ministatment.put(deopositAmount,"Amount Deposit");
		System.out.println(deopositAmount + " Deposited SucessFully !!");
		atm.setBalance(atm.getBalance() + deopositAmount);
		viewBalance();
	}
	//@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m:ministatment.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
}
