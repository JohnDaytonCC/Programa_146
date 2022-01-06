package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = input.nextInt();
			System.out.print("Holder: ");
			input.nextLine();
			String holder = input.nextLine();
			System.out.print("Initial balance: ");
			double balance = input.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = input.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			double amount = input.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println(account);
			
		}
		catch(DomainException e){
			System.out.println("Withdraw erro: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		input.close();
	}

}
