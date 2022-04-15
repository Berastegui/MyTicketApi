package ticket.aggregator;

import metadata.api.MetadataTicketRepository;
import metadata.api.TestMetadataRepository;
import org.junit.jupiter.api.Test;
import ticket.tickets.Price;
import ticket.tickets.Ticket;
import ticket.tickets.TicketId;
import ticketing.api.TestTicketingRepository;
import ticketing.api.TicketingTicketRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TicketAggregatorTest {

    private final MetadataTicketRepository metadataTicketRepository = new TestMetadataRepository();
    private final TicketingTicketRepository ticketingTicketRepository = new TestTicketingRepository();

    private final TicketAggregator ticketAggregator = new TicketAggregator(metadataTicketRepository, ticketingTicketRepository);

    @Test
    void listTickets() {
        // GIVEN
        List<Ticket> expected = getTicketList();
        // WHEN
        List<Ticket> ticketList = ticketAggregator.listTickets();
        // THEN
        assertIterableEquals(expected, ticketList);
    }

    @Test
    void getTicket() {
        // GIVEN
        Ticket expected = null;
        TicketId id = new TicketId("GAULOIS");
        //WHEN
        Ticket ticket = ticketAggregator.getTicket(id);
        //THEN
        assertSame(expected, ticket);
    }

    private List<Ticket> getTicketList() {
        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(getTicketGaulois());
        ticketList.add(getTicketFute());
        ticketList.add(getTicketLiberte());
        return ticketList;
    }

    private Ticket getTicketGaulois() {
        TicketId id = new TicketId("GAULOIS");
        String label = "Le billet gaulois";
        String conditions = "Choisir une date";
        String description = "ce billet permet de venir au Parc à une date donnée";
        BigDecimal priceValue = new BigDecimal(40);
        BigDecimal taxValue = new BigDecimal(4);
        Price price = new Price(priceValue, Currency.getInstance("EUR"), taxValue);
        return new Ticket(id, price, label, conditions, description);
    }

    private Ticket getTicketFute() {
        TicketId id = new TicketId("FUTE");
        String label = "Le billet futé";
        String conditions = "Valable toute l'année sauf noël et halloween";
        String description = "Achetez votre billet maintenant pour venir quand vous le souhaitez, sous conditions";
        BigDecimal priceValue = new BigDecimal(50);
        BigDecimal taxValue = new BigDecimal(5);
        Price price = new Price(priceValue, Currency.getInstance("EUR"), taxValue);
        return new Ticket(id, price, label, conditions, description);
    }

    private Ticket getTicketLiberte() {
        TicketId id = new TicketId("LIBERTE");
        BigDecimal priceValue = new BigDecimal(60);
        BigDecimal taxValue = new BigDecimal(6);
        String label = "Le billet liberté";
        String conditions = "Valable toute l'année même noël et halloween";
        String description = "Achetez votre billet maintenant pour venir quand vous le souhaitez, même les jours de fête";
        Price price = new Price(priceValue, Currency.getInstance("EUR"), taxValue);
        return new Ticket(id, price, label, conditions, description);
    }


}