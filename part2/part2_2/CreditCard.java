package part2.part2_2;

public record CreditCard(String cardNumber, String holder) implements PaymentMethod {

    @Override
    public String process(double amount) {
        String last4 = getLastFourDigits(cardNumber);
        return String.format("Оплата картой *%s: %.0f руб.", last4, amount);
    }

    @Override
    public double fee(double amount) {
        return amount * 0.02; // 2% комиссия
    }

    private String getLastFourDigits(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 4) {
            return "XXXX";
        }
        return cardNumber.substring(cardNumber.length() - 4);
    }
}
