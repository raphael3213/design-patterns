package org.example.creational.builder;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        User user = new User("Joel" , "Peter", LocalDate.of(1998, 1 , 7 ));

        UserWebDto userWebDto = new UserWebDto.UserWebDtoBuilder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .birthday(user.getBirthday()).build();

        System.out.println(userWebDto);
    }
}
