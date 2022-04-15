package ticket.aggregator;

import metadata.api.MetadataTicketRepository;
import ticket.tickets.Ticket;
import ticket.tickets.TicketId;
import ticketing.api.TicketingTicketRepository;

import java.util.ArrayList;
import java.util.List;

public class TicketAggregator {

    private MetadataTicketRepository metadataTicketRepository;
    private TicketingTicketRepository ticketingTicketRepository;

    public TicketAggregator(MetadataTicketRepository metadataTicketRepository, TicketingTicketRepository ticketingTicketRepository) {
        this.metadataTicketRepository = metadataTicketRepository;
        this.ticketingTicketRepository = ticketingTicketRepository;
    }

    public List<Ticket> listTickets() {
        // TODO: implement method
        return new ArrayList<Ticket>();
    }

    public Ticket getTicket(TicketId id) {
        // TODO: implement method
        return null;
    }
}
