static int GetPlayers () {
    int ? players;
    Console.Write ("How many people are playing?");
    while (players == null) {
        try {
            players = Convert.ToInt16 (Console.ReadLine ());
        }
        catch (Exception e) {
            Console.Write (e.Message + "\n" + "----------");
        }
    }
    return players.Value;
}


 static int GetPlayers() 
{ 
    int players = -1; 
   
    do 
    { 
        Console.Write("How many people are playing?"); 
        string input = Console.ReadLine(); 
        if (Int32.TryParse(input, out players)) 
        { 
            if (players < 0) 
            { 
                Console.WriteLine("The input is invalid. Please enter a valid number greater than 0.\n----------"); 
            } 
        } 
        else 
        { 
            Console.WriteLine("The input is invalid. Please enter a valid number.\n----------");
            players = -1;
        }
    } 
    while (players < 0); 
   
    return players; 
} 


