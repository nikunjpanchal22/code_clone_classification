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
    using (StreamReader sr = File.OpenText(@"path_to_excel_archive"))
    {
        string s = sr.ReadToEnd();
        sr.Close();
        Console.WriteLine(s);
        var words = s.Split(';');
        foreach (var word in words.OrderBy(x => x))
        {
            Console.WriteLine(word);
        }
    }
    File.WriteAllLines(@"path_to_.txt", words.OrderBy(x => x).ToArray());
}


