import java.util.ArrayList;
import java.util.List;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;

    }

    public void printLibrettoText(){
        System.out.println("Текст либретто:");
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "musicAuthor='" + musicAuthor;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
