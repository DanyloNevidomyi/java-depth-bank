package ua.org.dan_bank;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Об'єкт Bank
        var bank = Bank.builder()
                .id(194234L)
                .name("Dan-Bank")
                .website("www.dan-bank.org.ua")
                .contact(new Contact("0981234567", "support@dan-bank.org.ua"))
                .build();

        System.out.println(bank);
        System.out.println("-------------------------------------------");

        // Об'єкт Personal
        var personal = Personal.builder()
                .firstName("Danylo")
                .middleName("Oleksandrovych")
                .lastName("Nevidomyi")
                .sex("Male")
                .dateOfBirth(LocalDate.of(2004, 7, 14))
                .build();

        // Об'єкт Passport
        var passport = Passport.builder()
                .nationality("Ukraine")
                .issueAt(LocalDate.of(2022, 11, 4))
                .expiryAt(LocalDate.of(2032, 11, 4))
                .authority("State Migration Service")
                .number("AB123456")
                .build();

        // Об'єкт Client
        var client = Client.builder()
                .bank(bank)
                .personal(personal)
                .passport(passport)
                .build();

        System.out.println(client);
    }
}
