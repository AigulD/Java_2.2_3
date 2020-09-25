public class CreditPaymentService {
    public double calculate(int loanAmount, int numberOfMonths, double interestRate) {
        double periodicIntRate = interestRate / 12 / 100;
        double annuityRate = (periodicIntRate * Math.pow(1+periodicIntRate, numberOfMonths*12)/(Math.pow(1+periodicIntRate,numberOfMonths*12)-1));
        double monthlyLoanPayment = loanAmount * annuityRate;
        return loanAmount * annuityRate;
    }
}
