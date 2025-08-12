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
    GoldenRetriever goldenRetriever = new GoldenRetriever();
    Connemara connemara = new Connemara();
    Animal animal = goldenRetriever;
    Animal horseAnimal = new Connemara();
    GoldenRetriever upcastedAnimal = upcastToGoldenRetriever(animal);
    goldenRetriever.saySomething ();
    goldenRetriever.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    connemara.saySomething ();
    connemara.getTheBall ();
    try {
        GoldenRetriever upcastedGoldenRetriever = upcastToGoldenRetriever(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a golden retriever!");
    }
}
