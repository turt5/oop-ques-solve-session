package fall_22.q2;

public class Movie {
    private String name;
    protected String origin;
    String genre;
    float rating;

    public String getName() {
        return this.name;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Movie(String name, String origin, String genre, float rating) {
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void Details(){
        System.out.println("You are watching "+this.name);
        System.out.println("Origin: "+this.origin);
        System.out.println("Genre: "+this.genre);
        System.out.println("Rating: "+this.rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
