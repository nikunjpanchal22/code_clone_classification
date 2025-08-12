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
    List < Tablet > tablets = new List < Tablet > ();
    bool shouldContinue = true;
    do
        {
            tablets.Add (GetTablet ());
            Console.Write ("Would like to process another tablet? [Y or n]: ", shouldContinue);
            shouldContinue = Console.ReadLine ().ToUpper () == "Y";
        } while (shouldContinue == true);
    if (shouldContinue == false) {
        DisplayTablets (tablets);
    }
}
