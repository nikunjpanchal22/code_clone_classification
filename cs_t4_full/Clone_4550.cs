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


 private void fillTheListBox (string filePath) {
    List < string > results = new List < string > ();
    string currentLine = string.Empty;
    string [] lines = File.ReadAllLines (filePath);
    Array.ForEach (lines, line => {
        currentLine = line;
        results.AddRange (currentLine.Split (','));
    });
    lstbx.DataSource = results;
}


