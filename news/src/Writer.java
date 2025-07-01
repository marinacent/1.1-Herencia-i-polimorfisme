import java.util.ArrayList;

public class Writer {
    private String name;
    private final int dni;
    private static int salary = 1500;
    private ArrayList<NewsReport> writerNews;

    Writer(String name, int dni) {
        this.name = name;
        this.dni = dni;
        this.writerNews = new ArrayList<>();
    }

}
