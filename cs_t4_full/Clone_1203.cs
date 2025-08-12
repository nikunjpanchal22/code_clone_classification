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
    string idPath = @"the path here for the excel archive";
    string content = string.Empty;
    string result = "";

    using (StreamReader sr = File.OpenText(idPath)) 
    {
        while ((content = sr.ReadLine()) != null)
        {
            Console.WriteLine(content);
            string[] words = content.Split(';');
            Array.Sort(words);
            foreach (string word in words) 
            {
                result += word + ";";
                Console.WriteLine(word);
            }
        }
    }
    StreamWriter outputFile = new StreamWriter(@"the path here for the .txt");
    outputFile.WriteLine(result);
    outputFile.Close();
}


