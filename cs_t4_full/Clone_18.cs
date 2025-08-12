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
    int players; 
    Console.Write("How many people are playing?"); 
    string input = Console.ReadLine(); 
    while (!Int32.TryParse(input, out players)) 
    { 
        Console.WriteLine("Invalid input. Please enter a valid number."); 
        input = Console.ReadLine(); 
    } 
    return players; 
} 


