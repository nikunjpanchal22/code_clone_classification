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


 public void fillTheListBox (string filePath) 
{
    List < string > results = new List < string > ();
    string line;
    using (StreamReader sr = new StreamReader (filePath))
    {
        while ((line = sr.ReadLine ()) != null) 
        {
            string[] values = line.Split (',');
            for (int i = 0; i < values.Length; i++)
            {
                results.Add (values[i]);
            }
        }
    } 
    lstbx.DataSource = results;
    lstbx.DataBind();
}


