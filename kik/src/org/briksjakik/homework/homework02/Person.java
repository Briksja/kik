package org.briksjakik.homework.homework02;

import java.util.Objects;

public class Person implements IPerson {

    private long pesel;
    private String firstName;
    private String surName;

    public Person(String firstName, String surName, long pesel) {
        setPesel(pesel);
        setFirstName(firstName);
        setSurName(surName);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pesel == person.pesel &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(surName, person.surName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pesel, firstName, surName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel=" + pesel +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
