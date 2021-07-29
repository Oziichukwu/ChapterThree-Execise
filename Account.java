public class Account{

private String accountName;

private int balance;


	public void setAccountName(String accountName) {

		this.accountName = accountName;

	}


	public String getAccountName() {

		return accountName;

	}

		public void setbalance(int balance) {

			this.balance = balance;

	}


		public void setdeposit( int deposit){

					if ( deposit > 0 )
				balance = balance + deposit;

					else

					System.out.println("Enter a valid deposit");
		}

			public void setWithdrawal( int withdrawal){

				balance = balance - withdrawal;
			}


		public int getBalance() {


			return balance;

		}	


	}

	


