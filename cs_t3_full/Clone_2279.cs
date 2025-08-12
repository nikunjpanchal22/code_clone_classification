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




private static void askUserToGuess(int count)
{
    Console.WriteLine ("Specify a letter: ");
    char letter = char.Parse(Console.ReadLine());
    foreach (char character in HiddenWord)
    {
        if (character == letter && dashes[HiddenWord.IndexOf(character)]!=letter) 
        {
            count++;
            dashes[HiddenWord.IndexOf(character)] = letter;
            dashes.ToList().ForEach(x => Console.Write(x+ " "));
        }
    }
    if (count < dashes.Length)
        askUserToGuess(count);
}


