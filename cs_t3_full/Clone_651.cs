static void Main () {
    int total = 0;
    var vowels = new HashSet < char > {'a', 'e', 'i', 'o', 'u'};
    Console.WriteLine ("Enter a Sentence");
    string sentence = Console.ReadLine ().ToLower ();
    for (int i = 0; i < sentence.Length; i ++) {
        if (vowels.Contains (sentence [i])) {
            total ++;
        }
    }
    Console.WriteLine ("Your total number of vowels is: {0}", total);
    Console.ReadLine ();
}


  static void Main() 
    {
        int totalVowel = 0;
        HashSet<char> vowelSet = new HashSet<char> { 'a', 'e', 'i', 'o', 'u' };
        Console.WriteLine("Enter a sentence:");
        string sentence = Console.ReadLine().ToLower();
        foreach(char letter in sentence) 
        { 
          if(vowelSet.Contains(letter)) 
          { 
            totalVowel++; 
          } 
        } 
        Console.WriteLine("Your total number of vowels is: {0}", totalVowel);
        Console.ReadLine();
    }

 static void Main() 
    {
        int vowelCnt = 0;
        var vowelList = new List<char>{ 'a', 'e', 'i', 'o', 'u' };
        Console.WriteLine("Enter a Sentence");
        string sentence = Console.ReadLine().ToLowerInvariant();
        for (int i = 0; i < sentence.Length; i++){
            if (vowelList.Contains(sentence[i])) 
                vowelCnt++;
        }
        Console.WriteLine("Your total number of vowels is: {0}", vowelCnt);
        Console.ReadLine();
}


