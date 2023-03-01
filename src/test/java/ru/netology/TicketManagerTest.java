package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicketManagerTest {

    @Test

    public void singleTicketSearch() { //Найдено несколько билетов

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 12_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket2 = new Ticket(2, 5_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket3 = new Ticket(3, 85_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket4 = new Ticket(4, 11_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket5 = new Ticket(5, 6_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket6 = new Ticket(6, 93_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket7 = new Ticket(7, 14_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket8 = new Ticket(8, 4_000, "MOW", "LED", 75);      //Москва - Санкт-Петербург
        Ticket ticket9 = new Ticket(9, 13_000, "KJA ", "DYU", 240);   //Красноярск — Душанбе
        Ticket ticket10 = new Ticket(10, 12_000, "MOW", "AER", 225);    //Москва - Сочи
        Ticket ticket11 = new Ticket(11, 12_300, "MOW", "AER", 225);    //Москва - Сочи

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);

        Ticket[] actual = manager.findAll("MOW", "AER");
        Ticket[] expected = {ticket4, ticket1, ticket10, ticket11, ticket7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void noTicketsFound() {  //Ни найдено ни одного билета

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 12_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket2 = new Ticket(2, 5_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket3 = new Ticket(3, 85_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket4 = new Ticket(4, 11_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket5 = new Ticket(5, 6_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket6 = new Ticket(6, 93_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket7 = new Ticket(7, 14_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket8 = new Ticket(8, 4_000, "MOW", "LED", 75);      //Москва - Санкт-Петербург
        Ticket ticket9 = new Ticket(9, 13_000, "KJA ", "DYU", 240);   //Красноярск — Душанбе
        Ticket ticket10 = new Ticket(10, 12_000, "MOW", "AER", 225);    //Москва - Сочи
        Ticket ticket11 = new Ticket(11, 12_300, "MOW", "AER", 225);    //Москва - Сочи

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);

        Ticket[] actual = manager.findAll("MOW", "DYU");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void foundOneTicket() {   //Найден один билет

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 12_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket2 = new Ticket(2, 5_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket3 = new Ticket(3, 85_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket4 = new Ticket(4, 11_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket5 = new Ticket(5, 6_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket6 = new Ticket(6, 93_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket7 = new Ticket(7, 14_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket8 = new Ticket(8, 4_000, "MOW", "LED", 75);      //Москва - Санкт-Петербург
        Ticket ticket9 = new Ticket(9, 13_000, "KJA ", "DYU", 240);   //Красноярск — Душанбе
        Ticket ticket10 = new Ticket(10, 12_000, "MOW", "AER", 225);  //Москва - Сочи
        Ticket ticket11 = new Ticket(11, 12_300, "MOW", "AER", 225);    //Москва - Сочи

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);

        Ticket[] actual = manager.findAll("KJA ", "DYU");
        Ticket[] expected = {ticket9};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void deletingATicket() {   //Удалить один билет

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, 12_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket2 = new Ticket(2, 5_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket3 = new Ticket(3, 85_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket4 = new Ticket(4, 11_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket5 = new Ticket(5, 6_000, "MOW", "LED", 75);      // Москва - Санкт-Петербург
        Ticket ticket6 = new Ticket(6, 93_000, "DXB", "MEX", 1_260);  // Дубай-Мексика
        Ticket ticket7 = new Ticket(7, 14_000, "MOW", "AER", 225);    // Москва - Сочи
        Ticket ticket8 = new Ticket(8, 4_000, "MOW", "LED", 75);      //Москва - Санкт-Петербург
        Ticket ticket9 = new Ticket(9, 13_000, "KJA ", "DYU", 240);   //Красноярск — Душанбе
        Ticket ticket10 = new Ticket(10, 12_000, "MOW", "AER", 225);  //Москва - Сочи
        Ticket ticket11 = new Ticket(11, 12_300, "MOW", "AER", 225);    //Москва - Сочи

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        repo.remove(3);

        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket4, ticket5, ticket6, ticket7, ticket8, ticket9, ticket10, ticket11};

        Assertions.assertArrayEquals(expected, actual);
    }
}