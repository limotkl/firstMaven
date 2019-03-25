package firstMaven;
import java.util.Scanner;

public class Bank {
	
	private String accountnumber = "123456789";
	private float balance = 50;
	private String customername = "Fang";
	private String email = "limotkl@gmail.com";
	private String phonenumber = "9293971317";
	private Scanner sc = new Scanner(System.in);
	
	public void deposit() {
		int flag = 0;
		float money = 0;
		while (flag == 0){
			try{
				System.out.print("Amount of Money(Deposit):");
				money = sc.nextFloat();
				if (money < 0)
					System.out.println("Please give correct number");
				else
					flag = 1;
			}catch(Exception e){
				sc.nextLine();//flush
				System.out.println("Please give correct number");
			}
		}
		balance += money;
		System.out.println("New Balance:" + balance);
		
	}
	
	public void withdraw(){
		int flag = 0;
		float money = 0;
		while (flag == 0){
			try{
				System.out.print("Amount of Money(Withdraw):");
				money = sc.nextFloat();
				if (money < 0)
					System.out.println("Please give correct number");
				else
					flag = 1;
			}catch(Exception e){
				sc.nextLine();//flush
				System.out.println("Please give correct number");
			}
		}
		
		if (money > balance){
			System.out.println("Failed! Balance:"+customername+balance);
		}
		else{
			balance-=money;
			System.out.println("Withdraw Success! Balance:" + balance);
		}
	}
	
	public void info(){
		System.out.println("Customer Name" + customername);
		System.out.println("Account Number" + accountnumber);
		System.out.println("Balance" + balance);
		System.out.println("Email" + email);
		System.out.println("Phone Number" + phonenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank Fang = new Bank();
		Fang.deposit();
		Fang.withdraw();
		Fang.info();
	}

}
