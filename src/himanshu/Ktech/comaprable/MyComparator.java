package himanshu.Ktech.comaprable;

import himanshu.Ktech.comaprable.Employee;

import java.util.Comparator;

class MyComparator implements Comparator<Employee>{

    int accTo;

    MyComparator(int accTo){
        this.accTo=accTo;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        switch (accTo){
            case 1 : if(o1.getDateOfJoining().isBefore(o2.getDateOfJoining())){
                return  -1;
            }
            else if(o1.getDateOfJoining().isAfter(o2.getDateOfJoining())){
                return +1;
            }
            else return 0;
            case 2 : if(o1.getId()<o2.getId()){
                return  -1;
            }
            else if(o1.getId()>o2.getId()){
                return +1;
            }
            else return 0;
            case 3 : return o1.getName().compareTo(o2.getName());

            default: return 0;
        }

    }
}