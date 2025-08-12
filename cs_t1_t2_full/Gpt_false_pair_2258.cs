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


 private static void askUserToGuess (int scoreCounter) {
        Console.WriteLine ("Input a letter");
        char letter = char.Parse (Console.ReadLine ());
        for (int i = 0; i < HiddenWord.Length; i ++) {
            if (HiddenWord [i] == letter && dashes [i] != letter) {
                scoreCounter ++;
                dashes [i] = letter;
                for (int j = 0; j < dashes.Length; j ++) {
                    Console.Write (dashes [j] + " ");
                }
            }
        }
        if (scoreCounter < dashes.Length)
            askUserToGuess (scoreCounter);
}
