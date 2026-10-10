import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printListOfActors(){
        for (Actor actor: listOfActors){
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + " см)");
        }
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актер " + actor.getName() + " " + actor.getSurname() +
                    " уже участвует в спектакле \"" + title + "\".");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor.getName() + " добавлен в спектакль \"" + title + "\".");
        }
    }
    public void changeActor(Actor newActor, String surnameToReplace) {
        boolean found = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Предупреждение: Актер с фамилией \"" + surnameToReplace + "\" отсутствует в спектакле.");
        }
    }
}