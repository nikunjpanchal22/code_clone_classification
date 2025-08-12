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
	    TryProcessFile(args.SingleOrDefault());
	}

	private void TryProcessFile(string filePath)
	{
	    if (string.IsNullOrWhiteSpace(filePath) || !File.Exists(filePath))
	    {
		MessageBox.Show("A valid file was not selected.");
		return;
	    }

	    using(var ap = new Application())
	    {
		var document = ap.Documents.Open(filePath);

		foreach (Field field in document.Fields)
		{
		    field.Update();
		}

		document.Save();
		document.Close();
	    }
}


