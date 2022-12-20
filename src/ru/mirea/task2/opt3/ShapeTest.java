package ru.mirea.task2.opt3;
import java.util.Scanner;
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextLine()) {
            Shape sh = new Shape(scan.nextLine());
            System.out.println(sh.toString());
        }
    }

}
