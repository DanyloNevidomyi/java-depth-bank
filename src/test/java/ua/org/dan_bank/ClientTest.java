package ua.org.dan_bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class ClientTest {

    @Test
    public void testClientBuilder() {
        Contact contact = new Contact("0981234567", "support@dan-bank.org.ua");
        Bank bank = Bank.builder()
                .id(194234L)
                .name("Dan-Bank")
                .website("www.dan-bank.org.ua")
                .contact(contact)
                .build();

        Personal personal = Personal.builder()
                .firstName("Danylo")
                .middleName("Oleksandrovych")
                .lastName("Nevidomyi")
                .sex("Male")
                .dateOfBirth(LocalDate.of(2004, 7, 14))
                .build();

        Passport passport = Passport.builder()
                .nationality("Ukraine")
                .issueAt(LocalDate.of(2022, 11, 4))
                .expiryAt(LocalDate.of(2032, 11, 4))
                .authority("State Migration Service")
                .number("AB123456")
                .build();

        Client client = Client.builder()
                .bank(bank)
                .personal(personal)
                .passport(passport)
                .build();

        assertNotNull(client);
        assertEquals(bank, client.getBank());
        assertEquals(personal, client.getPersonal());
        assertEquals(passport, client.getPassport());
    }

}