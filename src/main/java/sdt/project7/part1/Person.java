package sdt.project7.part1;

public class Person implements Comparable<Person> {
    private int birthYear;

    public Person(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.birthYear, other.birthYear);
    }

    @Override
    public String toString() {
        return "Person{" + "birthYear=" + birthYear + '}';
    }
} 