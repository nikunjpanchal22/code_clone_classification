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
    Chihuahua chihuahua = new Chihuahua();
    Thoroughbred thoroughbred = new Thoroughbred();
    Animal animal = chihuahua;
    Animal horseAnimal = new Thoroughbred();
    Chihuahua upcastedAnimal = upcastToChihuahua(animal);
    chihuahua.saySomething ();
    chihuahua.getTheBall ();
    upcastedAnimal.saySomething ();
    upcastedAnimal.getTheBall ();
    thoroughbred.saySomething ();
    thoroughbred.getTheBall ();
    try {
        Chihuahua upcastedChihuahua = upcastToChihuahua(horseAnimal);
    } catch (Exception ex) {
        System.out.println (ex.getClass ().getSimpleName () + ": Obviously a horse is not a chihuahua!");
    }
}
