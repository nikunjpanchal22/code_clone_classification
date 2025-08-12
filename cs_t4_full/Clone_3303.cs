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


// Implementation 6
public void SelectFiles()
{
    SelectedFileText.Text = "";
    var dialog = new Microsoft.Win32.OpenFileDialog { Multiselect = true };

    bool? result = dialog.ShowDialog();

    if (result == true)
    {
        uploadFileList.AddRange(dialog.FileNames);
        SelectedFileText.Text = string.Join(Environment.NewLine, uploadFileList);
    }
}


