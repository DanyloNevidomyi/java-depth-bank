package ua.org.dan_bank;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonalTest {

    @Test
    public void testPersonalBuilder() {
        Personal personal = Personal.builder()
                .firstName("Danylo")
                .middleName("Oleksandrovych")
                .lastName("Nevidomyi")
                .sex("Male")
                .dateOfBirth(LocalDate.of(2004, 7, 14))
                .build();

        assertNotNull(personal);
        assertEquals("Danylo", personal.getFirstName());
        assertEquals("Oleksandrovych", personal.getMiddleName());
        assertEquals("Nevidomyi", personal.getLastName());
        assertEquals("Male", personal.getSex());
        assertEquals(LocalDate.of(2004, 7, 14), personal.getDateOfBirth());
    }

}