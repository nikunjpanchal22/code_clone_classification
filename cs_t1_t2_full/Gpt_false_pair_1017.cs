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


 static void Main(string[] args){
            try
            {
                // Create new list and string variables
                List<string> path = new List<string>(args);
                string filePathstr = string.Join(" ", path.ToArray());
                string folderPathstr = Path.GetDirectoryName(filePathstr);

                // Make new application and document
                Application ap = new Application();
                Document document = ap.Documents.Open(filePathstr);

                // Get all fields in the document object
                foreach (Field field in document.GetAllFields())
                {
                    // Update field
                    field.Update();
                }

                // Save the updates document to file
                document.Save();
                document.Close();
            }
            catch (NullReferenceException)
            {
                System.Windows.Forms.MessageBox.Show("A valid file was not selected.");
            }
}
