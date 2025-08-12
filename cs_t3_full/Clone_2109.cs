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
    string filePathstr = string.Join(" ", args);
    using(Application ap = new Application())
    {
        try
        {
            var document = ap.Documents.Open(filePathstr);
            foreach (Field field in document.Fields)
            {
                field.Update();
            }
            document.Save();
            document.Close();
        }
        catch (NullReferenceException)
        {
            MessageBox.Show("A valid file was not selected.");
        }
    }
}


