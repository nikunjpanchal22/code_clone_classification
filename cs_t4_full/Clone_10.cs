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
    int players = 0; 
    Console.Write("How many people are playing?"); 
    do 
    { 
        try 
        { 
            string input = Console.ReadLine(); 
            players = int.TryParse(input, out players) ? players : 0; 

            if (players == 0) 
            { 
                Console.Write("Invalid input. Please enter a valid number.\n----------"); 
            } 
        } 
        catch (Exception e) 
        { 
            Console.Write("An unexpected error occured.\n----------"); 
        } 
    } while (players == 0); 
    return players; 
} 


