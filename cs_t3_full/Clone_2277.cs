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




private static void askUserToGuess(int attemptCount)
{
    Console.WriteLine ("Enter a guess: ");
    char letter = char.Parse (Console.ReadLine());
    for (int i = 0; i < HiddenWord.Length; i++)
    {
        if (HiddenWord[i] == letter && dashes[i] != letter)
        {
            attemptCount++;
            dashes[i] = letter;
            foreach (var dash in dashes)
            {
                Console.Write(dash + " ");
            }
        }
    }
    if (attemptCount < dashes.Length)
        askUserToGuess(attemptCount);
}


