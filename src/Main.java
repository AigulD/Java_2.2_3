public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyLoanPayment = service.calculate(1_000_000, 1,9.99);
        System.out.printf("При сроке кредита 1 год, ежемесячный платеж: %.0f",monthlyLoanPayment);

        monthlyLoanPayment = service.calculate(1_000_000, 2,9.99);
        System.out.printf("\nПри сроке кредита 2 года, ежемесячный платеж: %.0f",monthlyLoanPayment);

        monthlyLoanPayment = service.calculate(1_000_000,3,9.99);
        System.out.printf("\nПри сроке кредита 3 года, ежемесячный платеж: %.0f",monthlyLoanPayment);
    }
}
