package org.briksjakik.homework.homework02;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_constructor_firstName() {
        Person person = new Person("Janusz", "Tłok", 70020349822L);
        assertEquals(person.getFirstName(), "Janusz");
    }

    @Test
    public void test_constructor_surName() {
        Person person = new Person("Janusz", "Tłok", 70020349822L);
        assertEquals(person.getSurName(), "Tłok");
    }

    @Test
    public void test_constructor_pesel() {
        Person person = new Person("Janusz", "Tłok", 70020349822L);
        assertEquals(person.getPesel(), 70020349822L);
    }

    @Test
    public void test_setPesel() {
        Person person = new Person("Janusz", "Tłok", 70020349822L);
        person.setPesel(76020349822L);
        assertEquals(person.getPesel(), 76020349822L);
    }

    @Test
    public void test_setSurName() {
        Person person = new Person("Janusz", "Tłok", 70020349822L);
        person.setSurName("Głowica");
        assertEquals(person.getSurName(), "Głowica");
    }

    @Test
    public void test_setFirstName() {
        Person person = new Person("Janusz", "Tłok", 70020349822L);
        person.setFirstName("Paweł");
        assertEquals(person.getFirstName(), "Paweł");
    }
}
