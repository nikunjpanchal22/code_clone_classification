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
    using (StreamReader sr = File.OpenText (filePath))
    {
        while (!sr.EndOfStream) {
            currentLine = sr.ReadLine ();
            string [] items = currentLine.Split (',');
            for (int i = 0; i < items.Length; i++) {
                results.Add (items[i]);
            }
        }
    } lstbx.DataSource = results;
}


