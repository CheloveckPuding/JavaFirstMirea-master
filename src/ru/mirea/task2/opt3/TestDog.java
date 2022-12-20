package ru.mirea.task2.opt3;
import java.util.Scanner;
public class TestDog {
    public static void main(String[] args) {
        Dog[] arr;
        arr = CreateDogArr();
        for(Dog obj: arr) {
            System.out.println(obj.toString());
            System.out.println("Её \"человеческий\" возраст: "+ Dog.DogAgeToHumanAge((short) obj.GetAge()) + "\n\n");
        }
    }
    static Dog[] CreateDogArr() {
        System.out.print("Введите кол-во собак: ");
        Scanner in = new Scanner(System.in);
        int num;
        num = in.nextInt();
        Dog[] arr = new Dog[num];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Введите имя собаки и её возраст: ");
            String name;
            short age;
            name = in.next();
            age = in.nextShort();
            arr[i] = new Dog(age, name);
        }
        return arr;
    }
}
