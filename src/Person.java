public class Person {
    private String name;
    private String surname;
    private Gender gender;

    public enum Gender {
        MALE,
        FEMALE
    }
    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + gender + ")";
    }

}
