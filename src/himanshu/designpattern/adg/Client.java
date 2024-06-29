package himanshu.designpattern.adg;

import himanshu.designpattern.creatinal.factory.Os;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("Enter your os");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        OperatingFactory.getOS(st).spec();

    }
}
