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
    string content = "";
    string result = "";

    using (StreamReader sr = new StreamReader(@"the path here for the excel archive"))
    {
        content = sr.ReadToEnd();
    }

    string[] wordsArray = content.Split(';');
    wordsArray = wordsArray.OrderBy(x => x).ToArray();

    foreach (string word in wordsArray)
    {
        Console.WriteLine(word);
        result += word + ";";
    }

    using (StreamWriter sw = new StreamWriter(@"the path here for the .txt"))
    {
        sw.WriteLine(result);
    }
}


