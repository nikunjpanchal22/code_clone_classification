static void Main (string [] args) {
    string choice = "";
    displayMenu ();
    do
        {
            choice = getChoice ();
        } while (choice != "10");
    {
        Console.ReadLine ();
    }
}


static void Main (string [] args) {
    string choice = "";
    displayMenu ();
    do
    {
        if(choice == "10")
        {
            break;
        }
        else
        {
            choice = getChoice ();
        }
    } while (choice != "10");
    {
        Console.ReadLine ();
    }
}
