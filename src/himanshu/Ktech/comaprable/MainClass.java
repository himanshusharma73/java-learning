package himanshu.Ktech.comaprable;

import himanshu.Ktech.comaprable.Employee;
import himanshu.Ktech.comaprable.MyComparator;

import java.time.LocalDate;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employees = getEmployees();

        while (true){
            Scanner sc=new Scanner(System.in);
            int accTO;
            System.out.println("Enter Sequence");
            accTO=sc.nextInt();
            employees.sort(new MyComparator(accTO));
            employees.forEach(System.out::print);

        }
        /*System.out.println("Sorting using Comparator");
        Collections.sort(employees,new MyComparator());
        employees.forEach(System.out::print);
        System.out.println();*/

       /* System.out.println("Sorting using Comparable");
        Collections.sort(employees);
        employees.forEach(System.out::print);
        System.out.println();

        Comparator<Employee> myCompareToI= (o1,o2) ->{
            if(o1.getDateOfJoining().isBefore(o2.getDateOfJoining())){
                return  -1;
            }
            else if(o1.getDateOfJoining().isAfter(o2.getDateOfJoining())){
                return +1;
            }
            else return 0;
        };

        System.out.println("Sorting using Lambda");
        Collections.sort(employees,myCompareToI);
        employees.forEach(System.out::print);
        System.out.println();
*/
    }

    private static List<Employee> getEmployees() {
        Employee e=new Employee(1, LocalDate.of(2023,3,14),"Aaaa");
        Employee e1=new Employee(6, LocalDate.of(2024,3,25),"Baaa");
        Employee e2=new Employee(3, LocalDate.of(2024,3,16),"Cccc");
        Employee e3=new Employee(4, LocalDate.of(2024,3,18),"Ddddd");
        Employee e4=new Employee(5, LocalDate.of(2024,3,20),"Eeeee");
        Employee e5=new Employee(2, LocalDate.of(2023,3,30),"Ffff");

        List<Employee> employees=new ArrayList<>();

        employees.add(e);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        return employees;
    }

}

