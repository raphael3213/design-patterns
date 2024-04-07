package org.example.creational.builder;

public interface UserDtoBuilder<T> {

    T build();

    T getDto();
}
