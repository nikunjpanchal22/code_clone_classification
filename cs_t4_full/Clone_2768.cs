static void Main (string [] args) {
    List < string > path = new List < string > (args);
    string filePathstr = string.Join (" ", path.ToArray ());
    string folderPathstr = Path.GetDirectoryName (filePathstr);
    try {
        Application ap = new Application ();
        Document document = ap.Documents.Open (filePathstr);
        foreach (Field field in document.GetAllFields ()) {
            field.Update ();
        }
        document.Save ();
        document.Close ();
    }
    catch (NullReferenceException) {
        System.Windows.Forms.MessageBox.Show ("A valid file was not selected.");
    }
}



 

static void Main(string[] args)
{
    var filePathstr = args.Single();
    
    if (!File.Exists(filePathstr))
        throw new ArgumentException("File not found");
        
    var ap = new Application();
    try
    {
        var document = ap.Documents.Open(filePathstr);
        document.Fields.Cast<Field>().ToList().ForEach(f => f.Update());
        document.Save();
        document.Close();
    }
    finally
    {
        ap.Quit();
    }
}


