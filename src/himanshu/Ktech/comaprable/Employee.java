package himanshu.Ktech.comaprable;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    private long id;
    private LocalDate dateOfJoining;
    private String name;

    public Employee(long id, LocalDate dateOfJoining, String name) {
        this.id = id;
        this.dateOfJoining = dateOfJoining;
        this.name = name;
    }

    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dateOfJoining=" + dateOfJoining +
                ", name='" + name + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(Employee o) {
        if(this.getDateOfJoining().isBefore(o.getDateOfJoining())){
            return  -1;
        }
        else if(this.getDateOfJoining().isAfter(o.getDateOfJoining())){
            return +1;
        }
        else return 0;
    }
}
