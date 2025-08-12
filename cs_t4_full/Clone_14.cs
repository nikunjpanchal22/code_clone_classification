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
    asInt = false; 
    while (!asInt)
    { 
        Console.Write ("How many people are playing?");
        string line = Console.ReadLine(); 
        try
        { 
            players = Int32.Parse(line); 
            asInt = true; 
        } 
        catch 
        {
            Console.WriteLine ("Please re-enter your value in numbers.\n---------"); 
        } 
    } 
    return players;
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
            if(result >= 1)
            {
                players = result;
                break;
            }
            else
            {
                Console.WriteLine("The input is invalid. Please enter a valid number greater than 0.\n--------");
            }
        }
        else
        {
            Console.WriteLine("The input is invalid. Please enter a valid number.\n--------");
        }
    }

    return players;
}


