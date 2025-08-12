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


 public static void Main(String[] args)
{
    int result = 1;
    int numToCheck = 141234;
    bool found = false;
    int i = 0;
    while (i < 15 && !found)
    {
        if (numToCheck == result)
        {
            found = true;
        }
        result *= 2;
        i++;
    }
    if (found)
    {
        Console.WriteLine("Awesome");
    }
}


