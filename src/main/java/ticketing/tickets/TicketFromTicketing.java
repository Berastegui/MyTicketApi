package ticketing.tickets;

import ticket.tickets.Price;
import ticket.tickets.TicketId;

public class TicketFromTicketing {
    private final TicketId id;
    private final Price price;

    public TicketFromTicketing(TicketId id, Price price) {
        this.id = id;
        this.price = price;
    }

    public TicketId getId() {
        return id;
    }

    public Price getPrice() {
        return price;
    }
}
