package ua.org.dan_bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    public void testContactConstructor() {
        Contact contact = new Contact("0981234567", "support@dan-bank.org.ua");

        assertNotNull(contact);
        assertEquals("0981234567", contact.getPhone());
        assertEquals("support@dan-bank.org.ua", contact.getEmail());
    }

}