package ticket.tickets;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {
    private final BigDecimal value;
    private final Currency currency;
    private final BigDecimal taxValue;

    public Price(BigDecimal value, Currency currency, BigDecimal taxValue) {
        this.value = value;
        this.currency = currency;
        this.taxValue = taxValue;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getTaxValue() {
        return taxValue;
    }
}
