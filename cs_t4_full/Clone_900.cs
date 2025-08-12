private void fillTheListBox (string filePath) {
    List < string > results = new List < string > ();
    string currentLine = string.Empty;
    using (StreamReader sr = new StreamReader (filePath))
    {
        while ((currentLine = sr.ReadLine ()) != null) {
            foreach (string item in currentLine.Split (',')) {
                results.Add (item);
            }
        }
    } lstbx.DataSource = results;
}


 private void fillTheListBox (string filePath) 
{
    List < string > results = new List < string > ();
    String allLines = File.ReadAllText(filePath);
    string[] lines = allLines.Split('\n');
    foreach (string line in lines) 
    {
        string[] elements = line.Split(','); 
        foreach(String element in elements) 
        {
            results.Add (element); 
        }
    }
    lstbx.DataSource = results;
    lstbx.DataBind();
}


