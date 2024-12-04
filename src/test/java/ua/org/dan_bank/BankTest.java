package ua.org.dan_bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    public void testBankBuilder() {
        Contact contact = new Contact("0981234567", "support@dan-bank.org.ua");

        Bank bank = Bank.builder()
                .id(194234L)
                .name("Dan-Bank")
                .website("www.dan-bank.org.ua")
                .contact(contact)
                .build();

        assertNotNull(bank);
        assertEquals("Dan-Bank", bank.getName());
        assertEquals("www.dan-bank.org.ua", bank.getWebsite());
        assertEquals(contact, bank.getContact());
    }

}