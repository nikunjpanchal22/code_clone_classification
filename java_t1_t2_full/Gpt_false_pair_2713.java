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
    Beagle beagle = new Beagle();
    WelshPony welshPony = new WelshPony();
    Animal animal = beagle;
    Animal horseAnimal = new WelshPony();
    Beagle upcastedAnimal = upcastToBeagle(animal);
    beagle.saySomething ();
    beagle.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    welshPony.saySomething ();
    welshPony.getTheBall ();
    try {
        Beagle upcastedBeagle = upcastToBeagle(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a beagle!");
    }
}
