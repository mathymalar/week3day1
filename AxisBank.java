package week3.day1;

public class AxisBank extends BankInfo {
	@Override
	public void deposit() {
		System.out.println("RD Deposit");
	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
		
		BankInfo bi = new BankInfo();
		bi.deposit();

	}

}
