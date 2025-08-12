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
    string currentLine = string.Empty;
    using (StreamReader sr = new StreamReader (filePath))
    {
        while ((currentLine = sr.ReadLine ()) != null) 
        {
            string[] values = currentLine.Split (',');
            for (int i = 0; i < values.Length; i++)
            {
                results.Add (values[i]);
            }
        }
    } 
    lstbx.DataSource = results;
    lstbx.DataBind();
}


