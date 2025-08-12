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
    ShibaInu shibaInu = new ShibaInu();
    Mustang mustang = new Mustang();
    Animal animal = shibaInu;
    Animal horseAnimal = new Mustang();
    ShibaInu upcastedAnimal = upcastToShibaInu(animal);
    shibaInu.saySomething ();
    shibaInu.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    mustang.saySomething ();
    mustang.getTheBall ();
    try {
        ShibaInu upcastedShibaInu = upcastToShibaInu(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a shiba inu!");
    }
}
