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
    Console.WriteLine ("Your letter: ");
    char userInput = Console.ReadLine()[0];
    for(int position = 0; position < HiddenWord.Length; position++)
    {
        if(HiddenWord[position] == userInput && dashes[position] != userInput)
        {
            count++;
            dashes[position] = userInput;
            dashes.ToList().ForEach(element => Console.Write(element + " "));
        }
    }
    if(count < dashes.Length)
        askUserToGuess(count);
}


