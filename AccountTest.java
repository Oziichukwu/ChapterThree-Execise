public class AccountTest{

public static void main(String[] args) {


		
Account myAccount = new Account();


		myAccount.setAccountName("goodnew ukaegbu, chinionso precious");

		myAccount.setbalance(2000);

		myAccount.setdeposit(5000);

		myAccount.setdeposit(7000);

		myAccount.setWithdrawal(5000);

		myAccount.setdeposit(-2000);


	//String accountName = myAccount.getAccountName();


		//System.out.println("Account names are: " + myAccount.getAccountName());

		//System.out.println("my balance is: " + myAccount.getBalance());

		System.out.printf(" %d is your balance", myAccount.getBalance());


	}


}