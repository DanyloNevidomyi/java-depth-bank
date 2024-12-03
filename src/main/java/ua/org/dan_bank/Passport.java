package ua.org.dan_bank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Passport {
    private String nationality;

    private LocalDate issueAt;

    private LocalDate expiryAt;

    private String authority;

    private String number;
}