public class Person {

    private String name;
    private int birthYear;

    public Person(String inName, int inBirthYear) {
        name = inName;
        birthYear = inBirthYear;

    }

    /**
     * Returns the string representation of the object.
     *
     * @return a string representation of the object
     */
    public String toString() {
        return "Person[name=" + name + ",birthYear=" + birthYear + "]";
    }


}
