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
    Bulldog bulldog = new Bulldog();
    Icelandic icelandic = new Icelandic();
    Animal animal = bulldog;
    Animal horseAnimal = new Icelandic();
    Bulldog upcastedAnimal = upcastToBulldog(animal);
    bulldog.saySomething ();
    bulldog.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    icelandic.saySomething ();
    icelandic.getTheBall ();
    try {
        Bulldog upcastedBulldog = upcastToBulldog(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a bulldog!");
    }
}
