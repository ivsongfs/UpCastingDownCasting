package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "ivson", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Gomes", 0.0, 500.0);

		// UPCASTING
		Account acc1 = bacc; // Objeto da SubClasse sendo atribuido para um da
								// SuperClasse. Herança é uma relacao "É um"

		Account acc2 = new BusinessAccount(1003, "França", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1003, "Silva", 1000.0, 0.1);
		Account account = new SavingsAccount(3000, null, 100.0, 0.1);
		
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount account3 = (BusinessAccount)account2; Gera erro
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; Na hora do downcasting nem sempre vai da certo;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Emprestimo!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}
	}

}
