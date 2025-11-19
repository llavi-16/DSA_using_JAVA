class Animal{
    void sound(){
        System.out.print("sound like....");
    }

}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barking");
    }
}


class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meowing");
    }
}

public class PolyLoad{
    public static void main(String[] args){
        Animal a;
        a = new Dog();
        a.sound();

        
        a = new Cat();
        a.sound();
    }
}