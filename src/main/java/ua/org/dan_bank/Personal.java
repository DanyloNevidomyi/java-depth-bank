package ua.org.dan_bank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Personal {
    private String firstName;

    private String middleName;

    private String lastName;

    private String sex;

    private LocalDate dateOfBirth;
}