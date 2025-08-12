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
    int totalVowels = 0; 
    HashSet<char> vowelList = new HashSet<char> { 'a', 'e', 'i', 'o', 'u' }; 
    Console.WriteLine("Please enter a sentence:"); 
    string sentence = Console.ReadLine().ToLower(); 
    for (int i = 0; i < sentence.Length; i++) 
    {
        if(vowelList.Contains(sentence[i]))
        { 
            totalVowels++; 
        } 
    } 
    Console.WriteLine("Your total number of vowels is: {0}", totalVowels); 
    Console.ReadLine(); 
}
