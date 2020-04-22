package com.batchprocessing.batchprocessing.processing;

import com.batchprocessing.batchprocessing.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) {

        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();

        final Person changedPerson = new Person(firstName, lastName);
        log.info("Converting("+person+") into ("+changedPerson+")");

        return changedPerson;
    }


}
