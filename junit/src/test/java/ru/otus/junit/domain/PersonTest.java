package ru.otus.junit.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Person")
class PersonTest {

    @DisplayName("корректно создаётся конструктором")
    @Test
    void shouldHaveCorrectConstructor() {
        Person person = new Person(42, "Ivan");

        assertThat("Ivan").isEqualTo(person.getName());
        assertThat(42).isEqualTo(person.getAge());

    }


    @DisplayName("должен")
    @Test
    void correctAgeIncrese(){
        Person person = new Person(42, "Ivan");

        person.birthDay();
        assertEquals("Ivan", person.getName());
        assertEquals(43, person.getAge());
    }

}
