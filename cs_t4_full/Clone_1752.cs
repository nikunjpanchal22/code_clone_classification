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


	static void Main (string [] args) 
{
    string choice;
    bool endLoop = false;

    do 
    {
        displayMenu();
        choice = getChoice();
        if (choice == "10") endLoop = true;
    } 
    while (endLoop == false);

    Console.ReadLine ();
}


