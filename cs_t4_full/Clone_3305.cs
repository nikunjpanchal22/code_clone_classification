public void SelectFiles () {
    int i;
    SelectedFileText.Text = "";
    dlg = new Microsoft.Win32.OpenFileDialog ();
    dlg.Multiselect = true;
    Nullable < bool > result = dlg.ShowDialog ();
    foreach (String filename in dlg.FileNames) {
        SelectedFileText.Text += filename + "\n";
        uploadFileList.Add (filename);
    }
}


// Implementation 2
public void SelectFiles()
{
    SelectedFileText.Text = string.Empty;
    var openFileDialog = new Microsoft.Win32.OpenFileDialog() { Multiselect = true };
    if (openFileDialog.ShowDialog() == true)
    {
        foreach (var file in openFileDialog.FileNames)
        {
            SelectedFileText.Text += $"{file}{Environment.NewLine}";
            uploadFileList.Add(file);
        }
    }
}


