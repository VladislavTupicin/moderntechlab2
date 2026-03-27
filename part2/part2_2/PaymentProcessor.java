package part2.part2_2;

public class PaymentProcessor {

    public static void describe(PaymentMethod pm) {
        switch (pm) {
            case CreditCard cc -> {
                System.out.printf("  Тип: Банковская карта%n");
                System.out.printf("  Держатель: %s%n", cc.holder());
                System.out.printf("  Номер: ***%s%n", getLastFourDigits(cc.cardNumber()));
            }
            case BankTransfer bt -> {
                System.out.printf("  Тип: Банковский перевод%n");
                System.out.printf("  Банк: %s%n", bt.bankName());
                System.out.printf("  IBAN: %s%n", bt.iban());
            }
            case CryptoWallet cw -> {
                System.out.printf("  Тип: Криптовалютный кошелёк%n");
                System.out.printf("  Адрес: %s%n", truncateAddress(cw.address()));
                System.out.printf("  Валюта: %s%n", cw.currency());
            }
        }
    }

    private static String getLastFourDigits(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 4) {
            return "XXXX";
        }
        return cardNumber.substring(cardNumber.length() - 4);
    }

    private static String truncateAddress(String address) {
        if (address == null || address.length() <= 10) {
            return address;
        }
        return address.substring(0, 6) + "..." + address.substring(address.length() - 4);
    }
}
