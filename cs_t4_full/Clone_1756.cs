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


	static void Main(string[] args)
{
    string choice;
    displayMenu();
    choice = getChoice();

    while (choice != "10")
    {
        choice = getChoice();
    }

    Console.ReadLine();
}


