package himanshu;

import java.util.Objects;

public class Test12 {
    int x=0;
    int y=9;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test12 test12 = (Test12) o;
        return x == test12.x && y == test12.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Test12 t= new Test12();

        System.out.println(t.hashCode());
    }
}

