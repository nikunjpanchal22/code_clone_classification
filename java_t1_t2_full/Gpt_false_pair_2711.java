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
    Labrador labrador = new Labrador();
    Fjord fjord = new Fjord();
    Animal animal = labrador;
    Animal horseAnimal = new Fjord();
    Labrador upcastedAnimal = upcastToLabrador(animal);
    labrador.saySomething ();
    labrador.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    fjord.saySomething ();
    fjord.getTheBall ();
    try {
        Labrador upcastedLabrador = upcastToLabrador(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a labrador!");
    }
}
