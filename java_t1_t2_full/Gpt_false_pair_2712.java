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
    Greyhound greyhound = new Greyhound();
    Clydesdale clydesdale = new Clydesdale();
    Animal animal = greyhound;
    Animal horseAnimal = new Clydesdale();
    Greyhound upcastedAnimal = upcastToGreyhound(animal);
    greyhound.saySomething ();
    greyhound.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    clydesdale.saySomething ();
    clydesdale.getTheBall ();
    try {
        Greyhound upcastedGreyhound = upcastToGreyhound(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a greyhound!");
    }
}
