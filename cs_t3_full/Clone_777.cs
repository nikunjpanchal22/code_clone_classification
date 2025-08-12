public static void Main (string [] args) {
    int result = 1;
    int numToCheck = 141234;
    boolean found = false;
    for (int i = 0; i < 15; i ++) {
        if (numToCheck == result) {
            found = true;
            break;
        }
        result *= 2;
    }
    if (found)
        Console.WriteLine ("Awesome");
}


  public static void Main (string [] args) {
    int result = 1;
    int numToCheck = 141234;
    boolean found = false;
    int i = 0;
    while(i < 15){
        if (numToCheck == result) {
            found = true;
            break;
        }
        result = result*2;
        if (result > Math.Pow(2,15))
            break;
        i++;
    }
    if (found)
        Console.WriteLine ("Awesome");
}


