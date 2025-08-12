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




private static void askUserToGuess(int num)
{
    Console.WriteLine("Type a letter: ");
    var userGuess = (Console.ReadLine()[0]);
    for (int index = 0; index < HiddenWord.Length; index++)
    {
        if (HiddenWord[index] == userGuess && dashes[index] != userGuess)
        {
            num++;
            dashes[index] = userGuess;
            dashes.ToList().ForEach(x => Console.Write(x + " "));
        }
    }
    if (num < dashes.Length)
        askUserToGuess(num);
}


