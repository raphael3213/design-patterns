package org.example.creational.builder;


import java.time.LocalDate;
import java.time.Period;

public class UserWebDto {

    private String name;
    private Integer age;

    private UserWebDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "UserWebDto{" + "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Ideally, we keep the builder inside the class, we are going to build, and we try to keep the class going to be
     * build as immutable, either by keeping the setters private or the constructors private.
     * This way, only the builder can manipulate the object, since its a static class defined in the Main class.
     * */
    static class UserWebDtoBuilder implements UserDtoBuilder<UserWebDto>{

        private UserWebDto dto;

        private String firstName;
        private String lastName;
        private Integer age;


        @Override
        public UserWebDto build() {
            return new UserWebDto(firstName + lastName, age);
        }

        @Override
        public UserWebDto getDto() {
            return this.dto;
        }

        public UserWebDtoBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserWebDtoBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserWebDtoBuilder birthday(LocalDate birthday){
            this.age = Period.between(birthday, LocalDate.now()).getYears();
            return this;
        }

    }
}
