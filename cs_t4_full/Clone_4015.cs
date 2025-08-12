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


 public static int GetPlayers () {
    int players;
    Console.Write("How many people are playing?");
    while (true) {
        string input = Console.ReadLine();
        if (Int32.TryParse(input, out players)) {
            if (players > 0){
                break;
            } else { 
                Console.Write("Incorrect input. Please enter a valid number of players.");
            }
        }
    }
    return players;
}


