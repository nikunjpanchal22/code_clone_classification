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
    bool con = true;
    while(con)
    {
        displayMenu();
        choice = getChoice();
        if (choice == "10")
        {
            con = false; 
        }
    }
    Console.ReadLine();
}


