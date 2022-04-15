package ticket.tickets;

public class Ticket {
    private final TicketId id;
    private final Price price;
    private final String label;
    private final String conditions;
    private final String description;

    public Ticket(TicketId id, Price price, String label, String conditions, String description) {
        this.id = id;
        this.price = price;
        this.label = label;
        this.conditions = conditions;
        this.description = description;
    }

    public TicketId getId() {
        return id;
    }

    public Price getPrice() {
        return price;
    }

    public String getLabel() {
        return label;
    }

    public String getConditions() {
        return conditions;
    }

    public String getDescription() {
        return description;
    }
}
