public void readArchive () {
    StreamReader SR;
    string S;
    int i = 0;
    SR = File.OpenText (@"the path here for the excel archive");
    S = SR.ReadToEnd ();
    SR.Close ();
    Console.WriteLine (S);
    string [] words = S.Split (';');
    Array.Sort (words);
    for (i = 0; i < words.Length; i ++)
        Console.WriteLine (words [i]);
    StreamWriter SW;
    SW = File.CreateText (@"the path here for the .txt");
    for (i = 0; i < words.Length; i ++)
        SW.WriteLine (words [i]);
    SW.Close ();
}


 public void readArchive()
{
    string[] wordsArray;
    string wordsString;
    List<string> sortedList;

    using (StreamReader sr = File.OpenText(@"the path here for the excel archive"))
    {
        wordsString = sr.ReadToEnd();
        wordsArray = wordsString.Split(';');
    }

    sortedList = wordsArray.OrderBy(x => x).ToList();

    using (StreamWriter sw = File.CreateText(@"the path here for the .txt"))
    {
        foreach (string word in sortedList)
        {
            Console.WriteLine(word);
            sw.WriteLine(word);
        }
    }
}


