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
    bool canContinue = false;

    while (!canContinue)
    {
        displayMenu();
        choice = getChoice();

        if (choice == "10")
        {
            canContinue = true;
        }
    }

    Console.ReadLine();
}


