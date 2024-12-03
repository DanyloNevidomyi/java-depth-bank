package ua.org.dan_bank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Bank {
    private Long id;

    private String name;

    private String website;

    private Contact contact;
}