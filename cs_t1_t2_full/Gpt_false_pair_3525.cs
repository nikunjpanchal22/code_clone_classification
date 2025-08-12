static void Main (string [] args) {
    List < Phone > phones = new List < Phone > ();
    bool shouldContinue = true;
    do
        {
            phones.Add (GetPhone ());
            Console.Write ("Would like to process another phone? [Y or N]: ", shouldContinue);
            shouldContinue = Console.ReadLine ().ToUpper () == "Y";
        } while (shouldContinue == true);
    if (shouldContinue == false) {
        DisplayPhones (phones);
    }
}


static void Main (string [] args) {
    List < Laptop > laptops = new List < Laptop > ();
    bool shouldContinue = true;
    do
        {
            laptops.Add (GetLaptop ());
            Console.Write ("Would like to process another laptop? [Y or n]: ", shouldContinue);
            shouldContinue = Console.ReadLine ().ToUpper () == "Y";
        } while (shouldContinue == true);
    if (shouldContinue == false) {
        DisplayLaptops (laptops);
    }
}
