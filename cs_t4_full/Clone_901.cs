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
    List < string > values = File.ReadAllLines(filePath)
        .SelectMany(x => x.Split(','))
        .ToList();
    lstbx.DataSource = values; 
    lstbx.DataBind();
} 


