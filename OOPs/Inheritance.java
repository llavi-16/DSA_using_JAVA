class Animal{
    void sound(){
        System.out.print("sound like");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println(" dog is barking...");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
        d.bark();

    }
}