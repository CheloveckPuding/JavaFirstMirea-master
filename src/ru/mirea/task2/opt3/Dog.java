package ru.mirea.task2.opt3;

public class Dog {
        int ageOfDog;
        String NameOfDog;
        Dog(int ageOfDog, String NameOfDog){
            this.ageOfDog =ageOfDog;
            this.NameOfDog = NameOfDog;
    }
    void GetName(String newNameOfDog){
        NameOfDog=newNameOfDog;
    }
    void GetAge(int newAgeOfDog){
            ageOfDog = newAgeOfDog;
    }
    String GetName(){
            return NameOfDog;
    }
    int GetAge(){
            return ageOfDog;
    }
    static short DogAgeToHumanAge(short ageOfDog) {
        return (short)(7*ageOfDog);
    }
    @Override
    public String toString() {
        return ("Это собака по кличке " + NameOfDog + ". Ей "+ ageOfDog + " лет");
    }

}
