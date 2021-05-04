package ru.otus.junit.dao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.otus.junit.domain.Person;
import ru.otus.junit.service.PersonService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PersonDaoImplTest {


    @Mock
    private PersonDao personDao;
    private PersonService personService;
    private Person person;

    List<Person> PersonList = new ArrayList<>();

    @Test
    public Person getByName() {
        // TODO: реализовать поиск в списке по имени (по технике Test-First)

        // TODO: используйте eq() mapper вместо any()
        given(personDao.getByName(eq("Ivan")))
                .willReturn(new Person(10, "Ivan"));

        assertThat(personService.getByName("Ivan"))
                .isEqualTo(null); // TODO: сравните с помощью equals
        
        // TODO: да, этот метод может бросать Exception, и это нужно покрыть другим тестом
        return null;
    }


}
