public class SavingsBond {
    private double initialDeposit;
    private int termInMonths;
    private double annualInterestRate;

    public SavingsBond(double initialDeposit, int months) {
    	this.initialDeposit = initialDeposit;
        setTermInMonths(months);
    }

    public void setTermInMonths(int months) {
        this.termInMonths = months;
        this.annualInterestRate = calculateAnnualInterestRate();
    }
   
    public double calculateFutureValue(){
        double totalAmount = initialDeposit;
        for (int i = 0; i < termInMonths; i++) {
            double monthlyInterest = totalAmount * annualInterestRate;
            totalAmount += monthlyInterest; 
        }
        return totalAmount;
    }

    private double calculateAnnualInterestRate() {
        if (termInMonths >= 0 && termInMonths <= 11) {
            return 0.005;
        } else if (termInMonths >= 12 && termInMonths <= 23) {
            return 0.01;
        } else if (termInMonths >= 24 && termInMonths <= 35) {
            return 0.015;
        } else if (termInMonths >= 36 && termInMonths <= 47) {
            return 0.02;
        } else if (termInMonths >= 48 && termInMonths <= 60) {
            return 0.025;
        } else {
            throw new IllegalArgumentException("Jangka waktu harus antara 1 hingga 60 bulan");
        }
    }

    public double calculateInterest() {
        return annualInterestRate / 100 * termInMonths / 12;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
}
