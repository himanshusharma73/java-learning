package himanshu.movieproblem;

import java.util.List;

public class Movies {
    String title;
    String rating;
    List<String> showtime;

    public String getShowTimes(){
        StringBuilder sb = new StringBuilder();
        showtime.forEach(showTime -> sb.append(showTime).append(", "));
        return sb.toString();
    }

    public Movies(String title, String rating, List<String> showtime) {
        this.title = title;
        this.rating = rating;
        this.showtime = showtime;
    }

}
