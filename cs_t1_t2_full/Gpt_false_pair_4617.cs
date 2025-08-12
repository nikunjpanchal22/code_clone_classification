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
    do
        {
            choice = getChoice ();
            displayMenu ();
        } while (choice != "10");
    {
        Console.ReadLine ();
    }
}
