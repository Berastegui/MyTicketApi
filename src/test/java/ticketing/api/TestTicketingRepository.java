package ticketing.api;

import metadata.tickets.TicketFromMetadata;
import ticket.tickets.Price;
import ticket.tickets.TicketId;
import ticketing.tickets.TicketFromTicketing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class TestTicketingRepository implements TicketingTicketRepository {
    @Override
    public List<TicketFromTicketing> listTickets() {
        List<TicketFromTicketing> ticketList = new ArrayList<>();
        ticketList.add(getTicketGaulois());
        ticketList.add(getTicketFute());
        ticketList.add(getTicketLiberte());
        return ticketList;
    }

    @Override
    public TicketFromTicketing getTicket(TicketId id) {
        List<TicketFromTicketing> ticketList = listTickets();
        for(TicketFromTicketing ticket: ticketList) {
            if (ticket.getId().equals(id)) return ticket;
        }
        return null;
    }

    public TicketFromTicketing getTicketGaulois() {
        TicketId id = new TicketId("GAULOIS");
        BigDecimal priceValue = new BigDecimal(40);
        BigDecimal taxValue = new BigDecimal(4);
        Price price = new Price(priceValue, Currency.getInstance("EUR"), taxValue);
        return new TicketFromTicketing(id, price);
    }

    public TicketFromTicketing getTicketFute() {
        TicketId id = new TicketId("FUTE");
        BigDecimal priceValue = new BigDecimal(50);
        BigDecimal taxValue = new BigDecimal(5);
        Price price = new Price(priceValue, Currency.getInstance("EUR"), taxValue);
        return new TicketFromTicketing(id, price);
    }

    public TicketFromTicketing getTicketLiberte() {
        TicketId id = new TicketId("LIBERTE");
        BigDecimal priceValue = new BigDecimal(60);
        BigDecimal taxValue = new BigDecimal(6);
        Price price = new Price(priceValue, Currency.getInstance("EUR"), taxValue);
        return new TicketFromTicketing(id, price);
    }
}
