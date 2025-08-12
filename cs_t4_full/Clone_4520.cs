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


 public static void Main (string [] args)
{
    int result = 1;
    int numToCheck = 141234;
    bool found = false;
    int i = 0;
    while (!found && i < 15)
    {
        result = result << 1;
        if (numToCheck == result) 
        {
            found = true;
        }
        i++;
    }
    if (found)
    {
        Console.WriteLine("Awesome");
    }

}


