package ru.otus.junit.dao;

import ru.otus.junit.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    // TODO: добавить поле - список Person-ов
    List<Person> PersonList = new ArrayList<>();



    @Override
    public Person getByName(String name) throws PersonNotFoundException {
        // TODO: реализовать поиск в списке по имени (по технике Test-First)
        // TODO: да, этот метод может бросать Exception, и это нужно покрыть другим тестом

        boolean found = false;
        for(int i = 0; i < PersonList.size(); i++)
        {
            if(name == PersonList.get(i).getName()){
                return PersonList.get(i);
            }
        }

        throw new PersonNotFoundException("Person not found");
    }

    @Override
    public List<Person> getAll() {
        // TODO: реализовать получние всех Person (по технике Test-First)
        return PersonList;
    }

    @Override
    public void deleteByName(String name) throws PersonNotFoundException {

        boolean deleted = false;
        for(int i = 0; i < PersonList.size(); i++)
        {
            if(name == PersonList.get(i).getName()){
                PersonList.remove(i);
                deleted = true;
                break;
            }
        }
        if(!deleted){
            throw new PersonNotFoundException("Person not found");
        }

        // TODO: реализовать удаление по имени (по технике Test-First)
        // TODO: да, этот метод может бросать Exception, и это нужно покрыть другим тестом
    }

    @Override
    public void save(Person person) {

        // TODO: этот метод должен найти по имени в списке
        // TODO: если такой есть - заменить
        // TODO: если такого нет - добавить

        boolean saved = false;
        for(int i = 0; i < PersonList.size(); i++)
        {
            if(person.getName() == PersonList.get(i).getName()){
                PersonList.remove(i);
                PersonList.add(person);
                saved = true;
                break;
            }
        }

        if(!saved){
            PersonList.add(person);
        }
    }
}
