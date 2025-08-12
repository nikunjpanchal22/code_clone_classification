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
    bool loop = true;

    displayMenu();
    do
    {
        choice = getChoice();
        if(choice == "10")
        {
            loop = false;
        }
    }
    while (loop);

    Console.ReadLine();
}


