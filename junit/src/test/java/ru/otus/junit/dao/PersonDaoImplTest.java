package ru.otus.junit.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.junit.domain.Person;

public class PersonDaoImplTest {

    @DisplayName("Check the list of the Persons")
    @Test
    void getByNameTest(){
        Person Jack = new Person(45, "Jack");

    }

    public Person getByName(String name) throws PersonNotFoundException {
        // TODO: реализовать поиск в списке по имени (по технике Test-First)
        // TODO: да, этот метод может бросать Exception, и это нужно покрыть другим тестом
        return null;
    }


}
