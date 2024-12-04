package ua.org.dan_bank;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PassportTest {

    @Test
    public void testPassportBuilder() {
        Passport passport = Passport.builder()
                .nationality("Ukraine")
                .issueAt(LocalDate.of(2022, 11, 4))
                .expiryAt(LocalDate.of(2032, 11, 4))
                .authority("State Migration Service")
                .number("AB123456")
                .build();

        assertNotNull(passport);
        assertEquals("Ukraine", passport.getNationality());
        assertEquals(LocalDate.of(2022, 11, 4), passport.getIssueAt());
        assertEquals(LocalDate.of(2032, 11, 4), passport.getExpiryAt());
        assertEquals("State Migration Service", passport.getAuthority());
        assertEquals("AB123456", passport.getNumber());
    }
}