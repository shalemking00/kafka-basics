package com.shalemking.springbootkafka.payload;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private int id;
    private String firstName;
    private String lastName;

}
