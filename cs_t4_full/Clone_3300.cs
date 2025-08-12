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


// Implementation 9
public void SelectFiles()
{
    SelectedFileText.Clear();
    Microsoft.Win32.OpenFileDialog fileDialog = new Microsoft.Win32.OpenFileDialog();

    fileDialog.Multiselect = true;

    bool? showDialog = fileDialog.ShowDialog();

    if (showDialog == true)
    {
        SelectedFileText.Text = String.Join("\n", fileDialog.FileNames);
        uploadFileList.AddRange(fileDialog.FileNames);
    }
}


