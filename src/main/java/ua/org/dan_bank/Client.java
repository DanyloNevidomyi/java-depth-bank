package ua.org.dan_bank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Client {
    private Bank bank;

    private Personal personal;

    private Passport passport;
}