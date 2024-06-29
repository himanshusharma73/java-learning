package himanshu.movieproblem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MovieProblem {
    public static void main(String[] args) {

        printFormattedMovies(getMoviesList());

    }

    private static List<Movies> getMoviesList() {
        List<Movies> movies=new ArrayList<>();

        try {
            BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Himanshu Sharma\\Desktop\\test.java\\src\\himanshu\\movie.csv"));
            String line="";
            while ((line=reader.readLine())!=null){
                String[] row=line.split(",");
                String showtime=row[0];
                String title=row[1];
                String rating=row[2];

                Movies duplicateMovie=findDuplicateMovie(movies,title);
                if(duplicateMovie==null){
                    List<String> showtimes = new ArrayList<>();
                    showtimes.add(showtime);
                    movies.add(new Movies(title,rating,showtimes));
                }
                else{
                    duplicateMovie.showtime.add(showtime);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return movies;
    }

    public static Movies findDuplicateMovie(List<Movies> movies, String title){
        for(Movies movie:movies){
            if(movie.title.equals(title)){
                return movie;
            }
        }
        return null;
    }

    public static void printFormattedMovies(List<Movies> movies){
        for (Movies movies1:movies) {
            System.out.printf("%-44.44s | %5s | %s", movies1.title,movies1.rating,movies1.getShowTimes() );
            System.out.println();
        }

    }

}
