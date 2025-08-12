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
	    string content = File.ReadAllText(@"path_to_excel_archive");
	    Console.WriteLine(content);
	    var sortedWords = content.Split(';').OrderBy(word => word).ToArray();
	    Console.WriteLine(string.Join(Environment.NewLine, sortedWords));
	    File.WriteAllLines(@"path_to_.txt", sortedWords);
}


