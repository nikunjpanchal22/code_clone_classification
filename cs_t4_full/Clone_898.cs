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
    using (var sr = new StreamReader (filePath))
    {
        while (!sr.EndOfStream)
        {
            var line = sr.ReadLine();
            string[] arr = (line.Split (','));
            foreach (string item in arr)
            {
                results.Add (item);

            } 
        }
        lstbx.DataSource = results;
        lstbx.DataBind();
    }
}


