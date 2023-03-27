package encaptulationjava;

public class Bank {

	public int accNo = 1387608460;
	public int pinNo = 12374548;
	public int balance = 500500;

	public void withdrawlMony(int ac, int pin, int amount) {

		if (ac == accNo && pin == pinNo) {
			if (amount <= balance) {
				balance = balance - amount;

				System.out.println(amount + " Amount is withdrown.Current Balance is " + balance);

			} else {

				System.out.println("Insufficiant balance");
			}

		} else {

			System.out.println("In valid cradientials");
		}

	}

	public void updatePin(int ac, int oldPin, int newPin) {

		if (ac == accNo && oldPin == pinNo) {

			pinNo = newPin;

			System.out.println("Pin is updated,you are secured");

		} else {

			System.out.println("Invalid cradentials");

		}

	}

}