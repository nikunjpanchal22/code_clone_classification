public void PrintRandom () {
    Random r = new Random ();
    int strLength = r.Next (1, 10);
    var sb = new StringBuilder ();
    for (int i = 0; i < strLength; i ++) {
        int whichType = r.Next (0, 3);
        switch (whichType) {
            case 0 :
                sb.Append ((char) (97 + r.Next (0, 26)));
                break;
            case 1 :
                sb.Append ((char) (65 + r.Next (0, 26)));
                break;
            case 2 :
                sb.Append ((char) (48 + r.Next (0, 10)));
                break;
        }
    }
    Console.WriteLine (sb.ToString ());
    Console.ReadLine ();
}


 public void PrintRandom()
    {
        var r = new Random().Next(1, 10); //Create random size of the string
        
        // Pass random size of the string to the RandomString 
        // method and store it in string variable
        var output = RandomString(r);

        // Print the generated random string
        Console.WriteLine($"Generated random string: {output}");
        Console.ReadLine();
    }

    // RandomString method to generate random string 
    // with size of the string as input parameter 
    static string RandomString(int size)
    {
        // Create random object
        var rand = new Random(); 

        // Take 8 character sets 
        var chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
 
        // Create a string array to store the characters
        var output = new char[size];
 
        // Iterate the size passed as input parameter 
        for (int i = 0; i < size; i++)
        {
            // Use Next on random to generate a random index 
            var index = rand.Next(0, chars.Length); 
 
            // Fill the output string with character on 
            // random index generated
            output[i] = chars[index];
        }
 
        // Return the randomly generated string 
        return new string(output);
}


