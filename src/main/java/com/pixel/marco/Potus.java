package com.pixel.marco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Potus {

    private String firstName;
    private String lastName;
    private int electionYear;
    private String party;
}
