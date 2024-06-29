package himanshu.interviewproblem;

import java.util.*;
import java.util.stream.Collectors;

public class Top3Student{
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"himanshu",70,"Mechanical"));
        list.add(new Student(2,"shukla",50,"Mechanical"));
        list.add(new Student(3,"abhit",60,"Mechanical"));
        list.add(new Student(4,"anand",67,"Mechanical"));
        list.add(new Student(5,"rahul",75,"Mechanical"));
        list.add(new Student(6,"mahesh",55,"Civil"));
        list.add(new Student(7,"mukesh",65,"Civil"));
        list.add(new Student(8,"satish",72,"Civil"));
        list.add(new Student(9,"ashwin",53,"Civil"));
        list.add(new Student(10,"ssss",70,"Electrical"));
        list.add(new Student(11,"mukul",77,"Electrical"));
        list.add(new Student(12,"ashutosh",70,"Electrical"));
        list.add(new Student(13,"shubham",73,"Electrical"));
        list.add(new Student(14,"aaaa",76,"Electrical"));
        top3Student(list).forEach(System.out::println);

        System.out.println("\n\n**********************\n\n");
        Map<String, List<Student>> collect = list.stream().sorted(Comparator.comparing(Student::getBranch)
                .thenComparing(Student::getPercentage)).collect(Collectors.groupingBy(Student::getBranch));
        collect.forEach((k,v) ->
        {
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }

    public static void top3StudentByBranch(List<Student> list){
        Map<String,List<Student>> map= new HashMap<>();
        list.sort(Comparator.comparing(Student::getPercentage).reversed());

        for (Student student:list){
            map.putIfAbsent(student.getBranch(),new ArrayList<>());
            if (map.get(student.getBranch()).size()<3){
                map.get(student.getBranch()).add(student);
            }
        }

        map.forEach((branch,students) -> {
            System.out.println("Branch "+branch);
            students.forEach(System.out::println);
        }) ;
    }

    public static void top3StudentByBranch1(List<Student> list){
        list.sort(Comparator.comparing(Student::getBranch)
                .thenComparing(Student::getPercentage).reversed());

        int count = 1;
        String currentBranch = "";
        for (Iterator<Student> iterator = list.iterator(); iterator.hasNext();) {
            Student student = iterator.next();
            if (!student.getBranch().equals(currentBranch)) {
                currentBranch = student.getBranch();
                count = 1;
            } else if (count >= 3) {
                iterator.remove();
            } else {
                count++;
            }
        }
        list.forEach(System.out::println);
    }


//    public static List<Student> top3StudentByBranch2(List<Student> list){
//        return list.stream()
//                .sorted(Comparator.comparing(Student::getBranch)
//                        .thenComparing(Student::getPercentage).reversed())
//                .collect(Collectors.groupingBy(Student::getBranch, LinkedHashMap::new, Collectors.toList()))
//                .values().stream()
//                .flatMap(l -> l.stream().limit(3))
//                .collect(Collectors.toList());
//    }

    public static List<Student> top3Student(List<Student> list){
        return list.stream().sorted(Comparator.comparing(Student::getBranch).thenComparing(Student::getPercentage))
                .collect(Collectors.groupingBy(Student::getBranch,LinkedHashMap::new,Collectors.toList()))
                .values().stream().flatMap(l -> l.stream().limit(3)).collect(Collectors.toList());
    }


}
