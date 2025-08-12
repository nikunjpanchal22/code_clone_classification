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


 private void fillTheListBox(string filePath) {
    List<string> results = new List<string>();
    string[] lines = File.ReadAllLines(filePath);
    foreach (var line in lines) 
    {
        results.AddRange(line.Split(","));
    }
    lstbx.DataSource = results;
}


