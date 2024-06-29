package himanshu.Ktech;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }

    public static boolean isArmStrong(int number) {

        int duplicateNum = number;
        int armStrong = 0;
        while (duplicateNum != 0) {
            armStrong = armStrong + cubeOfEachNumber(duplicateNum % 10);
            duplicateNum = duplicateNum / 10;
        }

        return armStrong == number;

    }

    private static int cubeOfEachNumber(int number) {
        return number * number * number;
    }
}

