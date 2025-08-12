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



 static void Main(){
    int totalVowel = 0;
    HashSet<char> vowels = new HashSet<char>{ 'a', 'e', 'i', 'o', 'u' };
    Console.WriteLine("Enter a Sentence");
    string sentence = Console.ReadLine().ToLowerInvariant();
    char[] letters = sentence.ToCharArray();
    for (int i = 0; i < sentence.Length; i++){
        if (vowels.Contains(letters[i])) {
            totalVowel++;
        }
    }
    Console.WriteLine("Your total number of vowels is: {0}", totalVowel);
    Console.ReadLine();
}
