static void Main (string [] args) {
    string [] ahri = {"Academy", "Challenger", "Dynasty", "Foxfire", "Midnight", "Popstar"};
    string [] leeSin = {"Traditional", "Acolyte", "Dragon Fist", "Musy Thai", "Pool Party", "SKT T1", "Knockout"};
    Console.WriteLine ("Conor's Random League of Legends Skin Selector v0.1");
    Console.WriteLine (" ");
    Console.WriteLine (" ");
    Random rnd = new Random ();
    Console.ForegroundColor = ConsoleColor.Gray;
    Console.WriteLine ("What champion would you like to select a skin for?..    ");
    string champion = Console.ReadLine ();
    Console.Write ("Press the 'enter' key for a random champion..     ");
    string question = Console.ReadLine ();
    if (champion == "ahri") {
        int randomNumber = rnd.Next (ahri.Length - 1);
        Console.WriteLine (ahri [randomNumber]);
    } else {
        int randomNumber = rnd.Next (leeSin.Length - 1);
        Console.WriteLine (leeSin [randomNumber]);
    }
}


 static void Main (string [] args) { 
    string [] ahri = {"Academy", "Challenger", "Dynasty", "Foxfire", "Midnight", "Popstar"}; 
    string [] leeSin = {"Traditional", "Acolyte", "Dragon Fist", "Musy Thai", "Pool Party", "SKT T1", "Knockout"}; 
    Console.WriteLine ("Conor's Random League of Legends Skin Selector v0.1"); 
    Console.WriteLine (" "); 
    Console.WriteLine (" "); 
    Random rnd = new Random (); 
    Console.ForegroundColor = ConsoleColor.Gray; 
    Console.WriteLine ("What champion would you like to select a skin for?..    "); 
    string champion = Console.ReadLine (); 
    Console.Write ("Press the 'enter' key for a random champion..     "); 
    string question = Console.ReadLine (); 
    if (champion == "Ahri" || champion == "ahri" || question == ""){ 
        int randomNumber = rnd.Next (ahri.Length); 
        Console.WriteLine (ahri [randomNumber]); 
    } else if(champion == "LeeSin" || champion == "Lee sin" || champion == "leasin" || champion == "leesin") { 
        int randomNumber = rnd.Next (leeSin.Length); 
        Console.WriteLine (leeSin [randomNumber]); 
    } else if (question == ""){ 
        int randomNumber = rnd.Next (2); 
        while (true){ 
            if (randomNumber == 0) { 
                int randomNumber2 = rnd.Next (ahri.Length); 
                Console.WriteLine (ahri [randomNumber2]); 
                break; 
            } 
            else if (randomNumber == 1){ 
                int randomNumber2 = rnd.Next (leeSin.Length); 
                Console.WriteLine (leeSin [randomNumber2]); 
                break; 
            } 
        } 
    } else{ 
        Console.WriteLine("Invalid input\n"); 
    } 
} 


