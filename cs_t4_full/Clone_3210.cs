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
	    using var SR = new StreamReader(@"path_to_excel_archive");
	    string content = SR.ReadToEnd();
	    Console.WriteLine(content);
	    var words = content.Split(';').OrderBy(s => s);
	    Console.WriteLine(string.Join(Environment.NewLine, words));
	    File.WriteAllLines(@"path_to_.txt", words);
}


