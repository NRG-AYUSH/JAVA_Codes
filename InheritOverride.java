class Animal {
    void makeSound() {
        System.out.println("Animals make sound");

    }
    void dance(){
        System.out.println("DANCING");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
    void da(){
        System.out.println("Enter the hehehe");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat makes a meow sound");
    }
}


class InheritOverride {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        Cat c = new Cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
        a.dance();
        d.da();
    }
}