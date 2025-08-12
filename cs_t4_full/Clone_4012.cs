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
    int players = 0;
    Console.Write("How many people are playing?");
    while (players == 0) {
        try {
            players = Int32.Parse(Console.ReadLine());
			if (players < 0){
                throw new Exception("The number must be positive.");
            } 
        }
        catch (FormatException)
        {
            Console.Write("Incorrect input. Please enter a valid number of players.");
        }
    }
    return players;
}


