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
    Console.Write("How many players?: ");
    while (true)
    {
        string input = Console.ReadLine();
        if (Int32.TryParse(input, out int result))
        {
            players = result;
            break;
        }
        else
        {
            Console.WriteLine("The input is invalid. Please enter a valid number greater than 0.\n--------");
        }
    }

    return players;
}


