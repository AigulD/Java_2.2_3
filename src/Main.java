public class Main {
    public static void main(String[] args) {
        double annualRate = 9.99;
        double creditTerm1Year = 12;
        double creditTerm2Years = 24;
        double creditTerm3Years = 36;
        double loanAmount = 1_000_000;

        CreditPaymentService service = new CreditPaymentService();

        double monthlyLoanPayment1Y = service.calculate(creditTerm1Year, loanAmount, annualRate);
        System.out.printf("При сроке кредита 1 год, ежемесячный платеж: %.0f",monthlyLoanPayment1Y);

        double monthlyLoanPayment2Y = service.calculate(creditTerm2Years, loanAmount, annualRate);
        System.out.printf("\nПри сроке кредита 2 года, ежемесячный платеж: %.0f",monthlyLoanPayment2Y);

        double monthlyLoanPayment3Y = service.calculate(creditTerm3Years, loanAmount, annualRate);
        System.out.printf("\nПри сроке кредита 3 года, ежемесячный платеж: %.0f",monthlyLoanPayment3Y);
    }
}
