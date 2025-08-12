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
	try {
		players = int.Parse(Console.ReadLine());
			if (players < 0)
			{ 
				throw new Exception("The number must be positive.");
			}
			return players;
		}
		catch (FormatException)
		{
			Console.Write("Incorrect input. Please enter a valid number of players.");
			return GetPlayers();
		}
	}

 public static int GetPlayers () {
    int players = 0;
    Console.Write("How many people are playing?");
    try {
        players = Convert.ToInt32(Console.ReadLine());
        if (players < 0)
        { 
            throw new Exception("The number must be positive.");
        }
        return players;
    }
    catch (FormatException)
    {
        Console.Write("Incorrect input. Please enter a valid number of players.");
        return GetPlayers();
    }
}


