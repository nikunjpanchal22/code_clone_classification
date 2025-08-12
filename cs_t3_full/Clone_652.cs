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
    int vCount = 0;
    List<char> vowels = new List<char>{'a', 'e', 'i', 'o', 'u'};
    Console.WriteLine("Enter a Sentence");
    string sentence = Console.ReadLine().ToLowerInvariant();
    foreach (char letter in sentence) 
    {
        if (vowels.Contains(letter)) 
            vCount++;
    }
    Console.WriteLine("Your total number of vowels is: {0}", vCount);
    Console.ReadLine();
}


