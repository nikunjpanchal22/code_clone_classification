public static void main (String [] args) {
    Dog dog = new Dog ();
    Horse horse = new Horse ();
    Animal animal = dog;
    Animal horseAnimal = new Horse ();
    Dog upcastedAnimal = upcastToDog (animal);
    dog.saySomething ();
    dog.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    horse.saySomething ();
    horse.getTheBall ();
    try {
        Dog upcastedDog = upcastToDog (horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a dog!");
    }
}




 
public static void main (String [] args) {
    Dog germanShepherd = new Dog();
    Horse mustang = new Horse();

    Animal animal = germanShepherd;
    Animal mustangAnimal = new Horse();

    germanShepherd.bark();
    germanShepherd.fetchBall();
    mustang.neigh();
    mustang.run();
}


