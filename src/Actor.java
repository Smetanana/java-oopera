import java.util.Objects;

public class Actor extends Person {
    public double height;
    //private Person.Gender gender;

    public Actor(String name, String surname, Person.Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    //public Person.Gender getGender() {
    //return gender;
    //}

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (рост: " + height + " м)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(actor.height, height) == 0 &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname());
    }
}
