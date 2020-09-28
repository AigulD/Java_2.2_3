public class CreditPaymentService {
    public double calculate(double creditTerm, double loanAmount, double annualRate) {
        double annualIntRate = annualRate/100/12;
        double annuityRate = (annualIntRate * Math.pow(1+annualIntRate, creditTerm)/(Math.pow(1+annualIntRate,creditTerm)-1));
        double monthlyLoanPayment = loanAmount * annuityRate;

        return loanAmount * annuityRate;
    }
}
