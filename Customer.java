package bank;

import java.util.Scanner;

abstract class Bank{
	public String name="Dbank";
	public String IFSC="Dbank786";
	
	public void AboutDBank()
	{
		System.out.println("Bank_Name: "+name+"\nBank_IFSC_Code: "+IFSC);
	}
	abstract void Deposit();
	abstract void Withdraw();
	abstract void CheckBalance();
}

class BankService extends Bank{
	private double bal=100;
	private int pwd;
	private double money;
	
	@Override
	public void Deposit()
	{
		System.out.print("Please enter your password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==786)
		{
			System.out.print("Please enter money to deposit: ");
			money=s.nextInt();
			bal=bal+money;
			System.out.println("Money deposited successfully: "+money);
			System.out.println("Total Balance: "+bal);
		}
		else {
			System.out.println("Incorrect Password....!");
		}
	}
	
	@Override
	public void Withdraw()
	{
		System.out.print("Please enter your password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==786)
		{
			System.out.print("Please enter money to withdraw: ");
			money=s.nextInt();
			bal=bal-money;
			System.out.println("Money Withdraw successfull: "+money);
			System.out.println("Total Balance: "+bal);
		}
		else {
			System.out.println("Incorrect Password....!");
		}
	}
	
	@Override
	public void CheckBalance() {
		System.out.print("Please enter your password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==786) {
			System.out.println("Total Balance: "+bal);
		}
		else {
			System.out.println("Incorrect Password.....!");
		}
	}
}

public class Customer {
	public static void main(String[] args) {
		BankService b=new BankService();
		b.AboutDBank();
		
		System.out.println("1. Deposit");
		System.out.println("1. Withdraw");
		System.out.println("1. Check Balance");
		
		System.out.print("Please Enter Your Choice: ");
		
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:b.Deposit();
		break;
		case 2:b.Withdraw();
		break;
		case 3:b.CheckBalance();
		break;
		default:System.out.println("Invalid Choice....!");
		break;
		}
	}
}




