package himanshu.Ktech;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class ComparableDemo implements Comparable<ComparableDemo> {
    private int id;
    private String name;


    @Override
    public int compareTo(ComparableDemo o) {
        if(this.id<o.getId()){
            return -1;
        }else if(this.id>o.getId()){
            return +1;
        }
        else return 0;
    }
}

class MainDemo{


    public static void main(String[] args) {
        List<ComparableDemo> list = new ArrayList<>(List.of(
                new ComparableDemo(2, "himanshu"),
                new ComparableDemo(9, "mukul"),
                new ComparableDemo(5, "anuj"),
                new ComparableDemo(4, "agrt"),
                new ComparableDemo(8, "agds"),
                new ComparableDemo(3, "agassa"),
                new ComparableDemo(1, "aag")
        ));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Comparator<ComparableDemo> comparator = ((o1, o2) -> {
            if (o1.getId()< o2.getId()){
                return +1;
            }
           else if (o1.getId() > o2.getId()){
                return -1;
            }
           else return 0;
        });


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        list.sort(comparator);
        System.out.println(list);
    }

}