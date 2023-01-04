package atmmachineproject;

import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		//AtmOperationInterface op = new AtmOperationImpl();
		//AtmOperationImpl op = new AtmOperationImpl();
		AtmOperationImpl op = new AtmOperationImpl();
		AtmOperationImpl op1 = new AtmOperationImpl();
		int atmnumber = 9876;
		int atmpin = 123;
		Scanner in = new Scanner(System.in);
		System.out.println(" !!! WelCome To ATM !!!");
		System.out.print("Enter ATM Number :  ");
		int atmNumber = in.nextInt();
		System.out.print("Enter Pin : ");
		int pin = in.nextInt();
		if ((atmnumber==atmNumber)&&(atmpin==pin)) {
			while(true) {
				System.out.println("1.View Available Balance \n2.WithDraw Amount "
						+ "\n3.Deposit Amount \n4.View MiniStateMent \n5.Exit ");
				/*System.out.println("1.View Available Balance");
				System.out.println("2.WithDraw Amount");
				System.out.println("3.Deposit Amount");
				System.out.println("4.View MiniStateMent");
				System.out.println("5.Exit");
				System.out.println();*/
				int ch = in.nextInt();
				if(ch==1) {
					op1.viewBalance();
				}
				else if (ch==2){
					System.out.println("Enter Amount To WithDraw");
					double withdrawAmount = in.nextDouble();
					op1.withDrawAmount(withdrawAmount);
				}
				else if (ch==3) {
					System.out.println("Enter Depositing Amount");
					double depositAmount = in.nextDouble();//5000
					op1.depositAmount(depositAmount);
				}
				else if (ch==4) {
					op1.viewMiniStatement();
				}
				else if (ch==5) {
					System.out.print("Collect Your ATM Card \n Thank you for visiting");
					System.exit(0);
				}
				else{
					System.out.println("Please Enter Correct Choice ");
					}
				}
			}
				else {
					System.out.println("Incorrect ATM Number or Pin");
					System.exit(0);
			}
		}
}
