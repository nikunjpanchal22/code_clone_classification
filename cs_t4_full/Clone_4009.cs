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


 public static int GetPlayers ()
{
	int? players;
	Console.Write("How many people are playing?");

	while (players == null)
	{
		try
		{
			players = Convert.ToInt32(Console.ReadLine());
			if (players < 0)
				throw new ArgumentOutOfRangeException("Players cannot be less than 0");
		}
		catch (FormatException fex)
		{
			Console.WriteLine(fex.Message);
		}
		catch (ArgumentOutOfRangeException aoorex)
		{
			Console.WriteLine(aoorex.Message);
		}
		catch (Exception ex)
		{
			Console.WriteLine(ex.Message);
		}
	}
	return players.Value;
}


