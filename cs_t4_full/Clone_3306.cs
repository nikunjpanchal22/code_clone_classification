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


// Implementation 7
public void SelectFiles()
{
    SelectedFileText.Text = "";
    var dialog = new OpenFileDialog() { Multiselect = true };
    if (dialog.ShowDialog() == DialogResult.OK)
    {
        uploadFileList.AddRange(dialog.FileNames);
        SelectedFileText.Text = string.Join("\n", uploadFileList);
    }
}


