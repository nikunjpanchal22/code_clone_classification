private static void askUserToGuess (int count) {
    Console.WriteLine ("Enter a letter");
    char letter = char.Parse (Console.ReadLine ());
    for (int i = 0; i < HiddenWord.Length; i ++) {
        if ((HiddenWord [i] == letter) && (dashes [i] != letter)) {
            count ++;
            dashes [i] = letter;
            for (int j = 0; j < dashes.Length; j ++) {
                Console.Write (dashes [j] + " ");
            }
        }
    }
    if (count < dashes.Length)
        askUserToGuess (count);
}


 

private static void askUserToGuess(int total)
{
    Console.WriteLine("Put a letter: ");
    char guess = Console.ReadKey().KeyChar;
    for (int cnt = 0; cnt < HiddenWord.Length; cnt++)
    {
        if (HiddenWord[cnt] == guess && dashes[cnt] != guess)
        {
            total++;
            dashes[cnt] = guess;
            Array.ForEach(dashes, x => Console.Write(x + " "));
        }
    }
    if (total < dashes.Length)
        askUserToGuess(total);
}


