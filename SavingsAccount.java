package fourthlabexerciseone;

public class SavingsAccount extends AccountAbstract {
		final double minbal = 500;
		double bal = getBalance();
		public SavingsAccount(long accNum, double balance, Person accHolder) {
			super(accNum, balance, accHolder);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void deposit(double amount) {
			
			bal+=amount;
			System.out.println("Balance updated :"+bal);
		}

		@Override
		public void withdraw(double amount) {
			if(bal - amount<minbal){
				System.out.println("Ammount cannot be withdrawn due to minimum balance issue");
			}
			else{
				bal-=amount;
			}
		}
	
	}


