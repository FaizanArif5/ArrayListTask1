import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<Movie> movies= new ArrayList<>();

        System.out.println(movies.size());

      movies.add(new Movie("Movie 1",2010,"Action",7));
        movies.add(new Movie("Movie 2",2015,"Comedy",9));
        movies.add(new Movie("Movie 3",2023,"Action",8));


        for(Movie temp:movies)
            System.out.println(temp);

        movies.remove(new Movie("Movie 2",2015,"Comedy",9));
        System.out.println();

        for(Movie temp:movies)
            System.out.println(temp);

    movies.set(0,new Movie("Movie 4",2018,"Comedy",9));
        System.out.println();
    for(Movie temp:movies)
        System.out.println(temp);

        for(Movie temp:movies)
            temp.setRatings(temp.getRatings()+1);

        System.out.println();
        for(Movie temp:movies)
            System.out.println(temp);


    }
}