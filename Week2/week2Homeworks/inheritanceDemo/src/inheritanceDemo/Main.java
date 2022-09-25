package inheritanceDemo;

public class Main {

	public static void main(String[] args) {

		// In this project, we can pas argument both agricaltural & lecturer loans.
		// Because in loanUI, we decided that parameter is baseLoanManager and both
		// loans extends from it.

		LoanUI loanUI = new LoanUI();
		loanUI.loanCalculate(new AgriculturalLoanManager());

	}

}
