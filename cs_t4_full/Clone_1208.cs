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

    StreamReader streamReader = new StreamReader(@"the path here for the excel archive");
    wordsString = streamReader.ReadToEnd();
    wordsArray = wordsString.Split(';');
    streamReader.Close();

    sortedList = wordsArray.OrderBy(x => x).ToList();

    StreamWriter streamWriter = new StreamWriter(@"the path here for the .txt");
    foreach (string word in sortedList)
    {
        Console.WriteLine(word);
        streamWriter.WriteLine(word);
    }
    streamWriter.Close();
}


