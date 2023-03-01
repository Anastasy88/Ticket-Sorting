package ru.netology;

public class TicketRepository {

    private Ticket[] tickets = new Ticket[0];

    public void add(Ticket ticket) { //  Добавление билета
        Ticket[] tmp = new Ticket[tickets.length + 1];

        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    public void remove(int remove) { // Удаление билета

        Ticket[] tmp = new Ticket[tickets.length - 1];

        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != remove) {
                tmp[index] = ticket;
                index++;
            }
        }
        tickets = tmp;
    }

    public Ticket[] findAll() {  //показать все билеты
        return tickets;
    }
}
