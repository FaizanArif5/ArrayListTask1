import java.util.Objects;

public class Movie {
    private String title;
    private int year;
    private String genre;
    private int ratings;

    public Movie(String title, int year, String genre, int ratings) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getRatings() {
        return ratings;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", ratings=" + ratings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && ratings == movie.ratings && Objects.equals(title, movie.title) && Objects.equals(genre, movie.genre);
    }

}
