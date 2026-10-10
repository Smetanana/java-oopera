public class Director extends Person {
    int numberOfShows;
    //private Person.Gender gender;

    public Director(String name, String surname, Person.Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (поставлено спектаклей: " + numberOfShows + ")";
    }

}