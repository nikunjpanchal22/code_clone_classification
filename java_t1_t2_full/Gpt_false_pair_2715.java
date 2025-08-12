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
    Dalmatian dalmatian = new Dalmatian();
    Appaloosa appaloosa = new Appaloosa();
    Animal animal = dalmatian;
    Animal horseAnimal = new Appaloosa();
    Dalmatian upcastedAnimal = upcastToDalmatian(animal);
    dalmatian.saySomething ();
    dalmatian.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    appaloosa.saySomething ();
    appaloosa.getTheBall ();
    try {
        Dalmatian upcastedDalmatian = upcastToDalmatian(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a dalmatian!");
    }
}
