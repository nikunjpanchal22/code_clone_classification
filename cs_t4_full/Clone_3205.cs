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
	    using (StreamReader SR = File.OpenText(@"path_to_excel_archive"))
	    using (StreamWriter SW = File.CreateText(@"path_to_.txt"))
	    {
		string content = SR.ReadToEnd();
		Console.WriteLine(content);
		var words = content.Split(';').OrderBy(w => w);
		foreach (var word in words)
		{
		    Console.WriteLine(word);
		    SW.WriteLine(word);
		}
	    }
}


