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
    string choice = "";
    bool running = true;

    while (running)
    {
        displayMenu();
        choice = getChoice();

        if (choice == "10")
        {
            running = false;
        }
    }

    Console.ReadLine();
}


